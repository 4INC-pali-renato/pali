package esimpianti;

/**
 *
 * @author renato.pali
 */
public class Impianto {
    
    private int dimensione;
    private double potenza;
    private boolean acquaCalda;
    private String modello;
    private String marca;
    private Data dataControlloFumi;
    private Data dataControlloAnnuale;

    public Impianto() {
    }

    public Impianto(int dimensione, double potenza, boolean acquaCalda, String modello, String marca, Data dataControlloFumi, Data dataControlloAnnuale) {
        this.dimensione = dimensione;
        this.potenza = potenza;
        this.acquaCalda = acquaCalda;
        this.modello = modello;
        this.marca = marca;
        this.dataControlloFumi = dataControlloFumi;
        this.dataControlloAnnuale = dataControlloAnnuale;
    }

    public int getDimensione() {
        return dimensione;
    }

    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public double getPotenza() {
        return potenza;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    public boolean isAcquaCalda() {
        return acquaCalda;
    }

    public void setAcquaCalda(boolean acquaCalda) {
        this.acquaCalda = acquaCalda;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Data getDataControlloFumi() {
        return dataControlloFumi;
    }

    public void setDataControlloFumi(Data dataControlloFumi) {
        this.dataControlloFumi = dataControlloFumi;
    }

    public Data getDataControlloAnnuale() {
        return dataControlloAnnuale;
    }

    public void setDataControlloAnnuale(Data dataControlloAnnuale) {
        this.dataControlloAnnuale = dataControlloAnnuale;
    }
    
    
    
}
