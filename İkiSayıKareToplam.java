package projects;

import java.util.Scanner;

public class ÝkiSayýKareToplam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("sayý 1 giriniz");
		int sayý1 = in.nextInt();
	
		System.out.println("sayý 2 giriniz");
		int sayý2 = in.nextInt();
		System.out.print("toplam = ");
		System.out.print( (sayý1*2) + (sayý2*2));
	}

}
