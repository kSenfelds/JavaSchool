
public class Testmass {

	public static void main(String[] args) {
		// generate prime
		int result;
		int dal;
		for (int i=1;i<100;i++) {
			for (int sk = i+1 ; sk<10; sk++) {
				dal = sk-1;
				result = sk%dal;
				if (result!=0) { dal--;}
				else {System.out.println("Prime: " +sk);}	
				
			}
		}	
	}
}
