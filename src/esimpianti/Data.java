package esimpianti;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Data {

    private String data;
    private Integer giorno;
    private Integer anno;
    private Integer mese;

    public Data() {
        LocalDate oggi = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = oggi.format(formatter);
        this.giorno = oggi.getDayOfMonth();
        this.mese = oggi.getMonthValue();
        this.anno = oggi.getYear();
    }

    public Data(String data) throws Exception {
        setData(data);
        String[] split = data.split("/");
        setMese(Integer.valueOf(split[1]));
        setAnno(Integer.valueOf(split[2]));
        setGiorno(Integer.valueOf(split[0]));
    }

    public Data(Integer giorno, Integer mese, Integer anno) throws Exception {
        setMese(mese);
        setAnno(anno);
        setGiorno(giorno);
        this.data = giorno + "/" + mese + "/" + anno;
    }

    public Data(Data d) throws Exception {
        setMese(d.mese);
        setAnno(d.anno);
        setGiorno(d.giorno);
        this.data = d.data;
    }

    public String getData() {
        return data;
    }

    public final void setData(String data) throws Exception {
        if (data.isEmpty()) {
            throw new Exception("La data non può essere vuota");
        } else if (data == null) {
            throw new NullPointerException("La data non può essere null");
        } else {
            this.data = data;
        }
    }

    public Integer getGiorno() {
        return giorno;
    }

    public final void setGiorno(Integer giorno) throws Exception {
        YearMonth ym = YearMonth.of(anno, mese);
        if (!ym.isValidDay(giorno)) {
            throw new Exception("Data non corretta");
        } else if (giorno == null) {
            throw new NullPointerException("Il giorno non può essere null");
        } else {
            this.giorno = giorno;
        }
    }

    public Integer getMese() {
        return mese;
    }

    public final void setMese(Integer mese) throws Exception {
        if (mese <= 0 || mese > 12) {
            throw new Exception("Il mese dev'esse compreso tra 1 e 12");
        } else if (mese == null) {
            throw new NullPointerException("Il mese non può essere null");
        } else {
            this.mese = mese;
        }
    }

    public Integer getAnno() {
        return anno;
    }

    public final void setAnno(Integer anno) throws Exception {
        if (anno < 0 || anno > 2023) {
            throw new Exception("L'anno non può essere minore do 0 e neanche maggiore si 2023");
        } else if (anno == null) {
            throw new NullPointerException("L'anno non può essere null");
        } else {
            this.anno = anno;
        }
    }

    public String giornoDellaSettimana() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, anno);
        cal.set(Calendar.MONTH, mese - 1);
        cal.set(Calendar.DAY_OF_MONTH, giorno);
        int giornoSettimana = cal.get(Calendar.DAY_OF_WEEK);
        String[] nomiGiorni = {"Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato"};
        return nomiGiorni[giornoSettimana - 1];
    }

    public Integer differenzeInGiorni(Data dataAntecedente, Data dataSuccessiva) throws Exception {
        YearMonth ym = YearMonth.of(anno, mese);
        Integer diff = (dataSuccessiva.anno - dataAntecedente.anno) * ym.lengthOfYear();
        diff += (dataSuccessiva.mese - dataAntecedente.mese) * ym.lengthOfMonth();
        diff += dataSuccessiva.giorno - dataAntecedente.giorno;
        if (diff < 0) {
            throw new Exception("La differenza è minore di 0");
        }
        return diff;
    }

    public Integer differenzeInSettimane(Data dataAntecedente, Data dataSuccessiva) throws Exception {
        Integer diff = differenzeInGiorni(dataAntecedente, dataSuccessiva) / 7;
        if (diff < 0) {
            throw new Exception("La differenza è minore di 0");
        }
        return diff;
    }

    public Integer differenzaInMesi(Data dataAntecedente, Data dataSuccessiva) throws Exception {
        YearMonth ymAntecedente = YearMonth.of(dataAntecedente.getAnno(), dataAntecedente.getMese());
        YearMonth ymSuccessiva = YearMonth.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese());
        int diff = (dataSuccessiva.anno - dataAntecedente.anno) * 12;
        diff += ymSuccessiva.getMonthValue() - ymAntecedente.getMonthValue();

        if (diff < 0) {
            throw new Exception("La differenza è minore di 0");
        }
        return diff;
    }

    public Integer differenzaInAnni(Data dataAntecedente, Data dataSuccessiva) throws Exception {
        int diff = dataSuccessiva.anno - dataAntecedente.anno;
        if (diff < 0) {
            throw new Exception("La differenza è minore di 0");
        }
        return diff;
    }

    public String differenzaInGiorniMesiAnni(Data dataAttuale, Data dataSuccessiva) throws Exception {
        String diff = "Differenza giorni: " + differenzeInGiorni(dataAttuale, dataSuccessiva) + "\nDifferenza mesi: "
                + differenzaInMesi(dataAttuale, dataSuccessiva) + "\nDifferenza anni: " + differenzaInAnni(dataAttuale, dataSuccessiva);
        return diff;
    }

    @Override
    public String toString(){
        String[] mesi = {
                "Gennaio", "Febbraio", "Marzo", "Aprile",
                "Maggio", "Giugno", "Luglio", "Agosto",
                "Settembre", "Ottobre", "Novembre", "Dicembre"
        };
        return giornoDellaSettimana() + " " + giorno + " " + mesi[mese - 1] + " " + anno;
    }
}
