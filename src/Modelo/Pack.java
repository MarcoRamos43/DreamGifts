package Modelo;

public class Pack {
    private int idPack;
    private String nombrePack;
    private float costoPack;
    private int stockPack;
    private String estadoPack;

    public Pack(int idPack, String nombrePack, float costoPack, int stockPack, String estadoPack) {
        this.idPack = idPack;
        this.nombrePack = nombrePack;
        this.costoPack = costoPack;
        this.stockPack = stockPack;
        this.estadoPack = estadoPack;
    }

    public int getIdPack() {
        return idPack;
    }

    public void setIdPack(int idPack) {
        this.idPack = idPack;
    }

    public String getNombrePack() {
        return nombrePack;
    }

    public void setNombrePack(String nombrePack) {
        this.nombrePack = nombrePack;
    }

    public float getCostoPack() {
        return costoPack;
    }

    public void setCostoPack(float costoPack) {
        this.costoPack = costoPack;
    }

    public int getStockPack() {
        return stockPack;
    }

    public void setStockPack(int stockPack) {
        this.stockPack = stockPack;
    }

    public String getEstadoPack() {
        return estadoPack;
    }

    public void setEstadoPack(String estadoPack) {
        this.estadoPack = estadoPack;
    }
    
    
}
