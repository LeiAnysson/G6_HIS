package Package2;
import java.util.*;
public class Patient extends DoctorSchedule{
	Scanner scn = new Scanner(System.in);
	public void Patient() {
		System.out.println("=============================================================");
		System.out.println("PATIENT");
		System.out.println("Choose from the ff:\n"
				+ "[1] Patients' Appointment\n"
				+ "[2] Admission\n"
				+ "[3] Discharge\n"
				+ "[4] Billing");
		int input = scn.nextInt();
		switch(input) {
			case 1:
				System.out.println("PATIENTS' APPOINTMENT");
				doctorSchedule();
				break;
			case 2:
				Admission admission = new Admission();
				admission.admit();
				break;
			case 3:
				System.out.println("DISCHARGE");
				break;
			case 4:
				System.out.println("BILLING");
				break;
		}
	}
}
