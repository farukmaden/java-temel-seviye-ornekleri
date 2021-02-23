package projects;

import java.util.Scanner;

public class OtobüsProgramý {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the date (HH:MM) --> ");
		String currentDate = input.next();//þuanki saat 
		String[] hourAndMinute = currentDate.split(":");// saati ortadan bölüyor saat ve dakika diye split bölme yapar 
		String otobusSaatleri[] = { "12:00", "13:00", "14:00" };

		int currentHour = Integer.parseInt(hourAndMinute[0]);//bölümüþ kýsmýn saatini stringden inte çeviriyor
		int currentMinute = Integer.parseInt(hourAndMinute[1]);//bölümüþ kýsmýn dakikasýný stringden inte çeviriyor
		int i;
		// for döngüsü ile kontrol ediliyor
		for (i = 0; i < otobusSaatleri.length; i++) {
			String[] otoSaat = otobusSaatleri[i].split(":");//dizinin içindeki saatleri bölüyor
			int firstHour = Integer.parseInt(otoSaat[0]);// diziin içindeki saati stringden inte çeviriyor
			int firstMinute = Integer.parseInt(otoSaat[1]);// diziin içindeki dakikayý stringden inte çeviriyor
			// mesela 14:00 da otosaat0 dediðnide 0 olan 14 tür 1 olan 00 kýsmýdýr 
			
			if (firstHour > currentHour) {
				if (firstMinute >= currentMinute) {
					int kalanSaat = firstHour - currentHour;
					int kalanDakika = firstMinute - currentMinute;
					System.out.println("kalan saat: " + kalanSaat + " kalan dakika: " + kalanDakika);
					break;

				} else {
					int kalanSaat = firstHour - currentHour - 1;
					int kalanDakika = firstMinute - currentMinute + 60;
					System.out.println("kalan saat: " + kalanSaat + " kalan dakika: " + kalanDakika);
					break;
				}

			} else if (firstMinute > currentMinute) {
				int kalanSaat = firstHour - currentHour;
				int kalanDakika = firstMinute - currentMinute;
				System.out.println("kalan saat: " + kalanSaat + " kalan dakika: " + kalanDakika);
				break;

			}

		}
		if (i == otobusSaatleri.length) {
			System.out.println("otobus kalmamistir!!!");
		}
		
		
		
		

	}

}
