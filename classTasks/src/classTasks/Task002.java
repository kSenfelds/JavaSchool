package classTasks;

import java.util.Scanner;

public class Task002 {
//2.Uzrakstīt programmu, kura ievadē saņem 3 skaitļus un izvada skaitļu vidējo
	public static void main(String[] args) {
		System.out.println("Ievadiet X vērtību!");
		Scanner Input1 = new Scanner(System.in);
		int x = Input1.nextInt();
//		System.out.println (x);
		System.out.println("Ievadiet Y vērtību!");
		int y = Input1.nextInt();
//		System.out.println ( y );
		System.out.println("Ievadiet Z vērtību!");
		int z = Input1.nextInt();
//		System.out.println ( z );
		Input1.close();
		float avg = (x + y + z) / 3F;
		System.out.println("Vidējā vērtība = " + avg);

	}

}
