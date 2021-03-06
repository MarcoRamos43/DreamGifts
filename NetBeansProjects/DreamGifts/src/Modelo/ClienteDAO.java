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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ClienteDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet res;
    
    public boolean RegistrarCliente (Cliente rs) {
        String sql = "INSERT INTO cliente(CLI_RUT, CLI_NOMBRE, CLI_APELLIDO, CLI_DIRECCION, CLI_TELEFONO, CLI_CORREO) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, rs.getCLI_RUT());
            ps.setString(2, rs.getCLI_NOMBRE());
            ps.setString(3, rs.getCLI_APELLIDO());
            ps.setString(4, rs.getCLI_DIRECCION());
            ps.setInt(5, rs.getCLI_TELEFONO());
            ps.setString(6, rs.getCLI_CORREO());
            
            
            ps.execute();
            return true;
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally{
            try {
                con.close();
            } catch (SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public List ListarCliente(){
        List<Cliente> ListaRs = new ArrayList();
        String sql = "SELECT * FROM cliente";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            res = ps.executeQuery();
            while (res.next()){
                Cliente rs = new Cliente();
                rs.setCLI_ID_CLIENTE (res.getInt("CLI_ID_CLIENTE "));
                rs.setCLI_RUT(res.getInt("CLI_RUT"));
                rs.setCLI_NOMBRE(res.getString("CLI_NOMBRE"));
                rs.setCLI_APELLIDO(res.getString("CLI_APELLIDO"));
                rs.setCLI_DIRECCION(res.getString("CLI_DIRECCION"));
                
                rs.setCLI_TELEFONO(res.getInt("CLI_TELEFONO"));
                rs.setCLI_CORREO(res.getString("CLI_CORREO"));
                
                
                
                ListaRs.add(rs);
            }
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return ListaRs;
    }
    
    public boolean EliminarCliente (int CLI_ID_CLIENTE){
        String sql = "DELETE FROM cliente WHERE CLI_ID_CLIENTE = ?";
        
        try {
            ps = con.prepareStatement(sql);
           
            ps.setInt(1, CLI_ID_CLIENTE);
            ps.execute();
            return true;
        } catch (SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex){
                System.out.println(ex.toString());
            }
        }
    }
    
    public boolean EditarCliente (Cliente rs) {
        String sql = "UPDATE cliente SET CLI_NOMBRE=? WHERE CLI_ID_CLIENTE=?";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, rs.getCLI_NOMBRE());
            ps.setInt(2, rs.getCLI_ID_CLIENTE ());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e){
                System.out.println(e.toString());
            }
        }
    }
}
