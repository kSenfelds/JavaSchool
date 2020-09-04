import java.util.Scanner;

public class PrimeGenerator {
	/*
	 * Uzrakstīt programmu klasē PrimeGenerator kas
	 * 
	 * 1) Prasa lietotājam ievadīt cik pirmsskaitļus secīgus pirmsskaitļus tas vēlas
	 * uzģenerēt(sākot no 1) - limitējat lietotāja iespējas no 0 - 100 2) Izvadiet
	 * uz ekrāna ar komatu atdalītus tik pirmskauitļus cik lietotājs pieprasīja
	 * Piemēram, ievada 11, tad programma izvada 1, 2, 3, 5, 7, 11, 13, 17, 19, 23,
	 * 29
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size;
		do {
			System.out.print("Ievadi cik pirmskaitļus vēlies uzģenerēt (0-100) :");
			size = in.nextInt();
		} while (size < 0 || size > 100);
		in.close();
		int[] saraksts = new int[size];
		int dalītājs;
		int result;
		int skaitlis;
		boolean prime;
		for (int i = 3; i < saraksts.length; i++) {
			do {skaitlis=i+1;
				dalītājs = i;
				dalītājs--;
				result = skaitlis%dalītājs;
				if (result!=0) {
					prime=true; saraksts[i]=skaitlis;
				}
				else {
					prime=false; skaitlis++;
				}
			}while (dalītājs>0);
				
			}
			
			
			
			

		
		for (int s = 0; s < saraksts.length; s++) {
			System.out.println("Pirmskaitlis :" + saraksts[s]);
		}

	}

}
