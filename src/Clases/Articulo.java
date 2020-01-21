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
public class Articulo {
    private String artID;
    private String artNombre;
    private Proveedor miProveedor;    
    private Articulo_Categoria miCategoria;
    private String artPrecio;
    private String artStock;
    private String artMarca;
    
    
    public Articulo(){
    }
    
    public Articulo(String artID){
        this.artID=artID;
    }
    
    public Articulo(String artID, String artNombre, Articulo_Categoria miCategoria,String artPrecio,String artStock, String artMarca){
        this.artID=artID;
        this.artNombre=artNombre;
        this.miCategoria=miCategoria;
        this.artPrecio=artPrecio;
        this.artStock=artStock;
        this.artMarca=artMarca;
    }

    public String getArtID() {
        return artID;
    }

    public String getArtNombre() {
        return artNombre;
    }

    public Articulo_Categoria getMiCategoria() {
        return miCategoria;
    }

    public String getArtPrecio() {
        return artPrecio;
    }

    public String getArtStock() {
        return artStock;
    }

    public String getArtMarca() {
        return artMarca;
    }
    
    public void setArtID(String artID) {
        this.artID = artID;
    }

    public void setArtNombre(String artNombre) {
        this.artNombre = artNombre;
    }

    public void setMiCategoria(Articulo_Categoria miCategoria) {
        this.miCategoria = miCategoria;
    }

    public void setArtPrecio(String artPrecio) {
        this.artPrecio = artPrecio;
    }

    public void setArtStock(String artStock) {
        this.artStock = artStock;
    }

    public void setArtMarca(String artMarca) {
        this.artMarca = artMarca;
    }

    public Proveedor getMiProveedor() {
        return miProveedor;
    }

    public void setMiProveedor(Proveedor miProveedor) {
        this.miProveedor = miProveedor;
    }
    
    
    
}
