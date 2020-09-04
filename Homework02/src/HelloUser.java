import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		/*
		 * Uzrakstīt programmu klasē HelloUser, kas 1) Aicina lietoāju ievadīt kādu
		 * vārdu un uzvārdu vienā rindā ar atstarpi 2) Sadala vārdu un uzvārdu divos
		 * mainīgajos. 3) Vārdu pārveido tā lai tas sāktos ar lielo burtu un visi
		 * pārējie būtu mazie burti 4) Uzvārdu pārveido lai tas viss sastāvētu no
		 * lielajiem burtiem 5) Izvada uz ekrāna pārveidoto vārdu un uzvārdu, katru savā
		 * rindiņā ievietotu single quote pēdiņās(')
		 */ 
		System.out.print("Enter your name and surname :");
		Scanner In = new Scanner(System.in);
		String NameSurname = In.nextLine();		
		In.close();
		NameSurname = NameSurname.trim();
		String name = NameSurname.substring(0, NameSurname.indexOf(' '));
		String firstletter = name.substring(0, 1).toUpperCase();
		String otherletters = name.substring(1).toLowerCase();
		String surname = NameSurname.substring(NameSurname.indexOf(' ')).trim();
		System.out.println("Name'" +firstletter + otherletters + "'");
		System.out.println ("Surname '" +surname.toUpperCase() + "'");
	}

}
