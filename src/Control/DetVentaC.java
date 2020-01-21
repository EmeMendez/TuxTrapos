/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Clases.Articulo;
import Clases.DetVenta;
import Clases.Venta;
import DAO.DetVentaDAO;
import java.util.ArrayList;

/**
 * 
 * @author Melón
 */
public class DetVentaC {

    public ArrayList MuestaDetalle(String nro){
        DetVentaDAO detDAO= new DetVentaDAO();
        DetVenta miDetVenta = new DetVenta();
        return (detDAO.CargarDetalle(nro));
    }
    
    public void InsertarDetalle(String nro,String art,String precio,String cantidad, String total){
            Venta miVenta = new Venta(nro);
            Articulo miArticulo = new Articulo(art);
            DetVenta midetVenta = new DetVenta(miVenta,miArticulo,precio,cantidad,total);
            DetVentaDAO midetventadao = new DetVentaDAO();
            midetventadao.insertDetVenta(midetVenta);
    
    }
}
