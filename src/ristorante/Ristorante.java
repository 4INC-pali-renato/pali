package ristorante;

public class Ristorante {

    private int nTavoli;
    private Tavolo[] tavoli;

    public Ristorante(Tavolo[] tavoli) {
        this.nTavoli = tavoli.length;
        this.tavoli = tavoli;
    }

    public String aggiungiTavolo(Tavolo nuovo) {
        Tavolo[] temp = new Tavolo[nTavoli + 1];
        for (int i = 0; i < nTavoli; i++) {
            temp[i] = tavoli[i];
        }
        temp[nTavoli] = nuovo;
        tavoli = temp;
        nTavoli++;
        return "Tavolo aggiunto";
    }

    public String togliTavolo(int pos) {
        ShiftSx(pos);
        nTavoli--;
        return "Tavolo eliminato";
    }

    private void ShiftSx(int pos) {
        Tavolo[] temp = new Tavolo[nTavoli - 1];

        for (int i = pos; i < temp.length; i++) {
            temp[i - 1] = tavoli[i];
        }
        tavoli = temp;
    }

    public String disdici(int nTavolo) {
        tavoli[nTavolo - 1].setDisponibile(true);
        tavoli[nTavolo - 1].setPersoneSedute(0);
        return "Il tavolo è ora disponibile";
    }

    public String prenota(int nPersone) {
        for (int i = 0; i < nTavoli; i++) {
            if (tavoli[i].isDisponibile() == true && tavoli[i].getCapienza() >= nPersone) {
                tavoli[i].setPersoneSedute(nPersone);
                tavoli[i].setDisponibile(false);
                i = nTavoli;

            }
        }

        return "Tavolo disponibile";
    }

    public String siediti(int tavolo) {
        if (tavoli[tavolo - 1].isDisponibile() == true) {
            tavoli[tavolo - 1].setDisponibile(false);
        }
        tavoli[tavolo - 1].setPersoneSedute(tavoli[tavolo - 1].getPersoneSedute() + 1);
        return "Ti sei seduto al tavolo " + tavolo;
    }

    public String alzati(int tavolo) {
        if (tavoli[tavolo - 1].getPersoneSedute() == 1) {
            tavoli[tavolo - 1].setDisponibile(true);
        }
        tavoli[tavolo - 1].setPersoneSedute(tavoli[tavolo - 1].getPersoneSedute() - 1);
        return "Ti sei alzato dal tavolo numero " + tavolo;
    }


    public String visualizzaTavoli() {
        String t = "";
        for (int i = 0; i < nTavoli; i++) {
            t += "\n\n----Tavolo n°" + (i + 1) + "----" + "\nTavolo numero: " + tavoli[i].getnTavolo() + "\ncapienza: "
                    + tavoli[i].getCapienza() + "\nPersone sedute: " + tavoli[i].getPersoneSedute() + "\nDisponibile: " + tavoli[i].isDisponibile();
        }
        return t;
    }

}
