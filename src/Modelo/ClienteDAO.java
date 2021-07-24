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
public class ClienteDAO {
    
   Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    String estadoCliente1 = "Activo";
    public void insertarUsuario (String nombreCliente, String apellidoCliente,String direccionCliente, int telefonoCliente, String correoCliente){
       // Usuario l = new Usuario();
        
        String sql = "insert into usuarios (CLI_NOMBRE, CLI_APELLIDO, CLI_DIRECCION, CLI_TELEFONO, CLI_CORREO, CLI_ESTADO ) values(?,?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCliente);
            ps.setString(2, apellidoCliente);
            ps.setString(3, direccionCliente);
            ps.setInt(4,telefonoCliente);
            ps.setString(5,correoCliente);
            ps.setString(6,estadoCliente1);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Cliente Exitoso");
        } catch (SQLException e){
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error de Registro de Cliente "+e.getMessage());
        }
       // return l;
    }
    
    
}
