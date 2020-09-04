
/*Uzrakstīt programmu klasē SortArray, kas aicina lietoāju ievadīt masīva izmēru robežās no
20 līdz 40
1) Programma izveido int masīvu ar izmēru, ko saņēma no lietotāja
2) Masīvs tiek aizpildīts ar gadījuma skaitļiem(int) robežās no 10 līdz 99
3) Izvadam uz ekrāna visus masīvā esošos skaitļus atdalītus ar komatu un atstarpi
4) Veicam masīvā esošo elementu kārtošanu augošā secībā(neveidojam jaunu masīvu)
5) Izvadam uz ekrāna sakārtotos masīva elementus
*/
import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size;
		do {
			System.out.print("Ievadi skaitli no 20 - 40 :");
			size = in.nextInt();
		} while (size < 20 || size > 40);
		in.close();
		int[] masīvs = new int[size];
		for (int i = 0; i < masīvs.length; i++) {
			Random rnd = new Random();
			int randomInt = rnd.nextInt(100);
			masīvs[i] = randomInt;
		}
		for (int i = 0; i < masīvs.length; i++) {
			System.out.print(masīvs[i] + ", ");
		}

		int temp = 0;
		for (int i = 1; i < masīvs.length; i++) {
			for (int j = 1; j < masīvs.length; j++) {
				if (masīvs[j] < masīvs[j-1]) {
					temp = masīvs[j - 1];
					masīvs[j - 1] = masīvs[j];
					masīvs[j] = temp;
				}
			}
		}
		System.out.println(" ");
		for (int i = 0; i < masīvs.length; i++) {
			System.out.print(masīvs[i] + ", ");
		}
	}
}
