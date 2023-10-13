
package parola;

public class Parola {

    private Lettera[] lettera;

    public Parola(String p) {

        lettera = new Lettera[p.length()];
        for (int i = 0; i < p.length(); i++) {
            lettera[i] = new Lettera(p.charAt(i));

        }

    }

    public int punteggioTot() {

        int c = 0;

        for (int i = 0; i < lettera.length; i++) {
            c += lettera[i].getPunteggio();

        }
        return c;

    }

    public String stampa() {
        String t = "";

        for (int i = 0; i < lettera.length; i++) {
            t += "\nparola[" + i + "]:" + lettera[i].stampa();

        }
        return t;
    }
}
