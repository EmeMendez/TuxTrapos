/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Clases.Articulo;
import Clases.DetCompra;
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
public class DetCompraDAO {
    private DetCompra miDetCompra;
    Connection miConexion;
    Statement miSt;

    public DetCompraDAO() {
    }
    
    public DetCompraDAO(DetCompra miDetCompra) {
        this.miDetCompra = miDetCompra;
    }
    
    ////////////////////////////////
    
    public void insertDetCompra(DetCompra miDetCompra){
        Connection miConexion;
        miConexion=Conexion.GetConexion();
        int stockNuevo=0;

      
        try{
            Statement miSt=miConexion.createStatement();
            miSt.execute("insert into detcompra (com_id, art_id,detC_cant, detC_precio,detC_total ) value"
                    + "('"+miDetCompra.getMiCompra().getTranId()+"','"+miDetCompra.getMiArticulo().getArtID()+"','"+miDetCompra.getDetCcant()+"','"+miDetCompra.getDetCprecio()+"','"+miDetCompra.getDetCtotal()+"')");
            
            //consultar Stock
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("select art_stock from articulo where art_id='"+miDetCompra.getMiArticulo().getArtID()+"'");
            miRs.first();            
            Articulo miArticulos=new Articulo();
            miArticulos.setArtStock(miRs.getString("art_stock"));
            
            //Actualizar Stock
            stockNuevo=Integer.parseInt(miArticulos.getArtStock()) - Integer.parseInt(miDetCompra.getDetCcant());
            Statement miSt1=miConexion.createStatement();
            miSt1.executeUpdate("UPDATE articulo SET art_stock='"+stockNuevo+"' "
                    + "WHERE art_id='"+miDetCompra.getMiArticulo().getArtID()+"'");

        }
        catch(SQLException e){
                      JOptionPane.showMessageDialog(null,"Ocurrio un Error al ingresar la DETcompra en la BD" + e);
        }
   }
    
    
    
        public ArrayList<DetCompra> CargarDetalle(String nroC){
        Connection miConexion = Conexion.GetConexion();
        ArrayList miArray=new ArrayList();
       

        try{
        miSt = miConexion.createStatement();
        ResultSet miRs=miSt.executeQuery("SELECT detcompra.art_id,articulo.art_nombre, detcompra.detC_precio,detcompra.detC_cant,detcompra.detC_total FROM detcompra, articulo WHERE articulo.art_id = detcompra.art_id  and  detcompra.com_id= '"+nroC+"'");
        while(miRs.next()){
           DetCompra miDetalleC = new DetCompra();
           Articulo miArticulo = new Articulo();
           miDetalleC.setMiArticulo(miArticulo);
           miDetalleC.getMiArticulo().setArtID(miRs.getString("art_id"));
           miDetalleC.getMiArticulo().setArtNombre(miRs.getString("art_nombre"));
           miDetalleC.setDetCcant(miRs.getString("detC_cant"));
           miDetalleC.setDetCprecio(miRs.getString("detC_precio"));
           miDetalleC.setDetCtotal(miRs.getString("detC_total"));
           miArray.add(miDetalleC);
           }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"no se pudo cargar detalle compra" +  e);
        }
        return miArray;
    }
        
    
}
