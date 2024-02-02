package esimpianti;

/**
 *
 * @author renato.pali
 */
public class Edificio {
    
    private Impianto caldaia;
    private int nTermosifoni;
    private String nome;

    public Edificio() {
    }

    public Edificio(Impianto caldaia, int nTermosifoni, String nome) {
        this.caldaia = caldaia;
        this.nTermosifoni = nTermosifoni;
        this.nome = nome;
    }

    public Impianto getCaldaia() {
        return caldaia;
    }

    public void setCaldaia(Impianto caldaia) {
        this.caldaia = caldaia;
    }

    public int getnTermosifoni() {
        return nTermosifoni;
    }

    public void setnTermosifoni(int nTermosifoni) {
        this.nTermosifoni = nTermosifoni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String controlloAnnuale(){
        return null;
        
    }
    
    public String controlloFumi(){
        return null;
        
    }
    

    
}
