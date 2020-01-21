/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Melón
 */
public class Empleado extends Persona {
    private String EmpDescripcion;
    

    public Empleado() {
    }

    public Empleado(String perID) {
        super(perID);
    }

    public Empleado(String perID, String perNombre, String perDireccion, String perTelefono) {
        super(perID, perNombre, perDireccion, perTelefono);
    }

    public String getEmpDescripcion() {
        return EmpDescripcion;
    }

    public void setEmpDescripcion(String EmpDescripcion) {
        this.EmpDescripcion = EmpDescripcion;
    }
    
    
    
    
    
    
    
    
}
