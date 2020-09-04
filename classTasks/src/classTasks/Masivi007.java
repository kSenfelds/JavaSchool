package classTasks;

import java.util.Scanner;

public class Masivi007 {
//7. Uzrakstīt programmu, kas ievadē saņem vienu burtu un izvada paziņojumu par to vai šis burts
//	ir patskanis,līdzskanis, vai divskanis, ja netiek ievadīts burts izvadīt ķļūdas paziņojumu.
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Lūdzu ievadi vienu burtu: ");
		String burts = In.next();
		In.close();
		String burts1 = Character.toString(burts.charAt(0));
		String[] cipari = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String[] patskaņi = { "a", "ā", "e", "ē", "i", "ī", "u", "ū", "o" };
		
		int sk=0;
		boolean c;
		boolean p;
		do { 
			if (burts1.contains(cipari[sk])) {c=true; break;}
			else {c=false;}
			sk++;
		} while(sk<10);
			sk=0;
		do { 	
			if (burts1.contains(patskaņi[sk])) {p=true; break;}
			else {p=false;}
			sk++;
		} while (sk<9);
				
		
		if (c==true && p==false) {System.out.println("Error Cipars");}
			else if (p == true &&burts1.contains("o")==true && c==false) {System.out.println("Divskanis O");}
			else if (p == true && c==false) {System.out.println("Patskanis");}
			
				else  {System.out.println("Līdzskanis");}
				
		
		

	

}
}
