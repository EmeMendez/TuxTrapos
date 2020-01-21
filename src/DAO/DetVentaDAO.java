/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Articulo;
import Clases.DetVenta;
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
    public class DetVentaDAO {
    Connection miConexion;
    Statement miSt;
    private DetVenta miDetventa;
    
   
    
    
    public void insertDetVenta(DetVenta miDetventa){
        Connection miConexion;
        miConexion=Conexion.GetConexion();
        int stockNuevo=0;

      
        try{
            Statement miSt=miConexion.createStatement();
            miSt.execute("insert into detventa (ven_id, art_id,detV_precio, detV_cant,detV_total ) value"
                    + "('"+miDetventa.getMiventa().getTranId()+"','"+miDetventa.getMiarticulo().getArtID()+"','"+miDetventa.getDetVprecio()+"','"+miDetventa.getDetVcantidad()+"','"+miDetventa.getDetVtotal()+"')");
            
            //consultar Stock
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select art_stock from articulo where art_id='"+miDetventa.getMiarticulo().getArtID()+"'");
            miRs.first();            
            Articulo miArticulos=new Articulo();
            miArticulos.setArtStock(miRs.getString("art_stock"));
            
            //Actualizar Stock
            stockNuevo=Integer.parseInt(miArticulos.getArtStock()) - Integer.parseInt(miDetventa.getDetVcantidad());
            Statement miSt1=miConexion.createStatement();
            miSt1.executeUpdate("UPDATE articulo SET art_stock='"+stockNuevo+"' "
                    + "WHERE art_id='"+miDetventa.getMiarticulo().getArtID()+"'");

        }
        catch(SQLException e){
                      JOptionPane.showMessageDialog(null,"Ocurrio un Error al ingresar la DETventa en la BD" + e);
        }
   }
    
    public ArrayList<DetVenta> CargarDetalle(String nroV){
        Connection miConexion = Conexion.GetConexion();
        ArrayList miArray=new ArrayList();
       

        try{
        miSt = miConexion.createStatement();
        ResultSet miRs=miSt.executeQuery("SELECT detventa.art_id,articulo.art_nombre, detventa.detV_precio,detventa.detV_cant,detventa.detV_total FROM detventa, articulo WHERE articulo.art_id = detventa.art_id  and  detventa.ven_id= '"+nroV+"'");
        while(miRs.next()){
           DetVenta miDetalle = new DetVenta();
           Articulo miArticulo = new Articulo();
           miDetalle.setMiarticulo(miArticulo);
           miDetalle.getMiarticulo().setArtID(miRs.getString("art_id"));
           miDetalle.getMiarticulo().setArtNombre(miRs.getString("art_nombre"));
           miDetalle.setDetVprecio(miRs.getString("detV_precio"));
           miDetalle.setDetVcantidad(miRs.getString("detV_cant"));
           miDetalle.setDetVtotal(miRs.getString("detV_total"));
           miArray.add(miDetalle);
           }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"no se pudo " +  e);
        }
        return miArray;
    }
    
    
    
    
    
    }

