package Modelo;

/**
 *
 * @author Usuario
 */
public class bancos {
    
    private int BAN_ID_BANCO;
    private String BAN_DESCRIPCION;
    
    public bancos() {
    
    }

    public bancos(int BAN_ID_BANCO, String BAN_DESCRIPCION) {
        this.BAN_ID_BANCO = BAN_ID_BANCO;
        this.BAN_DESCRIPCION = BAN_DESCRIPCION;
    }

    public int getBAN_ID_BANCO() {
        return BAN_ID_BANCO;
    }

    public void setBAN_ID_BANCO(int BAN_ID_BANCO) {
        this.BAN_ID_BANCO = BAN_ID_BANCO;
    }

    public String getBAN_DESCRIPCION() {
        return BAN_DESCRIPCION;
    }

    public void setBAN_DESCRIPCION(String BAN_DESCRIPCION) {
        this.BAN_DESCRIPCION = BAN_DESCRIPCION;
    }
    
}



