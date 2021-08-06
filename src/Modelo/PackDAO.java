package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PackDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public void insertarPack (String nombrePack, float costoPack, int stockPack, String estadoPack ){
        String sql = "insert into pack (PCK_NOMBRE, PCK_COSTO, PCK_STOK, PCK_ESTADO) values(?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombrePack);
            ps.setFloat(2, costoPack);
            ps.setInt(3, stockPack);
            ps.setString(4,estadoPack);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Pack Exitoso");
            ps.close();
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error de Registro de Pack "+e.getMessage());
        }
    }    
}
