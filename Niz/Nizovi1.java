package domaciGrupaIX;

import java.util.Scanner;

public class Nizovi1 {

    /*
    Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji su tipa int.
    Zatim niz proslediti metodi koja treba da proveri da li je niz palindrom ili nije.
    Na standradnom izlazu obavestiti krajnjeg korisnika njemu razumljivim tekstom da li je unesen niz palindrom.
    Primer ucitanog niza koji je palindrom: 12 46 17 46 12
    Primer ucitanog niza koji nije palindrom: 12 46 17 12 64

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite velicinu niza:");
        int n = sc.nextInt();
        int[] niz = new int[n];


        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". element niza");
            niz[i] = sc.nextInt();
        }

        if (palindrom(niz)) System.out.println("Niz je palindrom");
        else System.out.println("Niz nije palindrom");


    }

    public static boolean palindrom(int[] niz) {

        boolean fleg = true;

        for (int i = 0; i < niz.length / 2; i++) {
            if (niz[i] != niz[niz.length - i - 1]) {
                fleg = false;
                break;
            }

        }
        return fleg;
    }
}
