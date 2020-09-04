import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		int x;
		float y;
		String XunY = "Skaitļu X un Y";
		
		Scanner Input = new Scanner(System.in);
		System. out.print ("Lūdzu ievadiet x vērtību: ");
		x= Input.nextInt();
		System.out.print("Lūdzu ievadiet y vērtību (decimālskaitli ar peldošo komatu): ");
		y=Input.nextFloat();
		Input.close();
		System.out.println (XunY + " summa ir : "+ (x+y));
		System.out.println (XunY + " starpība ir : " + (x-y));
		System.out.println (XunY + " dalījums ir : "+ (x/y));
		System.out.println (XunY + " reizinājums ir : " + (x*y));
		System.out.println(XunY + " summu kvadrāts ir : " +((x+y)*(x+y)));
		
			

	}

}
