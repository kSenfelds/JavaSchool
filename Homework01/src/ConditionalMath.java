import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		System.out.print ("Lūdzu ievadiet savu vārdu : ");
		Scanner Input = new Scanner(System.in);
		String name = Input.next();
		int x;
		int y;
		System.out.print ("Lūdzu ievadi veselu skaitli (x): ");
		x = Input.nextInt();
		System.out.print ("Lūdzu ievadi veselu skaitli (y): ");
		y = Input.nextInt();
		Input.close();
	//	System.out.println (name + x + y );
		if (x>y) {System.out.println ("Skaitlis X " + x + " ir lielāks par skaitli Y " + y );}
		else if (x==y) { System.out.println ("Skaitļi X " + x + " un Y "+ y + " ir vienādi");}
		else {System.out.println ("Skaitlis Y " + y + " ir lielāks par skaitli X " +x);}
		int sum = x+y;
		if (sum==name.length()) {System.out.println ( "Skaitļu X un Y summa ir " +sum+ " kas ir tikpat cik burtu Tavā vārdā!");}
		else if (sum<name.length()) {System.out.println ("Skaitļu X un Y summa ir "+sum+ " kas ir mazāk nekā buru Tavā vārdā!");}
		else {System.out.println ("Skaitļu X un Y summa ir "+sum+ " kas ir vairāk nekā burtu Tavā vārdā! ");}
		
		}
		}
		
	


