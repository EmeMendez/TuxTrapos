/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Contrato;
import Clases.Empleado;
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
public class ContratoDAO {
    // en realidad es contrato 
    private Empleado miEmpleado;
    private Contrato miContrato;
    Connection miConexion;
    Statement miSt;
    
    public ContratoDAO(){        
    }
    
    public ContratoDAO(Contrato miContrato){
        this.miContrato=miContrato;

    }
    
    public Contrato getContrato(){
        miConexion = Conexion.GetConexion();
        Empleado miEmpleado = new Empleado();
        miContrato.setMiEmpleado(miEmpleado);
                try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from contrato, cargo, empleado where contrato.cont_id='"+miContrato.getContNroContrato()+"' and contrato.cargo_id=cargo.cargo_id and contrato.emp_id=empleado.emp_id");
            miRs.first();

            miContrato.setContFechaInicio(miRs.getString("cont_FI"));
            miContrato.setContFechaTermino(miRs.getString("cont_FT"));
            miContrato.setContHorasJornada(miRs.getString("cont_horasT"));
            miContrato.setContSueldo(miRs.getString("cont_sueldo"));
            miContrato.setContCargo(miRs.getString("cargo_nombre"));
            miContrato.getMiEmpleado().setPerID(miRs.getString("emp_id"));
            miContrato.getMiEmpleado().setPerNombre(miRs.getString("emp_nombre"));
            miContrato.getMiEmpleado().setPerDireccion(miRs.getString("emp_direccion"));
            miContrato.getMiEmpleado().setPerTelefono(miRs.getString("emp_telefono"));
            return (miContrato);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No puede verificar los datos de usuario"+ e);
            return(null);
        }
    }
    
    public boolean siExiste(){
        miConexion=Conexion.GetConexion();
        boolean bandera=false;
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from contrato where cont_id='"+miContrato.getContNroContrato()+"'");
            if(miRs.next()){
                bandera=true;
        }
            miConexion.close();
        }   
        catch(SQLException e){
             JOptionPane.showMessageDialog(null,"No pude verificar los datos de usuario "+e);
             bandera=true;            
        }
        finally{
            return(bandera);
        }
    }       
     public ArrayList getContratos(){
        miConexion=Conexion.GetConexion();
        ArrayList elArray=new ArrayList();
     
        try{
            /*select cont_id,cargo_id, cont_FI,cont_FT,cont_horasT,cargo_nombre 
            from contrato, cargo
            where contrato.cargo_id = cargo.cargo_id*/
            
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from contrato , cargo where contrato.cargo_id = cargo.cargo_id");
            
            
            //ResultSet miRs=miSt.executeQuery("select * from contrato order by cont_FI");
            while(miRs.next()){
                Contrato miContrato=new Contrato();
                miContrato.setContNroContrato(miRs.getString("cont_id"));
                miContrato.setContFechaInicio(miRs.getString("cont_FI"));
                miContrato.setContFechaTermino(miRs.getString("cont_FT"));
                miContrato.setContHorasJornada(miRs.getString("cont_horasT"));
                miContrato.setContCargo(miRs.getString("cargo_nombre"));
           
                
                elArray.add(miContrato);                
            }
            return(elArray);
        }
         catch(SQLException e){
                 
             JOptionPane.showMessageDialog(null,"No pude recuperar la lista de contratos ");
             return(null);
        }  
        
     }        

    public boolean siTrabaja(String rut){
        miConexion=Conexion.GetConexion();
             
        boolean existe=false;
       try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from contrato where emp_id='"+rut+"' and cont_FT= '-'  ");
            if(miRs.next()){
                existe=true;
        }
            miConexion.close();
        }   
        catch(SQLException e){
             JOptionPane.showMessageDialog(null,"No pude verificar los datos de usuario "+e);
             existe=true;            
        }
        finally{
            return(existe);
        }
     

     }
     
         
       
  
}
        
    

        
         
    
     
         
       
    

