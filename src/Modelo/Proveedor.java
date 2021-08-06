package Modelo;

public class Proveedor {
    private int idProveedor;
    private String rutProveedor;
    private String nombreProveedor;
    private String DireccionProveedor;
    private String RazonSocialProveedor;
    private String TelefonoProveedor;
    private String CorreoProveedor;
    private String EstadoProveedor;

public Proveedor(){
}    
    public Proveedor(int idProveedor, String rutProveedor, String nombreProveedor, String DireccionProveedor, String RazonSocialProveedor, String TelefonoProvedor, String CorreoProveedor, String EstadoProveedor) {
        this.idProveedor = idProveedor;
        this.rutProveedor = rutProveedor;
        this.nombreProveedor = nombreProveedor;
        this.DireccionProveedor = DireccionProveedor;
        this.RazonSocialProveedor = RazonSocialProveedor;
        this.TelefonoProveedor = TelefonoProveedor;
        this.CorreoProveedor = CorreoProveedor;
        this.EstadoProveedor = EstadoProveedor;
    }
    
    public Proveedor(int idProveedor, String rutProveedor, String nombreProveedor){
        this.idProveedor = idProveedor;
        this.rutProveedor = rutProveedor;
        this.nombreProveedor = nombreProveedor;    
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRutProveedor() {
        return rutProveedor;
    }

    public void setRutProveedor(String rutProveedor) {
        this.rutProveedor = rutProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccionProveedor() {
        return DireccionProveedor;
    }

    public void setDireccionProveedor(String DireccionProveedor) {
        this.DireccionProveedor = DireccionProveedor;
    }

    public String getRazonSocialProveedor() {
        return RazonSocialProveedor;
    }

    public void setRazonSocialProveedor(String RazonSocialProveedor) {
        this.RazonSocialProveedor = RazonSocialProveedor;
    }

    public String getTelefonoProveedor() {
        return TelefonoProveedor;
    }

    public void setTelefonoProveedor(String TelefonoProveedor) {
        this.TelefonoProveedor = TelefonoProveedor;
    }

    public String getCorreoProveedor() {
        return CorreoProveedor;
    }

    public void setCorreoProveedor(String CorreoProveedor) {
        this.CorreoProveedor = CorreoProveedor;
    }
    
    public String getEstadoProveedor(){
        return EstadoProveedor;
    }
    
    public void setEstadoProveedor(String EstadoProveedor) {
        this.EstadoProveedor = EstadoProveedor;
    }
    
    public String toString(){
        return nombreProveedor;
    }
}
