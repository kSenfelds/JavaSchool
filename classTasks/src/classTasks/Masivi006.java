package classTasks;

import java.util.Scanner;

public class Masivi006 {
//6. Uzrakstīt programmu, kura ievadē saņem veselu skaitli no (1-12) un izvada atbilstošā mēneša
//	nosaukumu, ja ievada skaitli kurš nav šajās robežās jāizvada kļūdas paziņojums.
	public static void main(String[] args) {
		System.out.print("Lūdzu ievadiet skaitli no 1 - 12 :");
		Scanner In = new Scanner(System.in);
		int mēnesis = In.nextInt();
		In.close();
		String datums[] = { "Janvāris", "Februāris", "Marts", "Aprīlis", "Maijs", "Jūnijs", "Jūlijs", "Augusts",
				"Septembris", "Oktobris", "Novembris", "Decembris" };
		if (mēnesis < 1 || mēnesis > 12) {
			System.out.println("Error");
		} else {
			System.out.println(datums[mēnesis - 1]);
		}
	}

}
