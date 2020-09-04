package classTasks;

import java.util.Scanner;

public class Cikli009 {
//9. Uzrakstīt programmu, kas ievadē saņem divus skaitļus(int) un izvada visus naturālus skaitļus,
//	no mazākā līdz lielākajam skaitlim ieskaitot, kas vienlaikus dalās ar 2 un 3, bet ne ar 5
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Lūdzu ievadiet skaitli X : ");	
		int x = In.nextInt();
		System.out.print("Lūdzu ievadiet skaitli Y : ");
		int y = In.nextInt();
		In.close();
		if (x < y) {
			do {
				x++;
				if (x % 2 == 0 && x % 3 == 0 && x % 5 != 0) {
					System.out.println("Dalās ar 2un3, bet ne ar 5 :" + x);
				}
			} while (x < y);
		}
		else if (x > y) {
			do {
				y++;
				if (y % 2 == 0 && y % 3 == 0 && y % 5 != 0) {
					System.out.println("Dalās ar 2un3, bet ne ar 5 :" + y);
				}
			} while (y < x);
		}

	}

}
