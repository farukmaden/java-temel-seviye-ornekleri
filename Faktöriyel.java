package projects;

import java.util.Scanner;

public class Faktöriyel {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.println("lütfen bir sayý giriniz");
		int sayi = in.nextInt();
		int faktöriyel=1;
		int i =1;
		while(i<=sayi) {
			faktöriyel*=i;
			i++;
		}
		System.out.println("faktöriyel  " + faktöriyel);
	}

}
