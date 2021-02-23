package projects;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int bakiye;
		int paraCekme;
		int paraYatirma;
		
		Scanner in = new Scanner (System.in);
		
		String islemler= "1. iþlem bakiye öðrenme\n"
						 +"2. iþlem para çekme\n"
						 +"3. iþlem para yatýrma\n"
						 +"4. iþlem çýkýþ";
		System.out.println(islemler);
		
		System.out.println("iþlemi seçiniz");
		String islem =in.nextLine();
		switch (islem) {
		case "1":
			System.out.println("bakiye: ");
			bakiye=in.nextInt();
			System.out.println(bakiye);
			break;
			
		case "2" :
			System.out.println("bakiye: ");
			bakiye=in.nextInt();
			System.out.println("çekmek istediðiniz tutat: ");
			paraCekme = in.nextInt();
			System.out.println("kalan bakiye: "+(bakiye-paraCekme));
			break;
			
		case "3" :
			System.out.println("bakiye: ");
			bakiye=in.nextInt();
			System.out.println("yatýmak istediðiniz tutat: ");
			paraYatirma = in.nextInt();
			System.out.println("kalan bakiye: "+(bakiye+paraYatirma));
			break;
			
		case "4" :
			System.out.println("sistemden çýkýþ yapýlmýþtýr...");
			break;
		default:
			System.out.println("geçersiz iþlem giridiniz!!!");
			
		}
		
	}

}
