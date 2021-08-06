/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class bancosDAO{
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    public void insertarBancos (String nombreBancos, String estadoBancos){
       // Usuario l = new Usuario();
        
        String sql = "insert into bancos (BAN_DESCRIPCION, BAN_ESTADO) values(?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreBancos);
            ps.setString(2, estadoBancos);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Banco Exitoso");
            ps.close();
            con.close();
        } catch (SQLException e){
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error de Registro de Banco"+e.getMessage());
        }
       // return l;
    }
    
   
    public ArrayList<bancos> mostrarBancos(){
       ArrayList mostrarBancos = new ArrayList();
       bancos banco;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM bancos");
            rs = ps.executeQuery();
           while (rs.next()){  
              banco = new bancos(); 
              banco.setIdBancos(rs.getInt(1));
              banco.setNombreBancos(rs.getString(2));
              banco.setEstadoBancos(rs.getString(3));
           mostrarBancos.add(banco);
           
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        return mostrarBancos;
    }
    
        public void modificarBancos(bancos b){
        try{
            int ID = b.getIdBancos();
            String Nombre = b.getNombreBancos();
            String Estado = b.getEstadoBancos();
            String sql = "update bancos set BAN_DESCRIPCION=?, BAN_ESTADO=? where BAN_ID_BANCO=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,Nombre);
            ps.setString(2,Estado);
          //  ps.setString (3,u.getValidarPassUsuario());
            ps.setInt(3,ID);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registro Editado Exitoso"); 
            ps.close();
            con.close();
        } catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error en edición de Registros"+e.getMessage());  
        }
    }
    

    public bancos leerBancos(int idBancos){
         bancos com= new bancos();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM bancos where BAN_ID_BANCO=?");
            ps.setInt(1, idBancos);
            rs = ps.executeQuery();
           while (rs.next()){  
              com.setIdBancos(rs.getInt(1));
              com.setNombreBancos(rs.getString(2));
              com.setEstadoBancos(rs.getString(3));
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Bancos"+ e.getMessage());
        }
        return com;
    }

}