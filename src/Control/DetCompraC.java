/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Clases.Articulo;
import Clases.Compra;
import Clases.DetCompra;
import DAO.DetCompraDAO;
import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DetCompraC {
            
    public ArrayList CargaDetalle(String nro){
        DetCompraDAO detDAO= new DetCompraDAO();
        DetCompra miDetCompra = new DetCompra();
        ArrayList miDet= detDAO.CargarDetalle(nro);
        return miDet;
    }
    
        public void InsertarDetalle(String nro,String art,String precio,String cantidad, String total){
            Compra miCompra = new Compra(nro);
            Articulo miArticulo = new Articulo(art);
            DetCompra midetCompra = new DetCompra(miCompra,miArticulo,precio,cantidad,total);
            DetCompraDAO Ddao = new DetCompraDAO();
            Ddao.insertDetCompra(midetCompra);
    
    }
    
    
}
