package projects;

import java.util.Scanner;

public class OtobüsProgramı {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the date (HH:MM) --> ");
		String currentDate = input.next();
		String[] hourAndMinute = currentDate.split(":");
		String otobusSaatleri[] = { "12:00", "13:00", "14:00" };

		int currentHour = Integer.parseInt(hourAndMinute[0]);
		int currentMinute = Integer.parseInt(hourAndMinute[1]);
		int i;
		
		for (i = 0; i < otobusSaatleri.length; i++) {
			String[] otoSaat = otobusSaatleri[i].split(":");
			int firstHour = Integer.parseInt(otoSaat[0]);
			int firstMinute = Integer.parseInt(otoSaat[1]);
			
			
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
