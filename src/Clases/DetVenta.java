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
public class DetVenta {
        private Venta miVenta;
        private Articulo miArticulo;
        private String detVprecio;
        private String detVcantidad;
        private String detVtotal;
        
        
    public DetVenta(){}    

    public DetVenta(Venta miventa, Articulo miarticulo, String detVprecio, String detVcantidad, String detVtotal) {
        this.miVenta = miventa;
        this.miArticulo = miarticulo;
        this.detVprecio = detVprecio;
        this.detVcantidad = detVcantidad;
        this.detVtotal = detVtotal;
    }

    public Venta getMiventa() {
        return miVenta;
    }

    public Articulo getMiarticulo() {
        return miArticulo;
    }

    public String getDetVprecio() {
        return detVprecio;
    }

    public String getDetVcantidad() {
        return detVcantidad;
    }

    public String getDetVtotal() {
        return detVtotal;
    }

    public void setMiventa(Venta miventa) {
        this.miVenta = miventa;
    }

    public void setMiarticulo(Articulo miarticulo) {
        this.miArticulo = miarticulo;
    }

    public void setDetVprecio(String detVprecio) {
        this.detVprecio = detVprecio;
    }

    public void setDetVcantidad(String detVcantidad) {
        this.detVcantidad = detVcantidad;
    }

    public void setDetVtotal(String detVtotal) {
        this.detVtotal = detVtotal;
    }
    
    
        
        
        
        
}
