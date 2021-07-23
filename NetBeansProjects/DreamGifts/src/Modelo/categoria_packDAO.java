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


public class categoria_packDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet res;
    
    public boolean Registrarcategoria_pack(categoria_pack cv) {
        String sql = "INSERT INTO categoria_pack(CATPACK_DESCRIPCION) VALUES (?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cv.getCATPACK_DESCRIPCION());
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
    
    public List Listarcategoria_pack(){
        List<categoria_pack> ListaCv = new ArrayList();
        String sql = "SELECT * FROM categoria_pack";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            res = ps.executeQuery();
            while (res.next()){
                categoria_pack catpack = new categoria_pack();
                catpack.setID_CATEGORIAPACK(res.getInt("ID_CATEGORIAPACK"));
                catpack.setCATPACK_DESCRIPCION(res.getString("CATPACK_DESCRIPCION"));
                ListaCv.add(catpack);
            }
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return ListaCv;
    }
    
    public boolean Eliminarcategoria_pack(int ID_CATEGORIAPACK){
        String sql = "DELETE FROM categoria_pack WHERE ID_CATEGORIAPACK = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_CATEGORIAPACK);
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
    
    public boolean Editarcategoria_pack(categoria_pack catpack) {
        String sql = "UPDATE categoria_pack SET CATPACK_DESCRIPCION=? WHERE ID_CATEGORIAPACK=?";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, catpack.getCATPACK_DESCRIPCION());
            ps.setInt(2, catpack.getID_CATEGORIAPACK());
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
