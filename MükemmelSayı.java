package projects;

import java.util.Scanner;

public class MükemmelSayý {

	public static void main(String[] args) {
		System.out.println("bir sayý giriniz");
		Scanner in = new Scanner(System.in);
		
		int sayý =in.nextInt();
		int toplam=0;
		for(int i =1;i<sayý;i++) {
			if(sayý%i==0) {
				toplam = toplam+i;
			}
		}
		if(toplam==sayý) {
			System.out.println("mükemmel sayýdýr");
		}else {
			System.out.println("mükemmel sayý deðildir");
		}

	}

}
