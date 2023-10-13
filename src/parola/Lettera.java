package parola;

public class Lettera {

    private char carattere;
    private int punteggio;

    public Lettera(char carattere) {
        this.carattere = carattere;
        punteggio = calcolaP();
    }

    private int calcolaP() {

        int posizioneNellAlfabeto = 0;

        char carattereMinuscolo = Character.toLowerCase(carattere);
        posizioneNellAlfabeto = carattereMinuscolo - 'a' + 1;

        return posizioneNellAlfabeto;
    }

    public char getCarattere() {
        return carattere;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public String stampa() {

        String t = "";

        return t = "\nCARATTERE: " + carattere + "\nPUNTEGGIO: " + punteggio;
    }

}