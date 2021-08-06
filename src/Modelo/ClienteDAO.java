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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.logging.Logger;

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
    
   public ArrayList<Rrss> mostrarComboBoxRrss(){
       ArrayList mostrarComboBoxRrss = new ArrayList();
       Rrss rrss;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM rrss");
            rs = ps.executeQuery();
           while (rs.next()){  
              rrss = new Rrss(); 
              rrss.setIdRrss(rs.getInt(1));
              rrss.setNombreRrss(rs.getString(2));
              rrss.setEstadoRrss(rs.getString(3));
           mostrarComboBoxRrss.add(rrss);          
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        return mostrarComboBoxRrss;
    }
    
    public void insertarCliente (String nombreCliente, String rutCliente,String fechaNacimientoCliente, String telefonoCliente, String correoCliente, int redSocialCliente, String direccionCliente, String estadoCliente){
       // Usuario l = new Usuario();
        
        String sql = "insert into cliente (CLI_NOMBRE, CLI_RUT, CLI_FECHA_NACIMIENTO, CLI_TELEFONO, CLI_CORREO, CLI_RED_SOCIAL, CLI_DIRECCION, CLI_ESTADO ) values(?,?,?,?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCliente);
            ps.setString(2, rutCliente);
            ps.setString(3, fechaNacimientoCliente);
            ps.setString(4,telefonoCliente);
            ps.setString(5,correoCliente);
            ps.setInt(6,redSocialCliente);
            ps.setString(7,direccionCliente);
            ps.setString(8,estadoCliente);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Cliente Exitoso");
            ps.close();
            con.close();
        } catch (SQLException e){
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error de Registro de Cliente "+e.getMessage());
        }
       // return l;
    }
    
    public ArrayList<Cliente> mostrarCliente(){
       ArrayList mostrarCliente = new ArrayList();
       Cliente cliente;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM cliente");
            rs = ps.executeQuery();
           while (rs.next()){  
              cliente = new Cliente(); 
              cliente.setIdCliente(rs.getInt(1));
              cliente.setNombreCliente(rs.getString(2));
              cliente.setRutCliente(rs.getString(3));
              cliente.setFechaNacimientoCliente(rs.getString(4));
              cliente.setTelefonoCliente(rs.getString(5));
              cliente.setCorreoCliente(rs.getString(6));
              cliente.setRedSocialCliente(rs.getInt(7));
              cliente.setDireccionCliente(rs.getString(8));
              cliente.setEstadoCliente(rs.getString(9));
           mostrarCliente.add(cliente);
           
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        return mostrarCliente;
    }
    
       public Cliente leerCliente(int idCliente){
       Cliente cli= new Cliente();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM cliente where CLI_ID_CLIENTE=?");
            ps.setInt(1, idCliente);
            rs = ps.executeQuery();
           while (rs.next()){  
              cli.setIdCliente(rs.getInt(1));
              cli.setNombreCliente(rs.getString(2));
              cli.setRutCliente(rs.getString(3));
              cli.setFechaNacimientoCliente(rs.getString(4));
              cli.setTelefonoCliente(rs.getString(5));
              cli.setCorreoCliente(rs.getString(6));
              cli.setRedSocialCliente(rs.getInt(7));
              cli.setDireccionCliente(rs.getString(8));
              cli.setEstadoCliente(rs.getString(9));
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Cliente"+ e.getMessage());
        }
        return cli;
    }
    
    public void modificarCliente(Cliente c){
        try{
            int ID = c.getIdCliente();
            String NombreCliente = c.getNombreCliente();
            String RutCliente = c.getRutCliente();
            String FechaNacimientoCliente = c.getFechaNacimientoCliente();
            String TelefonoCliente = c.getTelefonoCliente();
            String CorreoCliente = c.getCorreoCliente();
            int RedSocialCliente = c.getRedSocialCliente();
            String DireccionCliente = c.getDireccionCliente();
            String EstadoCliente = c.getEstadoCliente();
            String sql = "update cliente set CLI_NOMBRE=?, CLI_RUT=?, CLI_FECHA_NACIMIENTO=?, CLI_TELEFONO=?, CLI_CORREO=?, CLI_RED_SOCIAL=?, CLI_DIRECCION=?, CLI_ESTADO=? where CLI_ID_CLIENTE=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,NombreCliente);
            ps.setString(2,RutCliente);
            ps.setString(3,FechaNacimientoCliente);
            ps.setString(4,TelefonoCliente);
            ps.setString(5,CorreoCliente);
            ps.setInt(6,RedSocialCliente);
            ps.setString(7,DireccionCliente);
            ps.setString(8,EstadoCliente);
          //  ps.setString (3,u.getValidarPassUsuario());
            ps.setInt(9,ID);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registro de Cliente Editado Exitoso"); 
            ps.close();
            con.close();
        } catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error en edición de Registros"+e.getMessage());  
        }
    }
    

    
    
}
