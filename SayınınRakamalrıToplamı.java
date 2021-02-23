package projects;

import java.util.Scanner;

public class SayýnýnRakamalrýToplamý {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz");
		int sayi =in.nextInt();
		int toplam = 0;
		
		do {
			toplam += sayi%10;
			
			sayi/=10;
			
		}while(sayi>0);
		System.out.println("Rakamalarý toplamý= "+toplam);
	}

}
