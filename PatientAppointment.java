package oopTp;
import java.util.*;

public class PatientAppointment extends DoctorSchedule{ 
	private static String chosen;
	public static TreeMap<String, String> appointmentList = new TreeMap<>();
	public TreeMap<String, String> getList() {
        return this.appointmentList;
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
	    pickDoctor(input, chosen);
	    input.nextLine();
	    System.out.print("Enter Last Name: ");
	    String lastName = input.nextLine();
	    System.out.print("Enter First Name: ");
	    String firstName = input.nextLine();
	    System.out.println("Enter birth date [DDMMYY]: ");
	    String bday = scn.nextLine();
	    String name = firstName + " " + lastName;
	    System.out.print("Enter Contact #: ");
	    String num = input.nextLine();
	    
	    String appointmentID = lastName + bday;
	    
	    appointmentList.put(appointmentID, name);
	    displaySched(lastName, firstName, num, chosen, appointmentID);  
	}
	public static void pickDoctor(Scanner input, String chosen) {
	    System.out.println("Enter the number to select the doctor for an appointment.");
	    String doctor = input.next();
		if (doctor.equals("1")) {
			setChosen(doctorSchedule.get("1").toString());
		} else if (doctor.equals("2")) {
			setChosen(doctorSchedule.get("2").toString());
		} else if (doctor.equals("3")) {
			setChosen(doctorSchedule.get("3").toString());
		} else if (doctor.equals("4")) {
			setChosen(doctorSchedule.get("4").toString());
		}
	}
	public static void displaySched(String lastName, String firstName, String num, String chosen, String appointmentID) {
		System.out.println("\n=============================================================");
	    System.out.println("\t\tSCHEDULED APPOINTMENT\n");
	    System.out.println("\tDoctor: " + getChosen());
	    System.out.println("\tAppointment ID: " + appointmentID);
	    System.out.println("\n\tName: " + lastName + ", " + firstName  + "\t\tContact Num: " + num );
		System.out.println("\n=============================================================");
		DoctorAppointment docAppnt = new DoctorAppointment();
		DoctorAppointment.doctorAppointment();
	}
}