/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class EmpleadoDAO {
    private Empleado miEmpleado;
    Connection miConexion;
    Statement miSt;
    
    
    public EmpleadoDAO() {
    }

    public EmpleadoDAO(Empleado miEmpleado) {
        this.miEmpleado = miEmpleado;
    }
    
    public Empleado getEmpleado(){
        miConexion=Conexion.GetConexion();
        
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from empleado where emp_id='"+miEmpleado.getPerID()+"'");
            miRs.first();
            miEmpleado.setPerNombre(miRs.getString("emp_nombre"));
            miEmpleado.setPerDireccion(miRs.getString("emp_direccion"));
            miEmpleado.setPerTelefono(miRs.getString("emp_telefono"));
            return (miEmpleado);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No puede verificar los datos"+ e);
            return(null);
        }
    } 
    
    
        public boolean siExiste(){
        miConexion=Conexion.GetConexion();
        boolean bandera=false;
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from empleado where emp_id='"+miEmpleado.getPerID()+"'");
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
    public ArrayList getEmpleados(){
        miConexion=Conexion.GetConexion();
        ArrayList miArray=new ArrayList();
     
        try{   
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from empleado order by emp_nombre");
            while(miRs.next()){
                Empleado miEmpleado=new Empleado();
                miEmpleado.setPerID(miRs.getString("emp_id"));
                miEmpleado.setPerNombre(miRs.getString("emp_nombre"));
                miEmpleado.setPerDireccion(miRs.getString("emp_direccion"));
                miEmpleado.setPerTelefono(miRs.getString("emp_telefono"));
                
                miArray.add(miEmpleado);                
            }
            return(miArray);
        }
         catch(SQLException e){
                 
             JOptionPane.showMessageDialog(null,"No pude recuperar la lista de usuarios "+e);
             return(null);
        }        
    } 
    
    
    
    
    
    
    
    
}
