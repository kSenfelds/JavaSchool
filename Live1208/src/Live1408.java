import java.util.Scanner;
/** 
 * 
 * @author Ršu
 * @category education
 *  principā veido dokumentāciju programmai - lasa ar Javadoc
 */
public class Live1408 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = scanner.nextInt();
		scanner.close();
		/*
		 * Block comment
		 * Block comment
		 * Block comment
		 */
		//conditional code
		
		/**
		 * javadoc comment
		 * 
		*/
		
		switch (n) {
		case 9: 
			System.out.println("n ==9");
			break;
		case 7: 
			System.out.println("n==7");
			break;
		case 5:
			System.out.println("n==5");
			break;
			default: System.out.println("N!= 5,7,9");
			
		}
	}

}
