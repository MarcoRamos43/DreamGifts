/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RrssDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public Rrss leerRrss(int idRrss){
       Rrss rrss= new Rrss();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM rrss where RRS_ID_RRSS=?");
            ps.setInt(1, idRrss);
            rs = ps.executeQuery();
           while (rs.next()){  
              rrss.setIdRrss(rs.getInt(1));
              rrss.setNombreRrss(rs.getString(2));
              rrss.setEstadoRrss(rs.getString(3));
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Red Social"+ e.getMessage());
        }
        return rrss;
    }

}
