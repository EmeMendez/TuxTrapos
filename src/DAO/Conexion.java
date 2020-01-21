/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Melón
 */
public class Conexion {
    public static Connection GetConexion(){
        Connection Conexion = null;
        Statement stat=null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor= "jdbc:mysql://localhost/TuxTrapos";
            String usuarioDB="java";
            String passwordDB="1234";
            Conexion=DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            stat=Conexion.createStatement();
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex,"Error en la conexión"+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
            Conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex,"Error SQL en la Conexión"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            Conexion=null;
        }   
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex, "Error común en la Conexión"+ ex.getMessage(),JOptionPane.ERROR_MESSAGE);
            Conexion=null;
        }
        finally
        {
            return Conexion;
        }
    }
}
