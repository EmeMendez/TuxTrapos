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
public class Venta extends Transaccion {
    private String venComision;

        

    public Venta(){
    } 

    public Venta(String TranId) {
        super(TranId);
    }
    

    public Venta(String TranId, Proveedor miProveedor, Empleado miEmpleado, Cliente miCliente,String VenComision, String TranValor, String TranMedioPago) {
        super(TranId, miProveedor, miEmpleado, miCliente, TranValor, TranMedioPago);
        this.venComision=venComision;
    }
    
    public String getVenComision() {
        return venComision;
    }

    public void setVenComision(String venComision) {
        this.venComision = venComision;
    }

    
 





    
        
}
