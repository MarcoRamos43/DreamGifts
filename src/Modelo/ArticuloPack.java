
package Modelo;

public class ArticuloPack {
    private int unidadArticuloPack;
    private int idArticulo;
    private String nombreArticulo;
    private int stockArticulo;

public ArticuloPack(){
} 
    public ArticuloPack(int unidadArticuloPack, int idArticulo, String nombreArticulo, int stockArticulo) {
        this.unidadArticuloPack = unidadArticuloPack;
        this.idArticulo = idArticulo;
        this.nombreArticulo = nombreArticulo;
        this.stockArticulo = stockArticulo;
    }

    public int getUnidadArticulo() {
        return unidadArticuloPack;
    }

    public void setUnidadArticulo(int unidadArticuloPack) {
        this.unidadArticuloPack = unidadArticuloPack;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
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
    
   public String toString(){
    return this.unidadArticuloPack+" "+this.nombreArticulo;
    } 
}
