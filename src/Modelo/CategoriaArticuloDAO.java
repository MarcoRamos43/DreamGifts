package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CategoriaArticuloDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public CategoriaArticulo leerCatArt(int idCategoriaArticulo){
       CategoriaArticulo catArt= new CategoriaArticulo();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("SELECT * FROM categoria_articulo where CAT_ID_CATEGORIA=?");
            ps.setInt(1, idCategoriaArticulo);
            rs = ps.executeQuery();
           while (rs.next()){  
              catArt.setIdCatArt(rs.getInt(1));
              catArt.setNombreCatArt(rs.getString(2));
              catArt.setEstadoCatArt(rs.getString(3));
           }    
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al leer Categoria Articulo"+ e.getMessage());
        }
        return catArt;
    }
    
}
