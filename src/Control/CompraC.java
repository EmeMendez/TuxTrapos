/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.*;
import DAO.CompraDAO;

/**
 *
 * @author Melón
 */
public class CompraC {
 
    public boolean siExisteCompra(String nro){
        Boolean x=false;
        Compra miCompra=new Compra(nro);
        CompraDAO miCdao=new CompraDAO(miCompra);
        x=miCdao.siExiste(); 
        return(x);
    }

        public Compra muestraCompra(String nro){
        Compra miCompra=new Compra(nro);
        CompraDAO miCdao=new CompraDAO(miCompra);
        miCompra=miCdao.getCompra();
        return(miCompra);
    }

        public void InsertarCompra(String nro,String pro,String emp,String cli,String total,String medioPago){
        Empleado Emp = new Empleado(emp);
        Cliente Cli = new Cliente(cli);
        Proveedor Pro=new Proveedor(pro);
        Compra miCompra = new Compra(nro,Pro,Emp,Cli,total,medioPago);
        CompraDAO miCompraDAO = new CompraDAO(miCompra);
        miCompraDAO.InsertCompra(miCompra);
    }    
        
        public String GeneraNumero(){
        CompraDAO miCompraDAO= new CompraDAO();
        int x = miCompraDAO.GenerarNro();
        String nro=(Integer.toString(x));
        return nro;
    }    
        
    
    }
