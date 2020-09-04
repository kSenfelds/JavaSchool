package classTasks;

import java.util.Scanner;

public class Task003 {
//3. Uzrakstīt programmu, kura ievadē saņem 2 skaitļus a un b un izvada skaitļu summas, bet
//	summas 10..19 ieskaitot nav atļautas, tādā gadījumā izvadīt 20
	public static void main(String[] args) {
		System.out.println("Ievadiet a vērtību!");
		Scanner In = new Scanner(System.in);
		int a = In.nextInt();
		// System.out.println (A);
		System.out.println("Ievadiet b vērtību!");
		int b = In.nextInt();
		// System.out.println ( b );
		In.close();
		int ab = a + b;
		if (ab < 10) {
			System.out.println("Rezultāts = " + ab);
		} else if (ab > 19) {
			System.out.println("Rezultāts = " + ab);
		} else {
			System.out.println("Rezultāts = 20 ");
		}

	}

}
