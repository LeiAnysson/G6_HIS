package Package2;
import java.util.Scanner;
public class Admin extends DoctorSchedule{
	Scanner scn = new Scanner(System.in);
	public void Admin() {
		System.out.println("=============================================================");
		System.out.println("ADMINISTRATOR");
		System.out.println("Choose from the ff:\n"
				+ "[1] Patient\n"
				+ "[2] Doctor\n"
				+ "[3] Staff\n"
				+ "[4] Equipment");
		int input = scn.nextInt();
		System.out.println("=============================================================");
		switch(input) {
			case 1:
				System.out.println("PATIENTS' RECORD");
				break;
			case 2:
				System.out.println("DOCTORS:\n"
						+ "[1] Doctors' Schedule\n"
						+ "[2] Doctors' Appointment");
				input = scn.nextInt();
				System.out.println("=============================================================");
					if(input == 1) {
						System.out.println("DOCTORS' SCHEDULE");
						display();
					}
					else if(input == 2) {
						//Dappoint dA = new Dappoint();
						System.out.println("DOCTORS' APPOINTMENT");
					}
					else { System.err.println("Invalid.");}
				break;
			case 3:
				System.out.println("STAFFS:\n"
						+ "[1] Nurse\n"
						+ "[2] Maintenance\n");
				input = scn.nextInt();
				System.out.println("=============================================================");
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
				System.out.println("=============================================================");
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
