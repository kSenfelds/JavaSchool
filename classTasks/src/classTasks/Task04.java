package classTasks;

import java.util.Scanner;

public class Task04 {
//4. Uzrakstīt programmu, kura ievadē saņem divus teksta gabalus un izvada tos komibnētā formā:
//	Īsākais+garākais+īsākais, ja abi teksta gabali ir vienādā garuma, pieņemt, ka pirmais ir garākais.
	public static void main(String[] args) {
		System.out.println("Ievadiet pirmo tekstu!");
		Scanner In = new Scanner(System.in);
		String text1 = In.next();
		System.out.println("Ievadiet otro tekstu!");
		String text2 = In.next();
//		System.out.println (text1 + "       " +text2);
		In.close();
		if (text1.length() > text2.length()) { //ar vienu if
			System.out.println(text2 + text1 + text2);
		} else {
			System.out.println(text1 + text2 + text1);
		}

	}

}
