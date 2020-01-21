/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Clases.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * 
 * @author Melón
 */
public class ProveedorDAO {
     private Proveedor miProveedor;
     Connection miConexion;
     Statement miSt;

    public ProveedorDAO() {
    }
     
    public ProveedorDAO(Proveedor miProveedor) {
        this.miProveedor = miProveedor;
    }
     
 
    public ArrayList getProveedor(){
        miConexion=Conexion.GetConexion();
        ArrayList miArray = new ArrayList();
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("SELECT * FROM proveedor");
            while(miRs.next()){
            Proveedor miProveedor=new Proveedor();
            miProveedor.setPerID(miRs.getString("pro_id"));
            miProveedor.setPerNombre(miRs.getString("pro_nombre"));
            miProveedor.setPerDireccion(miRs.getString("pro_Direccion"));
            miProveedor.setPerTelefono(miRs.getString("pro_telefono"));
            }
        }
        catch(SQLException ex){
            
        }
        return (miArray);
    }

 public void MostrarProveedor(JComboBox<Proveedor> comboPro){
        Connection miConexion = Conexion.GetConexion();
     
        try{   
            Statement miSt = miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select * from proveedor");
            while(miRs.next()){
                comboPro.addItem(new Proveedor (miRs.getString("pro_id"), miRs.getString("pro_nombre"), miRs.getString("pro_direccion"), miRs.getString("pro_telefono")));
                     
        }
        }catch(SQLException e){
                 
             JOptionPane.showMessageDialog(null,"No pude recuperar la lista de proveedores "+e);
        }  
 
       }
       
 

 
 
 
 
 
     } 
     
     

