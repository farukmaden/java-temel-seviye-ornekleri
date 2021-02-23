package projects;

import java.util.Scanner;

public class BedenKitleEndeksi {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Lütfen boyunuzu giriniz");
		double boy = in.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz");
		int kilo = in.nextInt();
		
		double bke = kilo /(boy*boy);
		
		if(bke<18.5) {
			System.out.println("zayýfsýnýz");
			
		}else if(bke<25&&bke>18.5) {
			System.out.println("beden kitle indeksiniz normal");
			
		}else if (bke<30&&bke>25) {
			System.out.println("kilolusunuz");
		}else if(bke > 30) {
			System.out.println("obezsiniz");
		}

	}

}
