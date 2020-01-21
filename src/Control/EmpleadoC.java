/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Clases.Empleado;
import DAO.EmpleadoDAO;

/**
 * 
 * @author Melón
 */
public class EmpleadoC {
    
    
        public boolean siExisteEmpleado(String rut){
        Boolean bandera=false;
        Empleado miEmpleado=new  Empleado(rut);
        EmpleadoDAO miEmpleadoDAO=new  EmpleadoDAO(miEmpleado);
        bandera=miEmpleadoDAO.siExiste(); 
        return(bandera);
    }
        
        
    public  Empleado recuperaEmpleado(String rut){
        Empleado miEmpleado=new  Empleado(rut);
        EmpleadoDAO miEmpleadoDAO=new EmpleadoDAO(miEmpleado);
        miEmpleado=miEmpleadoDAO.getEmpleado();
        return(miEmpleado);
    }
    
    public String MuestraNombre(String rut ){
           String nombre;
           Empleado miEmpleado  = new Empleado(rut);
           EmpleadoDAO miEmpleadoDAO = new EmpleadoDAO(miEmpleado);
           miEmpleado=miEmpleadoDAO.getEmpleado();
           nombre = miEmpleado.getPerNombre();
           return(nombre);
    }

   

    
    
}
