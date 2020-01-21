/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Clases.Asistencia;
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
public class AsistenciaDAO {
    private Asistencia miAsistencia;
    Connection miConexion;
    Statement miSt;
     
     
    public AsistenciaDAO(){
    }
     
    public AsistenciaDAO(Asistencia miAsistencia){
        this.miAsistencia=miAsistencia;
    }
    
    public boolean InsertAsistencia(String id, String asis){
        miConexion=Conexion.GetConexion();
       
        boolean inserto=false;
        try{
        Statement miSt=miConexion.createStatement();
        miSt.execute("INSERT INTO asistencia (asistencia_id, emp_id, asistencia_descripcion) value "
        + "(CURDATE(),'"+id+"','"+asis+"')");
         JOptionPane.showMessageDialog(null, "Asistencia ingresada");
        inserto=true;
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ya registro esta asistencia");
        }

        return inserto;
        
    }
    
    
        public ArrayList getAsistencias(){
         ArrayList miArray=new ArrayList();
        miConexion=Conexion.GetConexion();


        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("SELECT * FROM asistencia,empleado WHERE asistencia.emp_id = empleado.emp_id");
           while(miRs.next()){
            Asistencia miAsistencia=new Asistencia();
            Empleado miEmpleado = new Empleado();
            miAsistencia.setMiEmpleado(miEmpleado);
            miAsistencia.setAsisFecha(miRs.getString("asistencia_id"));
            miAsistencia.getMiEmpleado().setPerID(miRs.getString("emp_id"));
            miAsistencia.getMiEmpleado().setPerNombre(miRs.getString("emp_nombre"));
            miAsistencia.setAsisDescripcion(miRs.getString("asistencia_descripcion"));
            miArray.add(miAsistencia);}
           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No puede verificar la asistencia"+ e);
            return(null);
        }
        return miArray;
        }
        
        
        public ArrayList getPorFecha(String desde,String hasta,String busqueda){
        ArrayList miArray=new ArrayList();
        miConexion=Conexion.GetConexion();


        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("SELECT * FROM asistencia,empleado WHERE CONCAT (empleado.emp_id,'',empleado.emp_nombre) LIKE '%"+busqueda+"%' AND asistencia.emp_id = empleado.emp_id AND DATE(asistencia.asistencia_id) BETWEEN '"+desde+"' AND '"+hasta+"'");
           while(miRs.next()){
            Asistencia miAsistencia=new Asistencia();
            Empleado miEmpleado = new Empleado();
            miAsistencia.setMiEmpleado(miEmpleado);
            miAsistencia.setAsisFecha(miRs.getString("asistencia_id"));
            miAsistencia.getMiEmpleado().setPerID(miRs.getString("emp_id"));
            miAsistencia.getMiEmpleado().setPerNombre(miRs.getString("emp_nombre"));
            miAsistencia.setAsisDescripcion(miRs.getString("asistencia_descripcion"));
            miArray.add(miAsistencia);}
           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No puede verificar la asistencia"+ e);
            return(null);
        }
        return miArray;
        }
        
        
        
}

