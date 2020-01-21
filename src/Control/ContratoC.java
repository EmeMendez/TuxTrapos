/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.Contrato;
import DAO.ContratoDAO;
import java.util.ArrayList;

/**
 *
 * @author Melón
 */
public class ContratoC {
    
    
        public boolean siExisteContrato(String nro){
        Boolean bandera=false;
        Contrato miContrato=new Contrato(nro);
        ContratoDAO miContratoDAO=new ContratoDAO(miContrato);
        bandera=miContratoDAO.siExiste(); 
        return(bandera);
    }        
            
    public Contrato recupera(String nro){
        Contrato miContrato=new Contrato(nro);  
        ContratoDAO miContratoDAO=new ContratoDAO(miContrato);
        miContrato=miContratoDAO.getContrato();
        
        return(miContrato);
    }
    public ArrayList listadoSimple(){
        ContratoDAO miContratoDAO=new ContratoDAO();
        return(miContratoDAO.getContratos());   
        
    }
    
    public boolean siTrabaja(String rut){
        Boolean trabaja=false;
        ContratoDAO miContratoDAO=new ContratoDAO();
        trabaja=miContratoDAO.siTrabaja(rut); 
        return(trabaja);
    }

    
    
    
    
    
    
}
