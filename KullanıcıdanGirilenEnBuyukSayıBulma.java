package projects;

import java.util.Scanner;

public class KullanýcýdanGirilenEnBuyukSayýBulma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("sayý 1 i giriniz");
		int sayi1 = in.nextInt();
		System.out.println("sayý 2 i giriniz");
		int sayi2 = in.nextInt();
		System.out.println("sayý 3 i giriniz");
		int sayi3 = in.nextInt();

		if (sayi1 < sayi2 && sayi2 < sayi3) {
			System.out.println("en büyük sayý " + sayi3 + " tür.");
		} else if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("en büyük sayi " + sayi1 + " dir");
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("en büyük sayý " + sayi2 + " dir");
		}

	}

}
