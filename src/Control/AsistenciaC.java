/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import DAO.AsistenciaDAO;
import java.util.ArrayList;



/**
 * 
 * @author Mélon
 */
public class AsistenciaC {

    public ArrayList MostrarAsistencia(String a, String b, String c){
        AsistenciaDAO miAdao=new AsistenciaDAO();
        return(miAdao.getPorFecha(a,b,c));   
        
    } 
    
    public ArrayList ListarAsistencia(){
        AsistenciaDAO Adao = new AsistenciaDAO();
        return(Adao.getAsistencias());
    } 
    
    public void InsertAsistencia(String id,String dato){
        AsistenciaDAO Adao = new AsistenciaDAO();
        Adao.InsertAsistencia(id, dato);
    }
    
}
