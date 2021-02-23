package projects;

import java.util.Scanner;

public class AsalSayý {

	public static void main(String[] args) {
		boolean asalMi = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int sayi = in.nextInt();
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalMi = false;
				break;
			}
		}
		if (asalMi)
			System.out.println("Sayi asaldir");
		else
			System.out.println("Sayi asal degildir");

	}

}
