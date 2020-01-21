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
public class Contrato {
        private Empleado miEmpleado;
        private String contNroContrato;
        private String contFechaInicio;        
        private String contFechaTermino;        
        private String contHorasJornada;
        private String contCargo;
        private String contSueldo;
        
    public Contrato(){
    }

    public Contrato(String contrato){
       this.contNroContrato=contrato;   
    }
    
    
    

    public Empleado getMiEmpleado() {
        return miEmpleado;
    }

    public String getContNroContrato() {
        return contNroContrato;
    }

    public String getContFechaInicio() {
        return contFechaInicio;
    }

    public String getContFechaTermino() {
        return contFechaTermino;
    }

    public String getContHorasJornada() {
        return contHorasJornada;
    }

    public String getContCargo() {
        return contCargo;
    }

    public String getContSueldo() {
        return contSueldo;
    }

    public void setMiEmpleado(Empleado miEmpleado) {
        this.miEmpleado = miEmpleado;
    }

    public void setContNroContrato(String contNroContrato) {
        this.contNroContrato = contNroContrato;
    }

    public void setContFechaInicio(String contFechaInicio) {
        this.contFechaInicio = contFechaInicio;
    }

    public void setContFechaTermino(String contFechaTermino) {
        this.contFechaTermino = contFechaTermino;
    }

    public void setContHorasJornada(String contHorasJornada) {
        this.contHorasJornada = contHorasJornada;
    }

    public void setContCargo(String contCargo) {
        this.contCargo = contCargo;
    }

    public void setContSueldo(String contSueldo) {
        this.contSueldo = contSueldo;
    }
    
}