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


public class ComunaDAO{
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    public void insertarComuna (String nombreComuna, String estadoComuna){
       // Usuario l = new Usuario();
        
        String sql = "insert into comunas (COM_DESCRIPCION, COM_ESTADO) values(?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreComuna);
            ps.setString(2, estadoComuna);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Comuna Exitoso");
            ps.close();
            con.close();
        } catch (SQLException e){
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error de Registro de Comuna"+e.getMessage());
        }
       // return l;
    }
    
   
    public ArrayList<Comuna> mostrarComuna(){
       ArrayList mostrarComuna = new ArrayList();
       Comuna comuna;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM comunas");
            rs = ps.executeQuery();
           while (rs.next()){  
              comuna = new Comuna(); 
              comuna.setIdComuna(rs.getInt(1));
              comuna.setNombreComuna(rs.getString(2));
              comuna.setEstadoComuna(rs.getString(3));
           mostrarComuna.add(comuna);
           
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        return mostrarComuna;
    }
    
        public void modificarComuna(Comuna c){
        try{
            int ID = c.getIdComuna();
            String Nombre = c.getNombreComuna();
            String Estado = c.getEstadoComuna();
            String sql = "update comunas set COM_DESCRIPCION=?, COM_ESTADO=? where COM_ID_COMUNA=?";
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
    

    public Comuna leerComuna(int idComuna){
         Comuna com= new Comuna();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM comunas where COM_ID_COMUNA=?");
            ps.setInt(1, idComuna);
            rs = ps.executeQuery();
           while (rs.next()){  
              com.setIdComuna(rs.getInt(1));
              com.setNombreComuna(rs.getString(2));
              com.setEstadoComuna(rs.getString(3));
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Comuna"+ e.getMessage());
        }
        return com;
    }

}
