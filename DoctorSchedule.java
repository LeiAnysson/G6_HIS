package doctorSchedule;

import java.util.*;

public class DoctorSchedule {
	static String schedule;
	static Scanner scn = new Scanner(System.in);
	static TreeMap<String, String> doctorSchedule = new TreeMap<>();

	public static void main(String[] args) {

		System.out.println("Press 1 to see the names of Doctors");
		String schedule = scn.next();
		if (schedule.equals("1")) {
			doctorSchedule.put("1", "Dr.Smith");
			doctorSchedule.put("2", "Dr. James");
			doctorSchedule.put("3", "Dr.Mundo");
			doctorSchedule.put("4", "Dr. Speed");
			System.out.println(doctorSchedule.values());
			picking();
		}
		while (true) {
			System.out.println("[0]Back");
			String back = scn.next();

			if (back.equals("0")) {
				picking();
			} else {
				System.exit(0);
			}
		}
	}

	public static void picking() {

		System.out.println("------------------------------------------------");
		System.out.println("Choose Number to see the details of each Doctors");
		System.out.println("[1]" + doctorSchedule.get("1") + "\t" + "[2]" + doctorSchedule.get("2") + "\t" + "[3]"
				+ doctorSchedule.get("3") + "\t" + "[4]" + doctorSchedule.get("4"));
		String details = scn.next();

		if (details.equals("1")) {
			doctorSchedule.get("1");
			Doc1(); 
		} else if (details.equals("2")) {
			doctorSchedule.get("2");
			Doc2();
		} else if (details.equals("3")) {
			doctorSchedule.get("3");
			Doc3();
		} else if (details.equals("4")) {
			doctorSchedule.get("4");
			Doc4();
		}
	}
	public static void Doc1() {
		System.out.println("Name: Dr. Smith");
		System.out.println("Room: RM-101");
		System.out.println("Specialization: Orthopedic");
		System.out.println("Contact Number: 0912-223-4431");
		System.out.println("Schedule: Mon-Wed \t Time: 8am - 4pm");
	}
	public static void Doc2() {
		System.out.println("Name: Dr. James");
		System.out.println("Room: RM-102");
		System.out.println("Specialization: Pediatrics");
		System.out.println("Contact Number: 0953-223-2213");
		System.out.println("Schedule: Tues-Fri \t Time: 8am - 1pm");
	}
	public static void Doc3() {
		System.out.println("Name: Dr. Mundo");
		System.out.println("Room: RM-103");
		System.out.println("Specialization: Cardiology");
		System.out.println("Contact Number: 0966-213-2713");
		System.out.println("Schedule: Fri-Saturday \t Time: 12pm - 5pm");
	}
	public static void Doc4() {
		System.out.println("Name: Dr. Speed");
		System.out.println("Room: RM-104");
		System.out.println("Specialization: General Surgery");
		System.out.println("Contact Number: 0942-221-2253");
		System.out.println("Schedule: Saturday \t Time: 8am - 4pm");
	}

}
