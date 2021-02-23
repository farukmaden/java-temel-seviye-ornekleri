package projects;

import java.util.Scanner;

public class vizeFinalNot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("sýnav1 notunu giriniz");
		int sýnav1 = in.nextInt();
		System.out.println("sýnav2 notunu giriniz");
		int sýnav2 = in.nextInt();
		System.out.println("sözlü notunu giriniz");
		int sozlu = in.nextInt();
		double ortalama =sýnav1 * 0.4 + sýnav2 * 0.4 + sozlu*0.2;
		if (ortalama >= 50) {
			System.out.println(ortalama+" : notu ile öðrenci geçmiþtir");
		} else {
			System.out.println(ortalama+" : notu ile öðrenci kalmýþtýr");
		}

	}

}
