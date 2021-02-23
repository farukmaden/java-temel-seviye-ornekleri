package projects;

import java.util.Scanner;

public class PrimHesap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("aylýk maaþýnýzý giriniz");
		double maaþ =in.nextDouble();
		System.out.println("aylýk satýþ giriniz");
		double aylýkSatýþ =in.nextDouble();
		System.out.println("prim yüzdenizi giriniz (0,2)");
		double prim =in.nextDouble();
		double toplamPrim;
		toplamPrim = aylýkSatýþ*prim;
		maaþ+=toplamPrim;
		System.out.println("bu ayki maaþýnýz : "+ maaþ);
		
		
		
		
	}

}
