import java.util.Scanner; // jāraksta, lai varētu saīsināt java.util.Scanner = Scanner
public class Scanner001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); // create
		String name = sc.nextLine(); // nospiežot enter saglabājas 
		
		
		sc.close(); //close

	}

}
