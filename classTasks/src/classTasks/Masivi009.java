package classTasks;

import java.util.Scanner;

public class Masivi009 {
//9. Uzrakstīt programmu, kas ievadē saņem skaitli(int) un izvada šī skaitļa reizināšanas tabulu līdz
//	ievadītajam skaitlim, ieskaitot.
	public static void main(String[] args) {
		System.out.print("Lūdzu ievadi skaitli : ");
		Scanner in = new Scanner(System.in);
		int skaitlis = in.nextInt();
		in.close();
		for (int i = 0; i < skaitlis + 1; i++) {
			System.out.println(i + "* " + skaitlis + " rezultāts = " + (skaitlis * i));
		}
	}

}
