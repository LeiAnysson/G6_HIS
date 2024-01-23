package Package2;
import java.util.*;

public class DoctorAppointment extends PatientAppointment {
	static TreeMap<String, String> list = new TreeMap<>(appointmentList);
	static TreeMap<String, String> cList = new TreeMap<>(AppointmentList);
	
	public static void doctorAppointment() {
		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  LIST OF APPOINTMENTS");

		for (Map.Entry<String, String> entry : appointmentList.entrySet()) {
			String key = entry.getKey().toString();
			System.out.println("\n\t \t \t \t \t \t \t \t \t \t \t \t  Appointment Number: "+ entry.getKey());
			System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  Patient Name: " + appointmentList.get(key));
			System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  Doctor : Dr. " + getChosen());
		}		
	}
}