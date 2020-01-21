/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.Calendar;


/**
 * 
 * @author Mélon
 */
public class Asistencia {
           private Empleado miEmpleado; 
           private  String asisFecha;
           private  String asisDescripcion;
               
 public Asistencia(){}
 
 public Asistencia(String asisFecha){
     this.asisFecha=asisFecha;
 }

    public Empleado getMiEmpleado() {
        return miEmpleado;
    }

    public String getAsisFecha() {
        return asisFecha;
    }

    public void setMiEmpleado(Empleado miEmpleado) {
        this.miEmpleado = miEmpleado;
    }

    public void setAsisFecha(String asisFecha) {
        this.asisFecha = asisFecha;
    }

    public String getAsisDescripcion() {
        return asisDescripcion;
    }

    public void setAsisDescripcion(String asisDescripcion) {
        this.asisDescripcion = asisDescripcion;
    }
    
 
    public String ObtenerFecha(){
         Calendar c = Calendar.getInstance();
         String ano = Integer.toString(c.get(Calendar.YEAR));
         String mes= Integer.toString(c.get(Calendar.MONTH)+1);
         String dia=Integer.toString(c.get(Calendar.DATE));
          if (Integer.parseInt(dia) <10)
              dia="0"+dia;
          if (Integer.parseInt(mes) <10)
              mes="0"+mes;
 
          String fecha=ano+"-"+mes+"-"+dia;
           return fecha;
         
    }
}
