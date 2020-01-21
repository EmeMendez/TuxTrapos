/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Clases.Empleado;
import Clases.Cliente;
import Clases.Proveedor;
import Clases.Venta;
import DAO.VentaDAO;

/**
 *
 * @author Melón
 */
public class VentaC {
    
        public boolean siExisteVenta(String nro){
        Boolean bandera=false;
        Venta miVenta=new Venta(nro);
        VentaDAO miVdao=new VentaDAO(miVenta);
        bandera=miVdao.siExiste(); 
        return(bandera);
    }
    public Venta recupera(String nro){
        Venta miVenta=new Venta(nro);
        VentaDAO miVdao=new VentaDAO(miVenta);
        miVenta=miVdao.getVenta();

        return(miVenta);
    }
    /*public ArrayList listadoSimple(){
        VentaDAO miVdao=new VentaDAO();
        //return(miVdao.getVentas());   
    }*/


    public String miNumero(){
        VentaDAO miVentaDAO = new VentaDAO();
        int x =miVentaDAO.GenerarNro();
        String nro=(Integer.toString(x));
        return nro;     
    }
    
    
    public void InsertarVenta(String nro,String pro,String emp,String cli,String comision,String total,String medioPago){
        Empleado Emp = new Empleado(emp);
        Cliente Cli = new Cliente(cli);
        Proveedor Pro=new Proveedor(pro);
        Venta miVenta = new Venta(nro,Pro,Emp,Cli,comision,total,medioPago);
        miVenta.setVenComision(comision);
        VentaDAO miVentaDAO = new VentaDAO(miVenta);
        miVentaDAO.InsertVen(miVenta);

    }
    
    
        

    

}
