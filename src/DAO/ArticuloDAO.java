/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import Clases.Articulo;
import Clases.Articulo_Categoria;
import Clases.Proveedor;
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
public class ArticuloDAO {
    private Articulo miArticulo;
    Connection miConexion;
    Statement miSt;
    
    
    public ArticuloDAO(){}
    
    public ArticuloDAO(Articulo miArticulo){
        this.miArticulo=miArticulo;
    }
    
    public ArrayList getArticulos(String busqueda){
        miConexion=Conexion.GetConexion();
        ArrayList miArray=new ArrayList();
        
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("SELECT * FROM articulo WHERE CONCAT (art_id,'',art_nombre) LIKE '%"+busqueda+"%' AND pro_id=3004 ");
            while(miRs.next()){
            Articulo miArticulo= new Articulo();
            miArticulo.setArtID(miRs.getString("art_id"));
            miArticulo.setArtNombre(miRs.getString("art_nombre"));
            miArticulo.setArtPrecio(miRs.getString("art_precio"));
            miArticulo.setArtStock(miRs.getString("art_stock"));
            miArray.add(miArticulo);                

            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "no se puede recuperar los articulos " + e);
        }
        return miArray;
    }
    
    /*
    public ArrayList getOfertas(){
        miConexion=Conexion.GetConexion();
        ArrayList miArray=new ArrayList();
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("SELECT * FROM articulo ORDER BY art_precio ASC LIMIT 10  ");
                while(miRs.next()){
                    Articulo miArticulo= new Articulo();
                    miArticulo.setArtID(miRs.getString("art_id"));
                    miArticulo.setArtNombre(miRs.getString("art_nombre"));
                    miArticulo.setArtPrecio(miRs.getString("art_precio"));
                    miArticulo.setArtStock(miRs.getString("art_stock"));
                    miArray.add(miArticulo);}
            }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null, "no se pudo ver la oferta" + e);
                
                }
        return (miArray);
        }*/        
   

    /*
    public ArrayList getPrecios1(String rango1, String rango2){
        miConexion=Conexion.GetConexion();
        ArrayList miArray=new ArrayList();
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("SELECT * FROM articulo WHERE art_precio BETWEEN '"+rango1+"' AND '"+rango2+"' ORDER BY art_precio ");
                while(miRs.next()){
                    Articulo miArticulo= new Articulo();
                    miArticulo.setArtID(miRs.getString("art_id"));
                    miArticulo.setArtNombre(miRs.getString("art_nombre"));
                    miArticulo.setArtPrecio(miRs.getString("art_precio"));
                    miArticulo.setArtStock(miRs.getString("art_stock"));
                    miArray.add(miArticulo);}
            }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null, "no se pudo ver la oferta" + e);
                
                }
        return (miArray);
        }*/

    
    public ArrayList getArticulosPorProveedor(String busqueda,String idProveedor){
        miConexion=Conexion.GetConexion();
        ArrayList miArray=new ArrayList();
        
        try{
            miSt=miConexion.createStatement();
            ResultSet miRs=miSt.executeQuery("SELECT * FROM articulo,proveedor,articulo_categoria WHERE  articulo.pro_id ='"+idProveedor+"' AND articulo.artC_id=articulo_categoria.artC_id  AND  articulo.pro_id = proveedor.pro_id  AND  CONCAT (articulo.art_id,'',articulo.art_nombre) LIKE '%"+busqueda+"%' ORDER BY articulo.art_precio ");
            while(miRs.next()){
            Articulo miArticulo= new Articulo();
            Proveedor miProveedor=new Proveedor();
            Articulo_Categoria miCategoria= new Articulo_Categoria();
            miArticulo.setMiProveedor(miProveedor);
            miArticulo.setMiCategoria(miCategoria);
            miArticulo.setArtID(miRs.getString("art_id"));
            miArticulo.setArtNombre(miRs.getString("art_nombre"));
            miArticulo.setArtPrecio(miRs.getString("art_precio"));
            miArticulo.setArtStock(miRs.getString("art_stock"));
            miArticulo.getMiProveedor().setPerID(miRs.getString("pro_id"));
            miArticulo.getMiProveedor().setPerNombre(miRs.getString("pro_nombre"));
            miArticulo.getMiCategoria().setCat_id(miRs.getString("artC_id"));
            miArticulo.getMiCategoria().setCat_nombre(miRs.getString("artC_nombre"));
            miArray.add(miArticulo);                
            //pro_id='"+proveedor+"'
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "no se puede recuperar los articulos " + e);
        }
        return miArray;
    }    


}










    

