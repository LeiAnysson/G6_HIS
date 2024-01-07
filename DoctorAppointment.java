package Package2;
import java.util.*;

public class DoctorAppointment extends PatientAppointment{
	static TreeMap<String, String> list = new TreeMap<>(appointmentList);
	static LinkedList<String> doctorList = new LinkedList<>();
	String doc = getChosen();

	public static void doctorAppointment() {
		System.out.println("LIST OF APPOINTMENTS \n");
		System.out.println("Appointment #" + "\t| Patient Name" + "\t| Doctor");
		for(int i = 0; i < list.size(); i++) {
			for (Map.Entry<String, String> entry : list.entrySet()) {
				System.out.println("~ " + entry.getKey() + "\t| " + entry.getValue() + "\t| " + doctorList.get(i));
			}
		}
		System.out.println();
	}
}