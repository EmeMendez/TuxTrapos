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
public class Articulo_Categoria {
    private String cat_id;
    private String cat_nombre;
    
    
    public Articulo_Categoria(){}

    public Articulo_Categoria(String cat_id, String cat_nombre) {
        this.cat_id = cat_id;
        this.cat_nombre = cat_nombre;
    }

    public String getCat_id() {
        return cat_id;
    }

    public String getCat_nombre() {
        return cat_nombre;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public void setCat_nombre(String cat_nombre) {
        this.cat_nombre = cat_nombre;
    }
    
    
}
