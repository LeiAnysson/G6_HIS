
import java.util.*;

public class DoctorAppointment extends PatientAppointment {

	static TreeMap<String, String> list = new TreeMap<>(appointmentList);
	static TreeMap<String, String> cList = new TreeMap<>(AppointmentList);

	public static void doctorAppointment() {
		System.out.println("LIST OF APPOINTMENTS \n");
		System.out.println("Appointment #" + "\t| Patient Name" + "\t| Doctor");

		for (Map.Entry<String, String> entry : appointmentList.entrySet()) {
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			System.out.print(entry.getKey());
			System.out.print("\t " + list.get(key));
			System.out.println("\t \t " + cList.get(key));
		}

	}
}