package Package2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input = 0;
		pickingMain(input, scn);
	}
	public static void pickingMain(int input, Scanner scn) {
		System.out.println("=============================================================\n"
				+ "\t\t HOSPITAL INFORMATION SYSTEM\n"
				+ "=============================================================");
		System.out.println("Choose from the ff:\n"
				+ "[1] Patient\n"
				+ "[2] Admin");
		input = scn.nextInt();
		scn.nextLine();
		categories(input, scn);
	}
	public static void categories(int input, Scanner scn) {
		String pass;
		if(input == 1) {
			while(true) {
				System.out.println("Welcome!");
				Patient pat = new Patient();
				pat.Patient();
				break;
			}
		}
		else if (input == 2) {
			while(true) {
				System.out.print("Enter password: ");
				pass = scn.nextLine();
				if(pass.equalsIgnoreCase("admin")) {
					System.out.println("Welcome!");
					Admin admin = new Admin();
					admin.Admin();
					break;
				}
				else {
					System.err.println("incorrect password.");
				}
			}
		}
	}
}
