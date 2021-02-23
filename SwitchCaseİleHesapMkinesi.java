package projects;

import java.util.Scanner;

public class SwitchCaseÝleHesapMkinesi {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner in =new Scanner (System.in);
		String islemler = "1. toplama iþlemi\n"
		                  +"2. çýkarma iþlemi\n"
				  +"3. çarpma iþlemi\n"   
		                  +"4. bölme iþlemi";    
		
		//System.out.println(islemler);
		System.out.println("iþlemi seçiniz");
		String islem =in.nextLine();
		switch (islem) {
		case "1":
			System.out.println("birinic sayi: ");
			a=in.nextInt();
			System.out.println("ikinici sayi: ");
			b=in.nextInt();
			System.out.println("toplama iþlemi " +(a+b) );
			break;
		case "2":
			System.out.println("birinic sayi: ");
			a=in.nextInt();
			System.out.println("ikinici sayi: ");
			b=in.nextInt();
			System.out.println("çýkarma iþlemi " +(a-b) );
			break;
		case "3":
			System.out.println("birinic sayi: ");
			a=in.nextInt();
			System.out.println("ikinici sayi: ");
			b=in.nextInt();
			System.out.println("çarpma iþlemi " +(a*b) );
			break;
		case "4":
			System.out.println("birinic sayi: ");
			a=in.nextInt();
			System.out.println("ikinici sayi: ");
			b=in.nextInt();
			System.out.println("bölme iþlemi " +((double)a/b) );
			break;
			default:
				System.out.println("geçersiz iþlem giridiniz!!!");
				
			
		}
		
		/*
		 * BURADA BEN KENDÝ DÜÞÜNDÜÐÜM PROGRAMI YAPMAYA ÇAIÞTIM AMA DEÐERLERÝ SWÝTCH LERÝN ÝÇÝNDE OKUTMAM GEREKÝYORMUÞ
		Scanner in = new Scanner(System.in);
		System.out.println("birinici sayýyý giriniz");
		int sayi1 = in.nextInt();
		System.out.println("ikinci sayýyý giriniz");
		int sayi2 = in.nextInt();

		String islem = in.nextLine();
		System.out.println("iþlem sayýsýný seçiniz");
		switch (islem) {
		case "1":
			System.out.println("toplama iþlemi: " + (sayi1 + sayi2));
			break;
		case "2":
			System.out.println("çýkarma iþlemi: " + (sayi1 - sayi2));
			break;
		case "3":
			System.out.println("çarpma iþlemi: " + (sayi1 * sayi2));
			break;
		case "4":
			System.out.println("bölme iþlemi: " + ((double) sayi1 / sayi2));
			break;
			
		
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
