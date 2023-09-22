package supermercato;


public class SupermercatoTest {

    public static void main(String[] args) {
        String nome = "Poli";
        String indirizzo = "Via G Garibaldi";
        double[] prezzo = {0.83, 0.98, 2.99};
        int[] iva = {7, 2, 5};
        double[] peso = {600, 299, 155};
        double[] tara = {0.02, 0.01, 0.05};
        String[] desc = {"Acqua", "Patatine", "Banana"};
        String[] codice = {"801796057020", "8003130127922", "8004120902758"};

        Supermercato s = new Supermercato(nome, indirizzo, prezzo, iva, peso, tara, desc, codice);
        System.out.println(s.prezzoAlto());
        System.out.println(s.valoreMerce());
        System.out.println(s.pesoMinore());
        System.out.println(s.merciSopraMedia());
        System.out.println(s.stampa());
    }

}
