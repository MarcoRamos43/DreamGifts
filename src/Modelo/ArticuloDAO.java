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
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ArticuloDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
   
    
   public ArrayList<CategoriaArticulo> mostrarComboBoxCatArt(){
       ArrayList mostrarComboBoxCatArt = new ArrayList();
       CategoriaArticulo catArt;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM categoria_articulo");
            rs = ps.executeQuery();
           while (rs.next()){  
              catArt = new CategoriaArticulo(); 
              catArt.setIdCatArt(rs.getInt(1));
              catArt.setNombreCatArt(rs.getString(2));
              catArt.setEstadoCatArt(rs.getString(3));
           mostrarComboBoxCatArt.add(catArt);          
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Categoria Articulos"+ e.getMessage());
        }
        return mostrarComboBoxCatArt;
    }
   
   public ArrayList<Proveedor> mostrarComboBoxProveedorArt(){
       ArrayList mostrarComboBoxProveedorArt = new ArrayList();
       Proveedor pro;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT PRO_ID_PROVEEDOR, PRO_RUT, PRO_NOMBRE FROM proveedor");
            rs = ps.executeQuery();
           while (rs.next()){  
              pro = new Proveedor(); 
              pro.setIdProveedor(rs.getInt(1));
              pro.setRutProveedor(rs.getString(2));
              pro.setNombreProveedor(rs.getString(3));
             mostrarComboBoxProveedorArt.add(pro);          
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Proveedores"+ e.getMessage());
        }
        return mostrarComboBoxProveedorArt;
    }
    
    public void insertarArticulo (String nombreArticulo, int unidadArticulo, String marcaArticulo, int categoriaArticulo, String fechaVencimientoArticulo, int proveedorArticulo, String estadoArticulo){
        String sql = "insert into articulo (CAT_ID_CATEGORIA, ART_DESCRIPCION, ART_STOCK, ART_FECHA_VENCIMIENTO, ART_ID_PROVEEDOR, ART_MARCA, ART_ESTADO) values(?,?,?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, categoriaArticulo);
            ps.setString(2, nombreArticulo);
            ps.setInt(3, unidadArticulo);
            ps.setString(4,fechaVencimientoArticulo);
            ps.setInt(5,proveedorArticulo);
            ps.setString(6,marcaArticulo);
            ps.setString(7,estadoArticulo);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Articulo Exitoso");
            ps.close();
            con.close();
        } catch (SQLException e){
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error de Registro de Articulo "+e.getMessage());
        }
       // return l;
    }

    public ArrayList<Articulo> mostrarArticulo(){
       ArrayList mostrarArticulo = new ArrayList();
       Articulo art;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM articulo");
            rs = ps.executeQuery();
           while (rs.next()){  
              art = new Articulo(); 
              art.setIdArticulo(rs.getInt(1));
              art.setIdCatArticulo(rs.getInt(2));
              art.setNombreArticulo(rs.getString(3));
              art.setStockArticulo(rs.getInt(4));
              art.setFechaVencimientoArticulo(rs.getString(5));
              art.setIdProvArticulo(rs.getInt(6));
              art.setMarcaArticulo(rs.getString(7));
              art.setEstadoArticulo(rs.getString(8));
              
           mostrarArticulo.add(art);
             
           } 
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Articulo"+ e.getMessage());
            
        }
        return mostrarArticulo;
    }

       public Articulo leerArticulo(int idArticulo){
       Articulo art= new Articulo();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM articulo where ART_ID_ARTICULO=?");
            ps.setInt(1, idArticulo);
            rs = ps.executeQuery();
           while (rs.next()){  
              art.setIdArticulo(rs.getInt(1));
              art.setIdCatArticulo(rs.getInt(2));
              art.setNombreArticulo(rs.getString(3));
              art.setStockArticulo(rs.getInt(4));
              art.setFechaVencimientoArticulo(rs.getString(5));
              art.setIdProvArticulo(rs.getInt(6));
              art.setMarcaArticulo(rs.getString(7));
              art.setEstadoArticulo(rs.getString(8));
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Articulo"+ e.getMessage());
        }
        return art;
    }

        public void modificarArticulo(Articulo a){
        try{
            int ID = a.getIdArticulo();
            String NombreArticulo = a.getNombreArticulo();
            int UnidadArticulo = a.getStockArticulo();
            String FechaVencimientoArticulo = a.getFechaVencimientoArticulo();
            int CatArt = a.getIdCatArticulo();
            int ProArt = a.getIdProvArticulo();
            String MarcaArticulo = a.getMarcaArticulo();
            String EstadoArticulo = a.getEstadoArticulo();
            String sql = "update articulo set CAT_ID_CATEGORIA=?, ART_DESCRIPCION=?, ART_STOCK=?, ART_FECHA_VENCIMIENTO=?, ART_ID_PROVEEDOR=?, ART_MARCA=?, ART_ESTADO=? where ART_ID_ARTICULO=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,CatArt);
            ps.setString(2,NombreArticulo);
            ps.setInt(3,UnidadArticulo);
            ps.setString(4,FechaVencimientoArticulo);
            ps.setInt(5,ProArt);
            ps.setString(6,MarcaArticulo);
            ps.setString(7,EstadoArticulo);
            ps.setInt(8,ID);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registro de Articulo Editado Exitoso"); 
            ps.close();
            con.close();
        } catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error en edición de Registros de Articulos"+e.getMessage());  
        }     
    }
         public  Vector<Articulo>  mostrarArticulosPack(){
           
       Vector <Articulo> mostrarArticuloPack = new Vector<Articulo>();
       Articulo art;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT ART_ID_ARTICULO, ART_DESCRIPCION, ART_STOCK FROM articulo");
            rs = ps.executeQuery();
           while (rs.next()){  
              art = new Articulo(); 
              art.setIdArticulo(rs.getInt(1));
              art.setNombreArticulo(rs.getString(2));
              art.setStockArticulo(rs.getInt(3));
           mostrarArticuloPack.add(art);
             
           } 
            ps.close();
            con.close();
        } catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Articulo"+ e.getMessage());
            
        }
        return mostrarArticuloPack;
        }
   
}
