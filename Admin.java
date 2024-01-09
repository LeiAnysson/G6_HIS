
import java.util.Scanner;

public class Admin extends DoctorSchedule {
	Scanner scn = new Scanner(System.in);
	static int aInput = 0;
	public void Admin() {
		while (true) {
			pickingAdmin();
			categories(aInput);
		}
	}

	public void pickingAdmin() {
		System.out.println("\r\n"
				+ "\t \t \t \t \t \t \t ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗     █████╗ ██████╗ ███╗   ███╗██╗███╗   ██╗\r\n"
				+ "\t \t \t \t \t \t \t ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ██╔══██╗██╔══██╗████╗ ████║██║████╗  ██║\r\n"
				+ "\t \t \t \t \t \t \t ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗      ███████║██║  ██║██╔████╔██║██║██╔██╗ ██║\r\n"
				+ "\t \t \t \t \t \t \t ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝      ██╔══██║██║  ██║██║╚██╔╝██║██║██║╚██╗██║\r\n"
				+ "\t \t \t \t \t \t \t ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗    ██║  ██║██████╔╝██║ ╚═╝ ██║██║██║ ╚████║\r\n"
				+ "\t \t \t \t \t \t \t  ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝    ╚═╝  ╚═╝╚═════╝ ╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝\r\n"
				+ "                                                                                                          ");
		System.out.println("============================================================================================================================================================================================================================================");
		System.out.println("\t \t \t \t \t \t \t \t \t \t Choose from the following:\n"
				+ "\t \t \t \t \t \t \t \t \t \t [1] Patient\n" + "\t \t \t \t \t \t \t \t \t \t [2] Doctor\n"
				+ "\t \t \t \t \t \t \t \t \t \t [3] Staff\n" + "\t \t \t \t \t \t \t \t \t \t [4] Equipment\n"
				+ "\t \t \t \t \t \t \t \t \t \t [5] Add/Remove Staff\n" 
				+ "\t \t \t \t \t \t \t \t \t \t [6] Patient Discharge\n"
				+ "\t \t \t \t \t \t \t \t \t \t [0] Back");
		aInput = scn.nextInt();
		categories(aInput);
	}

	public void categories(int aInput) {
		switch (aInput) {
		case 1:
			System.out.println("=============================================================");
			System.out.println("PATIENTS' RECORD");
			PatientRecord record = new PatientRecord();
			record.displayPT();
			break;
		case 2:
			System.out.println("=============================================================");
			System.out.println("DOCTORS:\n" + "[1] Doctors' Schedule\n" + "[2] Doctors' Appointment\n" + "\t[0] Back");
			aInput = scn.nextInt();
			System.out.println("=============================================================");
			if (aInput == 1) {
				System.out.println("DOCTORS' SCHEDULE\n");
				Ddisplay();
			} else if (aInput == 2) {
				DoctorAppointment docAppnt = new DoctorAppointment();
				docAppnt.doctorAppointment();
			} else if (aInput == 0) {
				pickingAdmin();
			} else {
				System.err.println("Invalid.");
			}
			break;
		case 3:
			ListOfStaff listOfStaff = new ListOfStaff();
			listOfStaff.ListOfStaff();
			System.out.println("=============================================================");
			break;
		case 4:
			Equipment EQ = new Equipment();
			System.out.println("=============================================================");
			System.out.println("EQUIPMENTS:\n" + "[1] Diagnostic Laboratory & Imaging\n"
					+ "[2] Critical Care / ICU equipment\n" + "[3] Operating Theatre(OT)\n" + "[0] Back");
			aInput = scn.nextInt();
			System.out.println();
			if (aInput == 1) {
				EQ.IMG();
			} else if (aInput == 2) {
				EQ.ICU();
			} else if (aInput == 3) {
				EQ.OT();
			} else if (aInput == 0) {
				pickingAdmin();
			} else {
				System.err.println("Invalid.");
			}
			break;
		case 5:
			adminEdit edit = new adminEdit();
			edit.picking();
			break;
		case 6:
			System.out.println(
					"============================================================================================================================================================================================================================================");
			System.out.println("\r\n"
					+ "\t \t \t \t \t \t \t \t \t \t  ██████╗ ██╗███████╗ ██████╗██╗  ██╗ █████╗ ██████╗  ██████╗ ███████╗\r\n"
					+ "\t \t \t \t \t \t \t \t \t \t  ██╔══██╗██║██╔════╝██╔════╝██║  ██║██╔══██╗██╔══██╗██╔════╝ ██╔════╝\r\n"
					+ "\t \t \t \t \t \t \t \t \t \t  ██║  ██║██║███████╗██║     ███████║███████║██████╔╝██║  ███╗█████╗  \r\n"
					+ "\t \t \t \t \t \t \t \t \t \t  ██║  ██║██║╚════██║██║     ██╔══██║██╔══██║██╔══██╗██║   ██║██╔══╝  \r\n"
					+ "\t \t \t \t \t \t \t \t \t \t  ██████╔╝██║███████║╚██████╗██║  ██║██║  ██║██║  ██║╚██████╔╝███████╗\r\n"
					+ "\t \t \t \t \t \t \t \t \t \t   ╚═════╝ ╚═╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝\r\n"
					+ "");

			System.out.println(
					"============================================================================================================================================================================================================================================");
			Discharge dis = new Discharge();
			dis.discharge();
			break;
		case 0:
			Main main = new Main();
			main.pickingMain(aInput, scn);
			break;
		}
	}
	
	}

	