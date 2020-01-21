/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Clases.Proveedor;
import DAO.ProveedorDAO;
import javax.swing.JComboBox;

/**
 * 
 * @author Melón
 */
public class ProveedorC {
    
    public void CargaCombo(JComboBox<Proveedor> combo){
       ProveedorDAO miProveedor = new ProveedorDAO();
       miProveedor.MostrarProveedor(combo);
    }
}
