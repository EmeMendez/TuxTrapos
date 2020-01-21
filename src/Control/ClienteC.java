/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.Cliente;
import DAO.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author Melón
 */
public class ClienteC {
        
    public boolean siExisteCliente(String rut){
        Boolean bandera=false;
        Cliente miCliente=new Cliente(rut);
        ClienteDAO miCdao=new ClienteDAO(miCliente);
        bandera=miCdao.siExiste(); 
        return(bandera);
    }
    public Cliente recupera(String rut){
        Cliente miCliente=new Cliente(rut);
        ClienteDAO miCdao=new ClienteDAO(miCliente);
        miCliente=miCdao.getCliente();
        return(miCliente);
    }
    public ArrayList listadoSimple(){
        ClienteDAO miCdao=new ClienteDAO();
        return(miCdao.getClientes());   
        
    }
    
    public String MuestraNombre(String rut ){
        String nombre;
        Cliente miCliente  = new Cliente(rut);
        ClienteDAO miClienteDAO = new ClienteDAO(miCliente);
        miCliente=miClienteDAO.getCliente();
        nombre = miCliente.getPerNombre();
        return(nombre);
    }
     
    public boolean InsertCliente(String rut,String nombre,String direccion,String telefono, String correo){
        boolean m=false;
        ClienteDAO Cdao = new ClienteDAO();
        m=Cdao.guardarcli(rut,nombre, direccion, telefono, correo);
        return m; 

    }
    
    
    public boolean UpdateCliente(String id,String nombre,String direccion,String telefono,String correo){
        boolean m = false;
        ClienteDAO Cdao = new ClienteDAO();
        Cdao.modificarcli(id, nombre, direccion, telefono, correo);
        return m;
    
    }
        
}
