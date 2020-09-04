package classTasks;

import java.util.Scanner;

public class Task004 {
//5. Uzrakstīt programmu, kura ievadē saņem 3 skaitļus un izvada skaitļu summu, ja kāds no
//	skaitļiem sakrīt ar kādu citu skaitli, skaitlis netiek pieskaitīts summai.
	public static void main(String[] args) {
		System.out.println("Ievadiet X vērtību!");
		
		Scanner In = new Scanner(System.in);
		int x = In.nextInt();
//		System.out.println (x);
		System.out.println("Ievadiet Y vērtību!");
		int y = In.nextInt();
//		System.out.println ( y );
		System.out.println("Ievadiet Z vērtību!");
		int z = In.nextInt();
//		System.out.println ( z );
		In.close();
		if (x == y && y == z) {
			System.out.println("Rezultāts = 0");
		} else if (x == y) {
			System.out.println("Rezultāts = " + z);
		} else if (x == z) {
			System.out.println("Rezultāts = " + y);
		} else if (y == z) {
			System.out.println("Rezultāts = " + x);
		} else {
			System.out.println("Rezultāts = " + (x + y + z));
		}
	}

}
