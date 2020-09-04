package classTasks;

import java.util.Scanner;

public class Task03 {
//3. Uzrakstīt programmu, kura ievadē saņem skaitli x un pārbauda vai skaitlis ir robežās [50..100)
	public static void main(String[] args) {
		System.out.println("Ievadiet X vērtību!");
		Scanner In = new Scanner(System.in);
		int x = In.nextInt();
//		System.out.println (x);
		In.close();
		boolean skaitlis;
		if (x < 50) {
			skaitlis = false;
		} else if (x < 100) {
			skaitlis = true;
		} else {
			skaitlis = false;
		}
		System.out.println(skaitlis);
	}

}
