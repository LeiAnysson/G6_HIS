package Package2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Admin admin = new Admin();
		Patient pat = new Patient();
		System.out.println("=============================================================\n"
				+ "\t\t HOSPITAL INFORMATION SYSTEM\n"
				+ "=============================================================");
		System.out.println("Choose from the ff:\n"
				+ "[1] Patient\n"
				+ "[2] Admin");
		int input = scn.nextInt();
		scn.nextLine();
		String pass;
		
		if(input == 1) {
			while(true) {
					System.out.println("Welcome!");
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
