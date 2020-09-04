import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		
		String name;
		int age ;
		System.out.println ("Lūdzu ievadiet savu vārdu !");
		Scanner Input = new Scanner(System.in);
		name = Input.next();
		System.out.println ("Lūdzu ievadiet savu vecumu !");
		age = Input.nextInt();
		Input.close();
		System.out.println ("Sveiki, mani sauc " + name + " esmu "+ age +" gadus jauns/jauna!");

	}

}
