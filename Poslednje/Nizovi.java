package nizovi;

import java.util.Scanner;

public class Nizovi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite prvog duzinu niza: ");
		int duzina1 = sc.nextInt();
		int [] niz1 = ucitaj(duzina1);
		
		System.out.println("Unesite drugog duzinu niza: ");
		
		int duzina2 = sc.nextInt();
		int [] niz2 = ucitaj(duzina2);
		
		int [] niz3 = saberi(niz1, niz2);
		
		ispisi(niz3);
	}
	
	public static int[] ucitaj(int duz) {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[duz];
		for (int i=0; i<duz; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = sc.nextInt();
		}
		return niz;
	}
	
	public static int[] saberi(int[] niz1, int[] niz2) {
		int duz = niz1.length;
		
		if(niz1.length < niz2.length) {
			duz = niz2.length;
		}
		
		int[] nizZ = new int[duz];
		
		boolean manjiPrvi = niz1.length < niz2.length;
		
		for(int i = 0; i < duz; i++) {
			
			if (manjiPrvi && i < niz1.length) {
				nizZ[i] = niz1[i] + niz2[i];
			} 
			else if (manjiPrvi &&  i >= niz1.length) {
				nizZ[i] = 0 + niz2[i];
			}
			else if (!manjiPrvi && i < niz2.length) {
				nizZ[i] = niz1[i] + niz2[i];
			}
			else if (!manjiPrvi && i >= niz2.length)  {
				nizZ[i] = niz1[i] + 0;
			}
		}
		return nizZ;
	}
	
	public static void ispisi(int[] niz) {
		for(int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}
}
