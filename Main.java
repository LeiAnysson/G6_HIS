package Package2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		User user = new User();
		System.out.println("===========================================\n"
				+ "\tHOSPITAL INFORMATION SYSTEM\n"
				+ "===========================================");
		System.out.println("Choose from the ff:\n"
				+ "[1] Patient\n"
				+ "[2] Admin");
		int input = scn.nextInt();
		if(input == 1 || input == 2) {
			while(true) {
				System.out.print("Enter password: ");
				String pass = scn.nextLine();
				user.setPassword(pass);
				if(user.getPassword().equalsIgnoreCase("patient")) {
					System.out.println("PATIENT");
				}
				else if(user.getPassword().equalsIgnoreCase("admin")) {
					System.out.println("ADMIN");
				}
				else {System.err.println("incorrect password.");}
			}
		}
		else {
			System.err.println("invalid.");
		}
		System.out.println("Choose from the ff:\n"
				+ "[1] Patient\n"
				+ "[2] Doctor\n"
				+ "[3] Staff\n"
				+ "[4] Equipment");
		input = scn.nextInt();
		System.out.println("===========================================");
		switch(input) {
			case 1:
				System.out.println("PATIENTS' SIDE:\n"
					+ "[1] Patients' Record\n"
					+ "[2] Patients' Appointment");
				input = scn.nextInt();
				System.out.println("===========================================");
				if(input == 1) {
					//Prec pR = new Prec();
					System.out.println("PATIENTS' RECORD");
				}
				else if(input == 2) {
					//Pappoint pA = new Pappoint();
					System.out.println("PATIENTS' APPOINTMENT");
				}
				else { System.err.println("Invalid.");}
				break;
			case 2:
				System.out.println("DOCTORS' SIDE:\n"
						+ "[1] Doctors' Schedule\n"
						+ "[2] Doctors' Appointment");
				input = scn.nextInt();
				System.out.println("===========================================");
					if(input == 1) {
						//Dsched dS = new Dsched();
						System.out.println("DOCTORS' SCHEDULE");
					}
					else if(input == 2) {
						//Dappoint dA = new Dappoint();
						System.out.println("DOCTORS' APPOINTMENT");
					}
					else { System.err.println("Invalid.");}
				break;
			case 3:
				System.out.println("STAFFS' SIDE:\n"
						+ "[1] Nurse\n"
						+ "[2] Maintenance\n"
						+ "[3] ");
				input = scn.nextInt();
				System.out.println("===========================================");
					if(input == 1) {
						//Dsched dS = new Dsched();
						System.out.println("NURSES: ");
					}
					else if(input == 2) {
						//Dappoint dA = new Dappoint();
						System.out.println("MAINTENANCE:");
					}
					else { System.err.println("Invalid.");}
				break;
			case 4:
				Equipment EQ = new Equipment();
				System.out.println("EQUIPMENTS:\n"
						+ "[1] Diagnostic Laboratory & Imaging\n"
						+ "[2] Critical Care / ICU equipment\n"
						+ "[3] Operating Theatre(OT)");
				input = scn.nextInt();
				System.out.println("===========================================");
					if(input == 1) {
						EQ.IMG();
					}
					else if(input == 2) {
						EQ.ICU();
					}
					else if(input == 3) {
						EQ.OT();
					}
					else { System.err.println("Invalid.");}
				break;
		}

	}

}
