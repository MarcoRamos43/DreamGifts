package Modelo;

public class Articulo {
    private int idArticulo;
    private int idCatArticulo;
    private String nombreArticulo;
    private int stockArticulo;
    private String FechaVencimientoArticulo;
    private int idProvArticulo;
    private String marcaArticulo;
    private String estadoArticulo;

public Articulo(){
}

    public Articulo(int idArticulo, int idCatArticulo, String nombreArticulo, int stockArticulo, String FechaVencimientoArticulo, int idProvArticulo, String marcaArticulo, String estadoArticulo) {
        this.idArticulo = idArticulo;
        this.idCatArticulo = idCatArticulo;
        this.nombreArticulo = nombreArticulo;
        this.stockArticulo = stockArticulo;
        this.FechaVencimientoArticulo = FechaVencimientoArticulo;
        this.idProvArticulo = idProvArticulo;
        this.marcaArticulo = marcaArticulo;
        this.estadoArticulo=estadoArticulo;
    }
    
    public Articulo(int idArticulo, String nombreArticulo, int stockArticulo){
        this.idArticulo= idArticulo;
        this.nombreArticulo=nombreArticulo;
        this.stockArticulo = stockArticulo;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getIdCatArticulo() {
        return idCatArticulo;
    }

    public void setIdCatArticulo(int idCatArticulo) {
        this.idCatArticulo = idCatArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public int getStockArticulo() {
        return stockArticulo;
    }

    public void setStockArticulo(int stockArticulo) {
        this.stockArticulo = stockArticulo;
    }

    public String getFechaVencimientoArticulo() {
        return FechaVencimientoArticulo;
    }

    public void setFechaVencimientoArticulo(String FechaVencimientoArticulo) {
        this.FechaVencimientoArticulo = FechaVencimientoArticulo;
    }

    public int getIdProvArticulo() {
        return idProvArticulo;
    }

    public void setIdProvArticulo(int idProvArticulo) {
        this.idProvArticulo = idProvArticulo;
    }

    public String getMarcaArticulo() {
        return marcaArticulo;
    }

    public void setMarcaArticulo(String marcaArticulo) {
        this.marcaArticulo = marcaArticulo;
    }

    public String getEstadoArticulo() {
        return estadoArticulo;
    }

    public void setEstadoArticulo(String estadoArticulo) {
        this.estadoArticulo = estadoArticulo;
    }    
    public String toString(){
    return this.nombreArticulo;
    }
}
