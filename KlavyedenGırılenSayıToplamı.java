package projects;

import java.util.Scanner;

public class KlavyedenGýrýlenSayýToplamý {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int toplam = 0;
		int sayý;
		System.out.println("bir sayi belirleyiniz");
		int belirlenenSayi = in.nextInt();
		for(int i=1;i<=belirlenenSayi;i++) {
			System.out.println("sayi " + i +" giriniz");
			sayý=in.nextInt();
			toplam=toplam+sayý;
			
		}
		System.out.println("toplam :" + toplam);

	}

}
