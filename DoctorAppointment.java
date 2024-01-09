
import java.util.*;

public class DoctorAppointment extends PatientAppointment {
	static TreeMap<String, String> list = new TreeMap<>(appointmentList);
	static TreeMap<String, String> cList = new TreeMap<>(AppointmentList);

	public static void doctorAppointment() {
		System.out.println("LIST OF APPOINTMENTS \n");

		for (Map.Entry<String, String> entry : appointmentList.entrySet()) {
			String key = entry.getKey().toString();
			System.out.println("Appointment Number: " + entry.getKey());
			System.out.println("Patient Name: " + list.get(key));
			System.out.println("Doctor: " + getChosen());

		}

	}

}
