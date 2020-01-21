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
public class Persona {
    private String perID;
    private String perNombre;
    private String perDireccion;
    private String perTelefono;

    
    public Persona(){
    }
    
    public Persona(String perID){
        this.perID=perID;
    }

    public Persona(String perID, String perNombre, String perDireccion, String perTelefono) {
        this.perID = perID;
        this.perNombre = perNombre;
        this.perDireccion = perDireccion;
        this.perTelefono = perTelefono;
    }

    public String getPerID() {
        return perID;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public String getPerDireccion() {
        return perDireccion;
    }

    public String getPerTelefono() {
        return perTelefono;
    }

    public void setPerID(String perID) {
        this.perID = perID;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    public void setPerTelefono(String perTelefono) {
        this.perTelefono = perTelefono;
    }

    
          @Override
       public String toString(){
       return perNombre;
    }   
    
    
}
