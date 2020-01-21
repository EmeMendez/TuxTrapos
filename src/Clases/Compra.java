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
public class Compra extends Transaccion {

    
    public Compra() {
    }

    public Compra(String TranId) {
        super(TranId);
    }

    public Compra(String TranId, Proveedor miProveedor, Empleado miEmpleado, Cliente miCliente, String TranValor, String TranMedioPago) {
        super(TranId, miProveedor, miEmpleado, miCliente, TranValor, TranMedioPago);
    }

    
 
    
}
