package ristorante;

public class Tavolo {
    private int nTavolo;
    private int capienza;
    private int personeSedute;
    private boolean disponibile;

    public Tavolo(int nTavolo, int capienza, int personeSedute, boolean disponibile) {
        this.nTavolo = nTavolo;
        this.capienza = capienza;
        this.personeSedute = personeSedute;
        this.disponibile = disponibile;
    }

    public int getCapienza() {
        return capienza;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public int getPersoneSedute() {
        return personeSedute;
    }

    public void setPersoneSedute(int personeSedute) {
        this.personeSedute = personeSedute;
    }

    public int getnTavolo() {
        return nTavolo;
    }
    
     public void setnTavolo(int nTavolo) {
        this.nTavolo = nTavolo;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public String stampa(){
        String t = "";
        t = "Tavolo numero: " + nTavolo + "\ncapienza: " + capienza + "\nPersone sedute: " + personeSedute + "\ndisponibile: " + disponibile;
        return t;
    }
}
