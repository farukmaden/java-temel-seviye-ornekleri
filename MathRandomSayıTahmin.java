package projects;

import java.util.Scanner;

public class MathRandomSayýTahmin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("max deðeri giriniz : ");
		int max = in.nextInt();

		int sayi = ((int) (Math.random() * max));

		if (max <= 100) {
			for (int i = 1; i < 8; i++) {
				int tahminSayýsý = (int) (Math.random() * max);
				System.out.println("oluþan sayi " + sayi);
				System.out.println("tahmin sayýsý " + tahminSayýsý);
				if (sayi == tahminSayýsý) {
					System.out.println("doðru sayi");
					return;
				} else {
					System.out.println("yanlýþ sayi");

				}
			}
		} else {
			if (100 < max && max <= 1000) {
				for (int i = 1; i < 15; i++) {
					int tahminSayýsý = (int) (Math.random() * 10);
					System.out.println("oluþan sayi " + sayi);
					System.out.println("tahmin sayýsý " + tahminSayýsý);
					if (sayi == tahminSayýsý) {
						System.out.println("doðru sayi");
						return;
					} else {
						System.out.println("yanlýþ sayi");

					}
				}
			}
		}

	}

}
