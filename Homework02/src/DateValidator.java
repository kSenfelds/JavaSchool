import java.util.Scanner;
/*Uzrakstīt programmu klasē DateValidator kas prasa lietotājam ievadīt datumu un
mēnesi(atsevišķās rindās). Abi šie lielumi tiek ievadīti kā skaitļi atsevišķā rindā.
1) Veiciet pārbaudi vai datums ir derīgs konkrētajam mēnesim. Piemēram, datums = 31
un mēnesis 4 nav derīga kombinācija, jo aprīlī ir tikai 30 dienas.
2) Ja kāds no ievadītajiem datiem nav derīgs, tad izvadam kļūdas paziņojumu
3) Ja Ievadītie dati ir derīgi(eksistējoš datums un mēnesis), tad izvadam to uz ekrāna
aizstājot mēneša numuru ar tā mēneša vārdu.
Piemēram, ievada 5 un 2, tad programa izvada “5. februāris”
Tie kas vēlas iet dziļāk. Pievienojiet trešo lauku pie ievades, kas ir gads. Šeit papildus
jāpārbauda vai tas ir “īsais” vai “garais” gads, attiecīgi dažos gados 29 un 2 būs derīga
kombinācija, bet dažos nebūs. Mēnešu nosaukumus var glabāt masīvā lai nav jāraksta 12 if
statement.
*/

public class DateValidator {

	public static void main(String[] args) {
		int datums;
		int mēnesis;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Ievadi mēnesi (1-12) :");
			mēnesis = in.nextInt();
		} while (mēnesis <= 0 || mēnesis > 12);
		do {
			System.out.print("Ievadi datumu (1-31) :");
			datums = in.nextInt();
		} while (datums <= 0 || datums > 31);
		in.close();
		String[] mēneši = { "janvāris", "februāris", "marts", "aprīlis", "maijs", "jūnijs", "jūlijs", "augusts",
				"septembris", "oktobris", "novembris", "decembris" };
		switch (mēnesis) {
		case (2):
			if (datums < 30) {
				System.out.println(datums + ". " + mēneši[mēnesis - 1]);
			} else {
				System.out.println("Kļūda!");
			}
			break;
		case (4):
		case (6):
		case (9):
		case (11):
			if (datums < 31) {
				System.out.println(datums + ". " + mēneši[mēnesis - 1]);
			} else {
				System.out.println("Kļūda!");
			}
			break;
		default: {
			System.out.println(datums + ". " + mēneši[mēnesis - 1]);
		}
		}

	}

}
