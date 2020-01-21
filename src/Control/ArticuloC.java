/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Clases.Articulo;
import DAO.ArticuloDAO;
import java.util.ArrayList;

/**
 * 
 * @author Melón
 */
public class ArticuloC {
    
        public ArrayList MuestraArticulos(String art){
        ArticuloDAO Adao = new ArticuloDAO();
        return Adao.getArticulos(art);
        }
        
        
        public ArrayList ArticulosPorProveedor(String busqueda,String art){
        ArticuloDAO Adao = new ArticuloDAO();
        return Adao.getArticulosPorProveedor(busqueda,art);
        
        
        
        }
}
