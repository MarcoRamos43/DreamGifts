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


public class categoria_ventaDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet res;
    
    public boolean Registrarcategoria_venta(categoria_venta cv) {
        String sql = "INSERT INTO categoria_venta(CATVENTA_DESCRIPCION) VALUES (?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cv.getCATVENTA_DESCRIPCION());
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
    
    public List Listarcategoria_venta(){
        List<categoria_venta> ListaCv = new ArrayList();
        String sql = "SELECT * FROM categoria_venta";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            res = ps.executeQuery();
            while (res.next()){
                categoria_venta catventa = new categoria_venta();
                catventa.setID_CATEGORIAVENTA(res.getInt("ID_CATEGORIAVENTA"));
                catventa.setCATVENTA_DESCRIPCION(res.getString("CATVENTA_DESCRIPCION"));
                ListaCv.add(catventa);
            }
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return ListaCv;
    }
    
    public boolean Eliminarcategoria_venta(int ID_CATEGORIAVENTA){
        String sql = "DELETE FROM categoria_venta WHERE ID_CATEGORIAVENTA = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_CATEGORIAVENTA);
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
    
    public boolean Editarcategoria_venta(categoria_venta catventa) {
        String sql = "UPDATE categoria_venta SET CATVENTA_DESCRIPCION=? WHERE ID_CATEGORIAVENTA=?";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, catventa.getCATVENTA_DESCRIPCION());
            ps.setInt(2, catventa.getID_CATEGORIAVENTA());
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
