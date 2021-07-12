/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ClienteDAO {
    
    Conexion cn = new Conexion();
    
    Connection con;
    
    PreparedStatement ps;
    
    public boolean RegistrarCliente(Cliente cl){
        
        String sql = "INSERT INTO cliente (CLI_NOMBRE, CLI_APELLIDO, CLI_DIRECCION, CLI_TELEFONO, CLI_CORREO) VALUES (?,?,?,?,?)";
        
        try{
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cl.getCLI_ID_CLIENTE());
            ps.setString(2, cl.getCLI_NOMBRE());
            ps.setString(3, cl.getCLI_APELLIDO());
            ps.setString(4, cl.getCLI_DIRECCION());
            ps.setInt(5, cl.getCLI_TELEFONO());
            ps.setString(6, cl.getCLI_CORREO());
            ps.execute();
            return true;
            
        
        } catch (SQLException e){
            JOptionPane.showInternalMessageDialog(null, e.toString());
            return false;
        
        } finally{
            
            try {
                con.close();
            } catch (SQLException e) {
                
                System.out.println(e.toString());
            }
            
 
        }
        
    }
    
    
}
