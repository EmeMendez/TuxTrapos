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
public class Cliente extends Persona {
    private String cliCorreo;
    
    public Cliente(){
    }
    
    public Cliente(String perID){
        super(perID);
    }
    
    public Cliente(String perID, String perNombre, String perDireccion, String perTelefono){
        super(perID,perNombre,perDireccion,perTelefono);

    }


    public void setCliCorreo(String cliCorreo) {
        this.cliCorreo = cliCorreo;
    }

    public String getCliCorreo() {
        return cliCorreo;
    }
    
    
    
    
    
}
