/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Clases.Cliente;
import Clases.Compra;
import Clases.Empleado;
import Clases.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Melón
 */
public class CompraDAO {
     private Compra miCompra;
    Connection miConexion;
    Statement miSt;  

    public CompraDAO(){}
    
    public CompraDAO(Compra miCompra) {
        this.miCompra = miCompra;
    }
    

    public void InsertCompra(Compra miCompra){
        Connection miConexion;
        miConexion=Conexion.GetConexion();

      
        try{
            Statement miSt=miConexion.createStatement();
            miSt.execute("INSERT INTO compra (com_id, pro_id,emp_id, cli_id,com_valor, com_fecha, com_medioPago) value"
                    + "('"+miCompra.getTranId()+"','"+miCompra.getMiProveedor().getPerID()+"','"+miCompra.getMiEmpleado().getPerID()+"','"+miCompra.getMiCliente().getPerID()+"','"+miCompra.getTranValor()+"', NOW(),'"+miCompra.getTranMedioPago()+"')");
            JOptionPane.showMessageDialog(null,"Compra Realizada");
        }
        catch(SQLException e){
                      JOptionPane.showMessageDialog(null,"Ocurrio un Error al ingresar la compra en la BD" + e);
        }
   }
    
    
       public int GenerarNro(){
            miConexion=Conexion.GetConexion();
          
            int x=0;
            try{
                miSt=miConexion.createStatement();
                ResultSet miRs=miSt.executeQuery("select MAX(com_id) as com_id from compra");
                
                if(miRs.next()){
                x = miRs.getInt("com_id")+1;
                  assert x < 0 : "Numero no debe menos a Cero";
            }    
            
            }    
            catch(SQLException e){
             JOptionPane.showMessageDialog(null,"No pude verificar los datos de compra "+e);
        
            }
            return x;
    }
            
         
    public Compra getCompra(){
        miConexion=Conexion.GetConexion();
        Proveedor miProveedor = new Proveedor();
        miCompra.setMiProveedor(miProveedor);
        Cliente miCliente = new Cliente();
        miCompra.setMiCliente(miCliente);
        Empleado miEmpleado = new Empleado();
        miCompra.setMiEmpleado(miEmpleado);

        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from compra,cliente,empleado,proveedor where com_id='"+miCompra.getTranId()+"' and empleado.emp_id=compra.emp_id and cliente.cli_id=compra.cli_id and compra.pro_id = proveedor.pro_id");
            miRs.first();
            miCompra.setTranId(miRs.getString("com_id"));
            miCompra.getMiProveedor().setPerID(miRs.getString("pro_id"));
            miCompra.getMiProveedor().setPerNombre(miRs.getString("pro_nombre"));            
            miCompra.getMiEmpleado().setPerID(miRs.getString("emp_id"));
            miCompra.getMiEmpleado().setPerNombre(miRs.getString("emp_nombre"));
            miCompra.getMiCliente().setPerID(miRs.getString("cli_id"));
            miCompra.getMiCliente().setPerNombre(miRs.getString("cli_nombre"));            
            miCompra.setTranValor(miRs.getString("com_valor"));
            miCompra.setTranFecha(miRs.getString("com_fecha"));
            miCompra.setTranMedioPago(miRs.getString("com_medioPago"));
            assert miCompra == null : "Compra con datos vacios";

                return (miCompra);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No puede verificar la compra"+ e);
            return(null);
        }
    } 
        
        public boolean siExiste(){
        miConexion=Conexion.GetConexion();
        boolean bandera=false;
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from compra where com_id='"+miCompra.getTranId()+"'");
            if(miRs.next()){                
                bandera=true;
        }
            miConexion.close();
        }   
        catch(SQLException e){
             JOptionPane.showMessageDialog(null,"No pude verificar los datos de la compra "+e);
             bandera=true;            
        }
        finally{
            return(bandera);
        }
         
    }
    
    
}
