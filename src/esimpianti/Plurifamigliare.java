package esimpianti;

/**
 *
 * @author renato.pali
 */
public class Plurifamigliare {
    
    private int nAppartamenti;
    private String nome;
    private Appartamento appartamento;
    private boolean normativaAntincendio;

    public Plurifamigliare() {
    }

    public Plurifamigliare(int nAppartamenti, String nome, Appartamento appartamento, boolean normativaAntincendio) {
        this.nAppartamenti = nAppartamenti;
        this.nome = nome;
        this.appartamento = appartamento;
        this.normativaAntincendio = normativaAntincendio;
    }

    public int getnAppartamenti() {
        return nAppartamenti;
    }

    public void setnAppartamenti(int nAppartamenti) {
        this.nAppartamenti = nAppartamenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Appartamento getAppartamento() {
        return appartamento;
    }

    public void setAppartamento(Appartamento appartamento) {
        this.appartamento = appartamento;
    }

    public boolean isNormativaAntincendio() {
        return normativaAntincendio;
    }

    public void setNormativaAntincendio(boolean normativaAntincendio) {
        this.normativaAntincendio = normativaAntincendio;
    }
    
    
    
    
}
