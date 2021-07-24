package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String correo, String pass){
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE USU_EMAIL = ? AND USU_CLAVE = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()){
                l.setId(rs.getInt("USU_ID_USUARIO"));
                l.setNombre(rs.getString("USU_NOMBRE"));
                l.setCorreo(rs.getString("USU_CLAVE"));
                l.setPass(rs.getString("USU_EMAIL"));
            }
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return l;
    }
}
