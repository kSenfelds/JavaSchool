import java.util.Scanner;

public class Live1808 {

	public static void main(String[] args) {
		
//		while (true) {
//			System.out.println("Hello!");
//	}
		// STRING EXAMPLE
		System.out.print("Enter message : ");
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
		sc.close();
		
		// string operations - immutable
		
		String output = input.trim();
		int indexOfX = input.indexOf('X');
		
		System.out.println ("input :" +input);
		System.out.println ("output :" +output);
		
		
		

	}

}
