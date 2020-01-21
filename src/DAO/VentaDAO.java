/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Clases.Cliente;
import Clases.DetVenta;
import Clases.Empleado;
import Clases.Proveedor;
import Clases.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Melón
 */
public class VentaDAO {
    private Venta miVenta;
    Connection miConexion;
    Statement miSt;
    
    public VentaDAO(){
    }
    
    public VentaDAO(Venta miVenta){
        this.miVenta=miVenta;
    }
    
        public Venta getVenta(){
        miConexion=Conexion.GetConexion();
        Proveedor miProveedor = new Proveedor();
        miVenta.setMiProveedor(miProveedor);
        Cliente miCliente = new Cliente();
        miVenta.setMiCliente(miCliente);
        Empleado miEmpleado = new Empleado();
        miVenta.setMiEmpleado(miEmpleado);

        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from venta,cliente,empleado,proveedor where ven_id='"+miVenta.getTranId()+"' and empleado.emp_id=venta.emp_id and cliente.cli_id=venta.cli_id AND venta.pro_id = proveedor.pro_id");
            miRs.first();
            miVenta.setTranId(miRs.getString("ven_id"));
            miVenta.setVenComision(miRs.getString("ven_comision"));
            miVenta.setTranValor(miRs.getString("ven_valor"));
            miVenta.getMiEmpleado().setPerID(miRs.getString("emp_id"));
            miVenta.getMiEmpleado().setPerNombre(miRs.getString("emp_nombre"));
            miVenta.getMiCliente().setPerID(miRs.getString("cli_id"));  
            miVenta.getMiCliente().setPerNombre(miRs.getString("cli_nombre"));
            miVenta.getMiProveedor().setPerID(miRs.getString("pro_id"));
            miVenta.getMiProveedor().setPerNombre(miRs.getString("pro_nombre"));
            miVenta.setTranMedioPago(miRs.getString("ven_medioPago"));
                    assert miVenta == null : "Venta con datos vacios";

                return (miVenta);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No puede verificar la venta"+ e);
            return(null);
        }
    } 
        
        public boolean siExiste(){
        miConexion=Conexion.GetConexion();
        boolean bandera=false;
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from venta where ven_id='"+miVenta.getTranId()+"'");
            if(miRs.next()){
                bandera=true;
        }
            miConexion.close();
        }   
        catch(SQLException e){
             JOptionPane.showMessageDialog(null,"No pude verificar los datos de venta "+e);
             bandera=true;            
        }
        finally{
            return(bandera);
        }
         
    } 
       
    public int GenerarNro(){
            miConexion=Conexion.GetConexion();
            int x=0;
            try{
                miSt=miConexion.createStatement();
                ResultSet miRs=miSt.executeQuery("select MAX(ven_id) as ven_id from venta");
                
                if(miRs.next()){
                x = miRs.getInt("ven_id")+1;
            }    
            
            }    
            catch(SQLException e){
             JOptionPane.showMessageDialog(null,"No pude verificar los datos de venta "+e);
        
            }
            return x;
    }
            
         
    
    
    
        public void InsertVen(Venta miVenta){
        Connection miConexion;
        miConexion=Conexion.GetConexion();
      
        try{
            Statement miSt=miConexion.createStatement();
            miSt.execute("insert into venta (ven_id,pro_id, emp_id, cli_id, ven_comision, ven_valor, ven_fecha, ven_medioPago) value"
                    + "('"+miVenta.getTranId()+"','"+miVenta.getMiProveedor().getPerID()+"','"+miVenta.getMiEmpleado().getPerID()+"','"+miVenta.getMiCliente().getPerID()+"','"+miVenta.getVenComision()+"','"+miVenta.getTranValor()+"', NOW(),'"+miVenta.getTranMedioPago()+"')");
            JOptionPane.showMessageDialog(null,"Venta Ingresada");
        }
        catch(SQLException e){
                      JOptionPane.showMessageDialog(null,"Ocurrio un Error al ingresar la venta en la BD" + e);
        }
   }

        public ArrayList getDetalle(){
        miConexion=Conexion.GetConexion();
        ArrayList miArray=new ArrayList();       
        try{   
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from detventa,articulo where detventa.ven_id='"+miVenta.getTranId()+"'");
            while(miRs.next()){
 
                DetVenta midetVenta=new DetVenta();
                midetVenta.getMiarticulo().setArtID(miRs.getString("art_id"));
                midetVenta.getMiarticulo().setArtNombre(miRs.getString("art_nombre"));
                midetVenta.setDetVprecio(miRs.getString("detV_precio"));
                midetVenta.setDetVcantidad(miRs.getString("detV_cant"));
                midetVenta.setDetVtotal(miRs.getString("detV_total"));
                
                miArray.add(miVenta);                
            }
            return(miArray);
        }
         catch(SQLException e){
                 
             JOptionPane.showMessageDialog(null,"No pude recuperar la venta "+e);
             return(null);
        }        
    }
           
        
        
        
        
        

        

}
 
    
        
        
        

