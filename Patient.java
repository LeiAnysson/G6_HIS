package Package2;
import java.util.*;
public class Patient extends DoctorSchedule{
	Scanner scn = new Scanner(System.in);
	public void Patient() {
		int pInput = 0;
		while(true) {
			pickingPatient(pInput);
			categories(pInput);
		}
	}
	public void pickingPatient(int pInput) {
		System.out.println("=============================================================");
		System.out.println("PATIENT");
		System.out.println("Choose from the ff:\n"
				+ "[1] Patients' Appointment\n"
				+ "[2] Admission\n"
				+ "[3] Discharge\n"
				+ "[4] Billing");
		pInput = scn.nextInt();
		categories(pInput);
	}
	public void categories(int pInput) {
		switch(pInput) {
		case 1:
			System.out.println("=============================================================");
			System.out.println("PATIENTS' APPOINTMENT");
			doctorSchedule();
			
			break;
		case 2:
			Admission admission = new Admission();
			admission.admit();
			break;
		case 3:
			System.out.println("=============================================================");
			System.out.println("DISCHARGE");
			break;
		case 4:
			System.out.println("=============================================================");
			System.out.println("BILLING");
			break;
	}
		//pickingPatient(pInput);
	}
}
