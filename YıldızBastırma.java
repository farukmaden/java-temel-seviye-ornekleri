package projects;

import java.util.Scanner;

public class YýldýzBastýrma {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Lütfen tek bir tam sayý giriniz : ");
		int sayi = in.nextInt();
		if (sayi < 0) {
			System.out.println("kurallara uygun sayý giriniz!");
		} else if (sayi % 2 == 0) {
			System.out.println("kurallara uygun sayý giriniz!");
			return;
		}
		for (int i = 1; i <= sayi; i += 2) {
			for (int j = 0; j <i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = sayi-2; i >=0; i-=2) {
			for (int j = 0; j < i; j++) {
			System.out.print("*");
			}
			System.out.println("");
			}
		
	}

}
