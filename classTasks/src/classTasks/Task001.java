package classTasks;

import java.util.Scanner;

public class Task001 {
//1.Uzrakstīt programmu, kura saņem ievadē divus veselus ciparus un izvada skaitļu summu.
	public static void main(String[] args) {

		System.out.println("Ievadiet X vērtību!");
		Scanner In = new Scanner(System.in);
		int x = In.nextInt();
		// System.out.println (x);
		System.out.print("Ievadiet Y vērtību!");
		int y = In.nextInt();
		// System.out.println ( y );
		In.close();
		int xy = x + y;
		System.out.print("Rezultāts = " + xy);

	}

}
