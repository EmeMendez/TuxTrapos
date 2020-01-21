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
public class Transaccion {
    private String TranId;
    private Proveedor miProveedor;
    private Empleado miEmpleado;
    private Cliente miCliente;
    private String TranValor;
    private String TranFecha;
    private String TranMedioPago;

    public Transaccion() {
    }

    public Transaccion(String TranId) {
        this.TranId = TranId;
    }

    public Transaccion(String TranId, Proveedor miProveedor, Empleado miEmpleado, Cliente miCliente, String TranValor, String TranFecha, String TranMedioPago) {
        this.TranId = TranId;
        this.miProveedor = miProveedor;
        this.miEmpleado = miEmpleado;
        this.miCliente = miCliente;
        this.TranValor = TranValor;
        this.TranFecha = TranFecha;
        this.TranMedioPago = TranMedioPago;
    }

    public Transaccion(String TranId, Proveedor miProveedor, Empleado miEmpleado, Cliente miCliente, String TranValor, String TranMedioPago) {
        this.TranId = TranId;
        this.miProveedor = miProveedor;
        this.miEmpleado = miEmpleado;
        this.miCliente = miCliente;
        this.TranValor = TranValor;
        this.TranMedioPago = TranMedioPago;
    }
    
    
    

    public String getTranId() {
        return TranId;
    }

    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    public Proveedor getMiProveedor() {
        return miProveedor;
    }

    public void setMiProveedor(Proveedor miProveedor) {
        this.miProveedor = miProveedor;
    }

    public Empleado getMiEmpleado() {
        return miEmpleado;
    }

    public void setMiEmpleado(Empleado miEmpleado) {
        this.miEmpleado = miEmpleado;
    }

    public Cliente getMiCliente() {
        return miCliente;
    }

    public void setMiCliente(Cliente miCliente) {
        this.miCliente = miCliente;
    }

    public String getTranValor() {
        return TranValor;
    }

    public void setTranValor(String TranValor) {
        this.TranValor = TranValor;
    }

    public String getTranFecha() {
        return TranFecha;
    }

    public void setTranFecha(String TranFecha) {
        this.TranFecha = TranFecha;
    }

    public String getTranMedioPago() {
        return TranMedioPago;
    }

    public void setTranMedioPago(String TranMedioPago) {
        this.TranMedioPago = TranMedioPago;
    }

    
    
    
}
