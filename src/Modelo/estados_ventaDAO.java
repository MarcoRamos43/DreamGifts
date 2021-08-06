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


public class estados_ventaDAO{
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    public void insertarEstado (String nombreEstado, String estadoEstado){
       // Usuario l = new Usuario();
        
        String sql = "insert into estados_venta (EST_DESCRIPCION, EST_ESTADO) values(?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreEstado);
            ps.setString(2, estadoEstado);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro de estado de la venta Exitoso");
            ps.close();
            con.close();
        } catch (SQLException e){
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error de Registro del estado de la venta"+e.getMessage());
        }
       // return l;
    }
    
   
    public ArrayList<estados_venta> mostrarEstado(){
       ArrayList mostrarEstado = new ArrayList();
       estados_venta estado;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM estados_venta");
            rs = ps.executeQuery();
           while (rs.next()){  
              estado = new estados_venta(); 
              estado.setIdestados(rs.getInt(1));
              estado.setNombreEstado(rs.getString(2));
              estado.setEstadoEstado(rs.getString(3));
           mostrarEstado.add(estado);
           
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        return mostrarEstado;
    }
    
        public void modificarEstado(estados_venta ev){
        try{
            int ID = ev.getIdestados();
            String Nombre = ev.getNombreEstado();
            String Estado = ev.getEstadoEstado();
            String sql = "update estados_venta set EST_DESCRIPCION=?, EST_ESTADO=? where EST_ID_ESTADO =?";
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
    

    public estados_venta leerEstado(int idEstado){
         estados_venta com= new estados_venta();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM estados_venta where EST_ID_ESTADO =?");
            ps.setInt(1, idEstado);
            rs = ps.executeQuery();
           while (rs.next()){  
              com.setIdestados(rs.getInt(1));
              com.setNombreEstado(rs.getString(2));
              com.setEstadoEstado(rs.getString(3));
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Comuna"+ e.getMessage());
        }
        return com;
    }

}

