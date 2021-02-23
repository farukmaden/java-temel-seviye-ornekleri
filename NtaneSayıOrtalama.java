package projects;

import java.util.Scanner;

public class NtaneSayýOrtalama {

	public static void main(String[] args) {
		/*
		float toplam=0;
		System.out.println("sayý giriniz");
		Scanner in = new Scanner (System.in);
		int sayý = in.nextInt();
		int n;
		 for(int i = 1;i<sayý;i++) {
			 System.out.println("n. "+ sayý+" giriniz");
			 n = in.nextInt();
			 toplam+=n;
		 }
		 float ortalama = toplam%sayý;
		 System.out.println("ortalama" + ortalama);
		 */
		 float toplam = 0;
	        int sayi;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Kac tane sayi gireceksiniz: ");
	        int n = input.nextInt();
	        for (int i=1; i<=n; i++) {
	            System.out.print("Sayi "+ i +" giriniz: ");
	            sayi = input.nextInt();
	            toplam += sayi;
	        }
	        float ortalama = toplam/n;
	        System.out.println("Ortalama: " + ortalama);
	}

}
