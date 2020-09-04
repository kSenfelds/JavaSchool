package classTasks;

import java.util.Scanner;

public class Cikli008 {
//8. Uzrakstīt programmu, kas ievadē saņem skaitli(int) un izvada visus naturālus skaitļus līdz šim
//	skaitlim, ieskaitot.
//Papilduzdevums: uzlabot tā lai, ja tiek ievadīts negatīvs skaitlis, lai tiktu izvadīti visi negatīvi veseli
//	skaitļi līdz nullei
	public static void main(String[] args) {
		System.out.print("Ievadiet X vērtību!");
		Scanner In = new Scanner(System.in);
		int x = In.nextInt();
		In.close();
		if (x >= 0) {
			for (int i = 0; i < x + 1; i++) {
				System.out.println("Skaitlis :" + i);
			}
		} else {
			for (; x < 1; x++) {
				System.out.println("Skaitlis :" + x);
			}
		}

	}

}
