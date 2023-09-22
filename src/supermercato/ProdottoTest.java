package supermercato;

public class ProdottoTest {

    public static void main(String[] args) {

        Prodotto p = new Prodotto(10, 4, 30, 10, "pane","8032089461337");

        System.out.println(p.stampa());
        System.out.println(p.prezzoIvato());
        System.out.println(p.pesoLordo());
        System.out.println(p.codice());

    }

}

