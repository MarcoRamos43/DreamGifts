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
 
public class bancosDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet res;
    
public boolean RegistrarBancos(bancos rs) {
        String sql = "INSERT INTO bancos(BAN_DESCRIPCION) VALUES (?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, rs.getBAN_DESCRIPCION());
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
    
    public List ListarBancos(){
        List<bancos> ListaRs = new ArrayList();
        String sql = "SELECT * FROM bancos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            res = ps.executeQuery();
            while (res.next()){
                bancos rs = new bancos();
                rs.setBAN_ID_BANCO(res.getInt("BAN_ID_BANCO"));
                rs.setBAN_DESCRIPCION(res.getString("BAN_DESCRIPCION"));
                ListaRs.add(rs);
            }
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return ListaRs;
    }
    
    public boolean EliminarBancos(int BAN_ID_BANCO){
        String sql = "DELETE FROM bancos WHERE BAN_ID_BANCO = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, BAN_ID_BANCO);
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
    
    public boolean EditarBancos (bancos rs) {
        String sql = "UPDATE bancos SET BAN_DESCRIPCION=? WHERE BAN_ID_BANCO=?";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, rs.getBAN_DESCRIPCION());
            ps.setInt(2, rs.getBAN_ID_BANCO());
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

