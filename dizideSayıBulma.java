package projects;

import java.util.Scanner;

public class dizideSayýBulma {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[] sayýlar = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("aranacak sayýyý giriniz : ");
		int aranacak = in.nextInt() ;

		boolean varMý = false;
		for (int sayý : sayýlar) {
			if (sayý == aranacak) {
				varMý = true;
				break;
			}

		}
		if (varMý) {
			System.out.println("sayý mevcuttur");
		} else {
			System.out.println("sayý mevcut deðildir");
		}

	}

}
