
import java.util.*;

public class PatientAppointment extends DoctorSchedule {
	private static String chosen;
	public static TreeMap<String, String> appointmentList = new TreeMap<>();
	public static TreeMap<String, String> AppointmentList = new TreeMap<>();
	public static TreeMap<String, String> disease = new TreeMap<>();

	public TreeMap<String, String> getList() {
		return PatientAppointment.appointmentList;
	}

	public static void setChosen(String chos) {
		chosen = chos;
	}

	public static String getChosen() {
		return chosen;
	}

	public void patientInfo() {
		Scanner input = new Scanner(System.in);

		System.out.println("=============================================================");
		System.out.println("APPOINTMENT SCHEDULING\n");
		// pickDoctor(input, chosen);
		System.out.print("Enter Last Name: ");
		String lastName = input.nextLine();
		System.out.print("Enter First Name: ");
		String firstName = input.nextLine();
		System.out.print("Enter birth date [DDMMYY]: ");
		String bday = scn.nextLine();
		String name = firstName + " " + lastName;
		System.out.print("Enter Contact #: ");
		String num = input.nextLine();

		diseasePicking();

		String appointmentID = lastName + bday;

		appointmentList.put(appointmentID, name);
		AppointmentList.put(appointmentID, chosen);

		displaySched(lastName, firstName, num, chosen, appointmentID);

	}

	/*
	 * public static void pickDoctor(Scanner input, String chosen) { System.out.
	 * println("Enter the number to select the doctor for an appointment."); String
	 * doctor = input.next(); if (doctor.equals("1")) {
	 * setChosen(doctorSchedule.get("1").toString()); } else if (doctor.equals("2"))
	 * { setChosen(doctorSchedule.get("2").toString()); } else if
	 * (doctor.equals("3")) { setChosen(doctorSchedule.get("3").toString()); } else
	 * if (doctor.equals("4")) { setChosen(doctorSchedule.get("4").toString()); } }
	 */
	public static void displaySched(String lastName, String firstName, String num, String chosen,
			String appointmentID) {
		System.out.println("\n=============================================================");
		System.out.println("\t\tSCHEDULED APPOINTMENT\n");
		System.out.println("\tDoctor: " + getChosen());
		System.out.println("\tAppointment ID: " + appointmentID);
		System.out.println("\n\tName: " + lastName + ", " + firstName + "\t\tContact Num: " + num);
		System.out.println("\n=============================================================");



	}

	public static void disease() {

		disease.put("1", "Cough / Cold");
		disease.put("2", "Fever");
		disease.put("3", "Heart Diseases / Highblood");
		disease.put("4", "Lump / Cyst");
		disease.put("5", "Brain and Spinal Cord / Peripheral Nerves and Muscle");
		disease.put("6", "Musculoskeletal Conditions");
		disease.put("7", "Developmental Disorder / Depression / ADHD");
		disease.put("8", "Osteoarthritis / Osteoporosis / Gout");

	}

	public static void diseasePicking() {
		System.out.println("Choose for the following Disease: ");
		System.out.println("[1] Cough / Cold");
		System.out.println("[2] Fever");
		System.out.println("[3] Heart Diseases / Highblood");
		System.out.println("[4] Lump / Cyst");
		System.out.println("[5] Brain and Spinal Cord / Peripheral Nerves and Muscle");
		System.out.println("[6] Musculoskeletal Conditions");
		System.out.println("[7] Developmental Disorder / Depression / ADHD");
		System.out.println("[8] Osteoarthritis / Osteoporosis / Gout");
		String dPick = scn.next();

		switch (dPick) {
		case "1":
			disease.get("1");
			System.out.println("Recommended Doctor: " + ListOfStaff.D_staffName.get("DR_ELLIS"));
			scn.nextLine();
			picking();
			break;
		case "2": 
			disease.get("2");
			System.out.println("Recommended Doctor: " + ListOfStaff.D_staffName.get("DR_MONROE"));
			scn.nextLine();
			picking();
			break;
		case "3":
			disease.get("3");
			System.out.println("Recommended Doctor: " + ListOfStaff.D_staffName.get("DR_MUNDO"));
			scn.nextLine();
			picking();
			break;
		case "4":
			disease.get("4");
			System.out.println("Recommended Doctor: " + ListOfStaff.D_staffName.get("DR_SPEED"));
			scn.nextLine();
			picking();
			break;
		case "5":
			disease.get("5");
			System.out.println("Recommended Doctor: " + ListOfStaff.D_staffName.get("DR_PEREZ"));
			scn.nextLine();
			picking();
			break;
		case "6":
			disease.get("6");
			System.out.println("Recommended Doctor: " + ListOfStaff.D_staffName.get("DR_SMITH"));
			scn.nextLine();
			picking();
			break;
		case "7":
			disease.get("7");
			System.out.println("Recommended Doctor: " + ListOfStaff.D_staffName.get("DR_VELASQUEZ"));
			scn.nextLine();
			picking();
			break;
		case "8":
			disease.get("8");
			System.out.println("Recommended Doctor: " + ListOfStaff.D_staffName.get("DR_RODRIGUEZ"));
			scn.nextLine();
			picking();
			break;
		}
		
		
	}
}