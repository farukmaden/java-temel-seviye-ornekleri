package projects;

import java.util.Scanner;

public class TekCýftSayýBulma {

	public static void main(String[] args) {
		System.out.println("bir tam sayý giriniz");
		Scanner in = new Scanner(System.in);
		int sayi = in.nextInt();
		if(sayi%2==0) {
			System.out.println("sayý çifttir");
		}else {
			System.out.println("sayý tektir");
		}
	

	}

}
