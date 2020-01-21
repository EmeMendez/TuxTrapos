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
public enum Enum {
    a("Efectivo"), b("Debito"), c("Tarjeta de Crédito"), d("Cheque");
    private final String display;
    
    
        private Enum(String s) {
        display = s;
    }
        
        @Override
    public String toString() {
        return display;
    }    
}
