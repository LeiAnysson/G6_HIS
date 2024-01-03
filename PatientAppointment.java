package Package2;
import java.util.*;

public class PatientAppointment extends DoctorSchedule{ 
	private static String chosen;
	static String appointmentID = generateRandomAppointmentId();
	public TreeMap<String, String> appointmentList = new TreeMap<>();
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
	    System.out.print("Enter Name: ");
	    String name = input.nextLine();
	    System.out.print("Enter Contact #: ");
	    int num = input.nextInt();  
	    
	    displaySched(name, num, chosen, appointmentID);
	    appointmentList.put(appointmentID, name);
	    
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
	public static void displaySched(String name , int num, String chosen, String appointmentID) {
		System.out.println("\n=============================================================");
	    System.out.println("\t\tSCHEDULED APPOINTMENT\n");
	    System.out.println("\tDoctor: " + getChosen());
	    System.out.println("\tAppointment ID: " + appointmentID);
	    System.out.println("\n\tName: " + name  + "\t\tContact Num: " + num );
		System.out.println("\n=============================================================");
		//DoctorAppointment docAppnt = new DoctorAppointment();
		//docAppnt.doctorAppointment();
	}
	private static String generateRandomAppointmentId() {
	    int idLength = 8;
	    String allowedCharacters = "0123456789";
	    StringBuilder randomId = new StringBuilder(idLength);
	    Random random = new Random();

	    for (int i = 0; i < idLength; i++) {
	    	int randomIndex = random.nextInt(allowedCharacters.length());
	        randomId.append(allowedCharacters.charAt(randomIndex));
	    }
	    return randomId.toString();  
	    }
}
