/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Clases.Cliente;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Melón
 */
public class ClienteDAO {
    private Cliente miCliente;
    Connection miConexion;
    Statement miSt;
    
    
    public ClienteDAO(){
    }
    
    public ClienteDAO(Cliente miCliente){
        this.miCliente=miCliente;
    }
    
    public Cliente getCliente(){
        miConexion=Conexion.GetConexion();
        
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from cliente where cli_id='"+miCliente.getPerID()+"'");
            miRs.first();
            miCliente.setPerNombre(miRs.getString("cli_nombre"));
            miCliente.setPerDireccion(miRs.getString("cli_direccion"));
            miCliente.setPerTelefono(miRs.getString("cli_telefono"));
            miCliente.setCliCorreo(miRs.getString("cli_correo"));
            return (miCliente);
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
            ResultSet miRs=miSt.executeQuery("select * from cliente where cli_id='"+miCliente.getPerID()+"'");
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
    public ArrayList getClientes(){
        miConexion=Conexion.GetConexion();
        ArrayList miArray=new ArrayList();
     
        try{   
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from cliente order by cli_nombre");
            while(miRs.next()){
                Cliente miCliente=new Cliente();
                miCliente.setPerID(miRs.getString("cli_id"));
                miCliente.setPerNombre(miRs.getString("cli_nombre"));
                miCliente.setPerDireccion(miRs.getString("cli_direccion"));
                miCliente.setPerTelefono(miRs.getString("cli_telefono"));
                miCliente.setCliCorreo(miRs.getString("cli_correo"));
                
                miArray.add(miCliente);                
            }
            return(miArray);
        }
         catch(SQLException e){
                 
             JOptionPane.showMessageDialog(null,"No pude recuperar la lista de usuarios "+e);
             return(null);
        }        
    } 
    
        public boolean guardarcli(String id, String nombre, String direccion, String telefono, String correo){
        Connection miConexion;
        miConexion=Conexion.GetConexion();
        boolean bandera=false;
        try{
            Statement miSt=miConexion.createStatement();
            miSt.execute("insert into cliente (cli_id, cli_nombre, cli_direccion, cli_telefono, cli_correo) value"
                    + "('"+id+"','"+nombre+"','"+direccion+"','"+telefono+"','"+correo+"')");
            bandera=true;
                
        }
        catch(SQLException e){
          
        }
        finally{
            return(bandera);
        }
    }
        
    public boolean modificarcli(String id, String nombre,String direccion,String telefono,String correo){    
        Connection miConexion;
        miConexion=Conexion.GetConexion();
        boolean bandera=false;    
        
                try{
            Statement miSt=miConexion.createStatement();
            miSt.executeUpdate("UPDATE cliente SET cli_nombre='"+nombre+"', cli_direccion='"+direccion+"', cli_telefono='"+telefono+"',cli_correo='"+correo+"' "
                    + "WHERE cli_id='"+id+"'");
                    
            bandera=true;
                
        }
        catch(SQLException e){
          
        }
        finally{
            return(bandera);
        }
    }
}
