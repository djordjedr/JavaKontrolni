package domaciGrupaIX;

import java.util.Scanner;

public class Nizovi2 {

    /*
    Napisati program koji izracunava proizvod elemenata niza tipa int,  koji su veci od njihovog indeksa.
    Za unos niza i za proizvod koristiti zasebno metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza.
    Primer ucitanog niza: 3 7 1 4 2 5
    Primer izracunatog proizvoda: 84
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        unosNiza(sc, niz);
        System.out.println("Proizvod elemenata niza koji su veci od svog indexa je " +proizvod(niz));


    }

    public  static void unosNiza(Scanner sc , int[] niz){ // prosledjujem skener kao parametar da ne bih pri svakom pozivanju metode pravila nov skener
        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i<niz.length; i++){
            niz[i] = sc.nextInt();
        }


    }

    public static int proizvod(int[] niz){
        int proizvod = 1; // 1 je neutralni clan mnozenja, tj ne utice na mnozenje
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > i) proizvod *= niz[i];
        }
       return proizvod;
    }
}
