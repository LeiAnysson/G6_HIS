package Package2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Admin admin = new Admin();
		Patient pat = new Patient();
		System.out.println("=============================================================\n"
				System.out.println("  _    _                 _ _        _   _____        __                           _   _                _____           _                 \r\n"
				+ " | |  | |               (_) |      | | |_   _|      / _|                         | | (_)              / ____|         | |                \r\n"
				+ " | |__| | ___  ___ _ __  _| |_ __ _| |   | |  _ __ | |_ ___  _ __ _ __ ___   __ _| |_ _  ___  _ __   | (___  _   _ ___| |_ ___ _ __ ___  \r\n"
				+ " |  __  |/ _ \\/ __| '_ \\| | __/ _` | |   | | | '_ \\|  _/ _ \\| '__| '_ ` _ \\ / _` | __| |/ _ \\| '_ \\   \\___ \\| | | / __| __/ _ \\ '_ ` _ \\ \r\n"
				+ " | |  | | (_) \\__ \\ |_) | | || (_| | |  _| |_| | | | || (_) | |  | | | | | | (_| | |_| | (_) | | | |  ____) | |_| \\__ \\ ||  __/ | | | | |\r\n"
				+ " |_|  |_|\\___/|___/ .__/|_|\\__\\__,_|_| |_____|_| |_|_| \\___/|_|  |_| |_| |_|\\__,_|\\__|_|\\___/|_| |_| |_____/ \\__, |___/\\__\\___|_| |_| |_|\r\n"
				+ "                  | |                                                                                         __/ |                      \r\n"
				+ "                  |_|                                                                                        |___/                       ");
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
