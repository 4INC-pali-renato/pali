package supermercato;


public class Prodotto {

    private double prezzo;
    private int iva;
    private double peso;
    private double tara;
    private String descrizione;
    private String codice;

    public Prodotto(double prezzo, int iva, double peso, double tara, String descrizione, String codice) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codice = codice;
 
    }
    
    public Prodotto(Prodotto p) {
        this.prezzo = p.prezzo;
        this.iva = p.iva;
        this.peso = p.peso;
        this.tara = p.tara;
        this.descrizione = p.descrizione;
        this.codice = p.codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getIva() {
        return iva;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getTara() {
        return tara;
    }

    public double getPeso() {
        return peso;
    }

    public double prezzoIvato() {
        return prezzo + (prezzo * iva / 100);
    }

    public double pesoLordo() {
        return peso + tara;
    }
    
    public boolean codice() {

        int somma = 0;
        int resto;
        boolean ris = false;

        for (int i = 0; i < codice.length() - 2; i += 2) {

            somma += codice.charAt(i)-'0'* 3;
        }
        for (int i =1; i < codice.length() - 2; i += 2) {

            somma += codice.charAt(i)-'0'* 1;
        }

        resto = somma % 10;

        if (codice.charAt(12) == resto) {
            ris = true;
        }

        return ris;
    }


    
    public String stampa() {
        
        String t = "";

        t = "Il prezzo e:" + prezzo + "\nL'iva e:" + iva + "\nLa tara e:" + tara
                + "\nIl peso e: " + peso + "\nLa descrizione e:" + descrizione
                + "\nIl codice a barre e:" + codice;

        return t;
    }
}
