import java.util.*;

public class DoctorAppointment {
	private static String doctor;
	static PatientAppointment dAppointment = new PatientAppointment();
	static TreeMap<String, String> list = dAppointment.getList();

	public static void setDoctor(String d) {
		d = dAppointment.getChosen();
		doctor = d;
	}

	public static String getDoctor() {
		return doctor;
	}

	public static void doctorAppointment() {
		System.out.println("LIST OF APPOINTMENTS \n");
		System.out.println("Appointment #" + "\tPatient Name" + "\tDoctor");
		for (Map.Entry<String, String> entry : dAppointment.appointmentList.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue() + "\t" + getDoctor());
		}

	}
}