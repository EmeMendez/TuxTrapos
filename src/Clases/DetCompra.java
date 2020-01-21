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
public class DetCompra {
    private Compra miCompra;
    private Articulo miArticulo;            
    private String detCcant;
    private String detCprecio;
    private String detCtotal;
    private String detCfecha;

    public DetCompra() {
    }

    public DetCompra(Compra miCompra) {
        this.miCompra = miCompra;
    }

    public DetCompra(Compra miCompra, Articulo miArticulo, String detCcant, String detCprecio, String detCtotal) {
        this.miCompra = miCompra;
        this.miArticulo = miArticulo;
        this.detCcant = detCcant;
        this.detCprecio = detCprecio;
        this.detCtotal = detCtotal;
    }

    public Compra getMiCompra() {
        return miCompra;
    }

    public Articulo getMiArticulo() {
        return miArticulo;
    }

    public String getDetCcant() {
        return detCcant;
    }

    public String getDetCprecio() {
        return detCprecio;
    }

    public String getDetCtotal() {
        return detCtotal;
    }

    public String getDetCfecha() {
        return detCfecha;
    }

    public void setMiCompra(Compra miCompra) {
        this.miCompra = miCompra;
    }

    public void setMiArticulo(Articulo miArticulo) {
        this.miArticulo = miArticulo;
    }

    public void setDetCcant(String detCcant) {
        this.detCcant = detCcant;
    }

    public void setDetCprecio(String detCprecio) {
        this.detCprecio = detCprecio;
    }

    public void setDetCtotal(String detCtotal) {
        this.detCtotal = detCtotal;
    }

    public void setDetCfecha(String detCfecha) {
        this.detCfecha = detCfecha;
    }
    
    
}
