package projects;

import java.util.Scanner;

public class BasamakSayýsýBulma {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Sayý giriniz : ");
		int sayi = in.nextInt();
		int basamak = 0;
		while(sayi>0) {
			sayi = sayi/10;
			basamak++;
		}
		System.out.println("girdiðiniz sayi " + basamak + " basamaklýdýr");
		
	}

}
