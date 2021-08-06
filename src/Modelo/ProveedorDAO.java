
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProveedorDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    
    
    public void insertarProveedor (String rutProveedor, String nombreProveedor,String DireccionProveedor, String RazonSocialProveedor, String TelefonoProveedor, String CorreoProveedor, String EstadoProveedor){
       // Usuario l = new Usuario();
        
        String sql = "insert into proveedor (PRO_RUT, PRO_NOMBRE, PRO_DIRECCION, PRO_RAZON_SOCIAL, PRO_TELEFONO, PRO_CORREO, PRO_ESTADO ) values(?,?,?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, rutProveedor);
            ps.setString(2, nombreProveedor);
            ps.setString(3, DireccionProveedor);
            ps.setString(4,RazonSocialProveedor);
            ps.setString(5,TelefonoProveedor);
            ps.setString(6,CorreoProveedor);
            ps.setString(7,EstadoProveedor);
            
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Proveedor Exitoso");
            ps.close();
            con.close();
        } catch (SQLException e){
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error de Registro de Proveedor "+e.getMessage());
        }
       // return l;
    }
    
     public ArrayList<Proveedor> mostrarProveedor(){
       ArrayList mostrarProveedor = new ArrayList();
       Proveedor pro;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM proveedor");
            rs = ps.executeQuery();
           while (rs.next()){  
              pro = new Proveedor(); 
              pro.setIdProveedor(rs.getInt(1));
              pro.setRutProveedor(rs.getString(2));
              pro.setNombreProveedor(rs.getString(3));
              pro.setDireccionProveedor(rs.getString(4));
              pro.setRazonSocialProveedor(rs.getString(5));
              pro.setTelefonoProveedor(rs.getString(6));
              pro.setCorreoProveedor(rs.getString(7));
              pro.setEstadoProveedor(rs.getString(8));
              
           mostrarProveedor.add(pro);
           
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        return mostrarProveedor;
    }
    
    
    
    public Proveedor leerProveedor(int idProveedor){
       Proveedor pro= new Proveedor();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT PRO_ID_PROVEEDOR, PRO_RUT, PRO_NOMBRE, PRO_DIRECCION, PRO_RAZON_SOCIAL, PRO_TELEFONO, PRO_CORREO, PRO_ESTADO FROM proveedor where PRO_ID_PROVEEDOR=?");
            ps.setInt(1, idProveedor);
            rs = ps.executeQuery();
           while (rs.next()){  
              pro.setIdProveedor(rs.getInt(1));
              pro.setRutProveedor(rs.getString(2));
              pro.setNombreProveedor(rs.getString(3));
              pro.setDireccionProveedor(rs.getString(4));
              pro.setRazonSocialProveedor(rs.getString(5));
              pro.setTelefonoProveedor(rs.getString(6));
              pro.setCorreoProveedor(rs.getString(7));
               pro.setEstadoProveedor(rs.getString(8));
              
              
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Proveedor "+"id_proveedor: "+idProveedor+e.getMessage());
        }
        return pro;
    }

    
      public void modificarProveedor(Proveedor p){
        try{
            int ID = p.getIdProveedor();
            String RutProveedor = p.getRutProveedor();
            String NombreProveedor = p.getNombreProveedor();
            String DireccionProveedor = p.getDireccionProveedor();
             String RazonSocialProveedor = p.getRazonSocialProveedor();
            String TelefonoProveedor = p.getTelefonoProveedor();
            String CorreoProveedor = p.getCorreoProveedor();
            
            String EstadoProveedor = p.getEstadoProveedor();
            String sql = "update proveedor set PRO_RUT=?, PRO_NOMBRE=?, PRO_DIRECCION=?, PRO_RAZON_SOCIAL=?, PRO_TELEFONO=?, PRO_CORREO=?, PRO_ESTADO=? where PRO_ID_PROVEEDOR=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
           
            ps.setString(1,RutProveedor);
            ps.setString(2,NombreProveedor);
            ps.setString(3,DireccionProveedor);
             ps.setString(4,RazonSocialProveedor);
            ps.setString(5,TelefonoProveedor);
            ps.setString(6,CorreoProveedor);
           
            ps.setString(7,EstadoProveedor);
          //  ps.setString (3,u.getValidarPassUsuario());
            ps.setInt(8,ID);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registro de Proveedor Editado Exitoso"); 
            ps.close();
            con.close();
        } catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error en edición de Proveedor"+e.getMessage());  
        }
    }
    

}
