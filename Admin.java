package Package2;
import java.util.Scanner;
public class Admin extends DoctorSchedule{
	Scanner scn = new Scanner(System.in);
	public void Admin() {
		int aInput = 0;
		while(true) {
			pickingAdmin(aInput);
			categories(aInput);
		}
	}
	public void pickingAdmin(int aInput) {
		System.out.println("=============================================================");
		System.out.println("ADMINISTRATOR");
		System.out.println("Choose from the ff:\n"
				+ "[1] Patient\n"
				+ "[2] Doctor\n"
				+ "[3] Staff\n"
				+ "[4] Equipment");
		aInput = scn.nextInt();
		categories(aInput);
	}
	public void categories(int aInput) {
		switch(aInput) {
		case 1:
			System.out.println("=============================================================");
			System.out.println("PATIENTS' RECORD");
			break;
		case 2:
			System.out.println("=============================================================");
			System.out.println("DOCTORS:\n"
					+ "[1] Doctors' Schedule\n"
					+ "[2] Doctors' Appointment\n"
					+ "\t[0] Back");
			aInput = scn.nextInt();
			System.out.println("=============================================================");
				if(aInput == 1) {
					System.out.println("DOCTORS' SCHEDULE\n");
					display();
				}
				else if(aInput == 2) {
					DoctorAppointment docAppnt = new DoctorAppointment();
					docAppnt.doctorAppointment();
				}
				else if(aInput == 0) {
					pickingAdmin(aInput);
				}
				else { System.err.println("Invalid.");}
			break;
		case 3:
			System.out.println("=============================================================");
			System.out.println("STAFFS:\n"
					+ "[1] Nurse\n"
					+ "[2] Maintenance\n"
					+ "\t[0] Back");
			aInput = scn.nextInt();
			System.out.println("=============================================================");
				if(aInput == 1) {
					//Dsched dS = new Dsched();
					System.out.println("NURSES: ");
				}
				else if(aInput == 2) {
					//Dappoint dA = new Dappoint();
					System.out.println("MAINTENANCE:");
				}
				else if(aInput == 0) {
					pickingAdmin(aInput);
				}
				else { System.err.println("Invalid.");}
			break;
		case 4:
			Equipment EQ = new Equipment();
			System.out.println("=============================================================");
			System.out.println("EQUIPMENTS:\n"
					+ "[1] Diagnostic Laboratory & Imaging\n"
					+ "[2] Critical Care / ICU equipment\n"
					+ "[3] Operating Theatre(OT)\n"
					+ "\t[0] Back");
			aInput = scn.nextInt();
			System.out.println();
				if(aInput == 1) {
					EQ.IMG();
				}
				else if(aInput == 2) {
					EQ.ICU();
				}
				else if(aInput == 3) {
					EQ.OT();
				}
				else if(aInput == 0) {
					pickingAdmin(aInput);
				}
				else { System.err.println("Invalid.");}
			break;
		case 0:
			pickingAdmin(aInput);
			break;
	}
	}
}
