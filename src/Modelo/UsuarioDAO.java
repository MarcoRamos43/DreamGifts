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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UsuarioDAO{
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    String estadoUsuario1 = "Activo";
    public void insertarUsuario (String nombreUsuario, String passUsuario, String correoUsuario){
       // Usuario l = new Usuario();
        
        String sql = "insert into usuarios (USU_NOMBRE, USU_CLAVE, USU_EMAIL, USU_ESTADO ) values(?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, passUsuario);
            ps.setString(3, correoUsuario);
            ps.setString(4,estadoUsuario1);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException e){
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error de Registros"+e.getMessage());
        }
       // return l;
    }
    
   
    public ArrayList<Usuario> mostrarUsuario(){
       ArrayList mostrarUsuario = new ArrayList();
       Usuario usuario;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM usuarios");
            rs = ps.executeQuery();
           while (rs.next()){  
              usuario = new Usuario(); 
              usuario.setIdUsuario(rs.getInt(1));
              usuario.setNombreUsuario(rs.getString(2));
              usuario.setPassUsuario(rs.getString(3));
              usuario.setCorreoUsuario(rs.getString(4));
              usuario.setEstadoUsuario(rs.getString(5));
           mostrarUsuario.add(usuario);
           
           }    
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        return mostrarUsuario;
    }
    
    public void modificarUsuario(Usuario u){
        try{
            int ID = u.getIdUsuario();
            String Nombre = u.getNombreUsuario();
            String Clave = u.getPassUsuario();
            String Correo = u.getCorreoUsuario();
            String Estado = u.getEstadoUsuario();
            String sql = "update usuarios set USU_NOMBRE=?, USU_CLAVE=?, USU_EMAIL=?, USU_ESTADO=? where USU_ID_USUARIO=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,Nombre);
            ps.setString(2,Clave);
            ps.setString(3,Correo);
            ps.setString(4,Estado);
          //  ps.setString (3,u.getValidarPassUsuario());
            ps.setInt(5,ID);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registro Editado Exitoso"); 
            
        } catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error en edición de Registros"+e.getMessage());  
        }
    }
    
     public void modificarEstadoUsuario(Usuario u){
        try{
            int ID = u.getIdUsuario();
            //String Clave = u.getPassUsuario();
            //String Correo = u.getCorreoUsuario();
            String Estado = "Inactivo"; 
            String sql = "update usuarios set USU_ESTADO=? where USU_ID_USUARIO=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,Estado);
          //  ps.setString (3,u.getValidarPassUsuario());
            ps.setInt(2,ID);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario Desactivado de manera Exitosa"); 
            
        } catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error en desactivacion de Usuario"+e.getMessage());  
        }
    }
   
       public Usuario leerUsuario(int idUsuario){
       Usuario us= new Usuario();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM usuarios where USU_ID_USUARIO=?");
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
           while (rs.next()){  
              us.setIdUsuario(rs.getInt(1));
              us.setNombreUsuario(rs.getString(2));
              us.setPassUsuario(rs.getString(3));
              us.setCorreoUsuario(rs.getString(4));
              us.setEstadoUsuario(rs.getString(5));
           }    
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Usuario"+ e.getMessage());
        }
        return us;
    }

}
