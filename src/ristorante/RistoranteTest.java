/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

/**
 *
 * @author renato.pali
 */
public class RistoranteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Tavolo[] t = new Tavolo[4];
        t[0] = new Tavolo(1, 4, 0, true);
        t[1] = new Tavolo(2, 2, 2, false);
        t[2] = new Tavolo(3, 8, 0, true);
        t[3] = new Tavolo(4, 3, 3, false);

        Tavolo nuovo = new Tavolo(5, 4, 0, true);

        Ristorante r = new Ristorante(t);
        System.out.println(r.aggiungiTavolo(nuovo));
        System.out.println("\n-------------------------------\n");
        //System.out.println(r.togliTavolo(2));
        //System.out.println("\n-------------------------------\n");
        System.out.println(r.disdici(2));
        System.out.println("\n-------------------------------\n");
        System.out.println(r.prenota(7));
        System.out.println("\n-------------------------------\n");
        System.out.println(r.siediti(1));
        System.out.println("\n-------------------------------\n");
        System.out.println(r.alzati(1));
        System.out.println("\n-------------------------------\n");
        System.out.println(r.visualizzaTavoli());


    }
    
}
