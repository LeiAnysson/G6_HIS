import java.util.*;

public class ListOfStaff {

	public void ListOfStaff() {
		Scanner input = new Scanner(System.in);

		List<Staff> name = new ArrayList<>();

		// Doctors
		name.add(new Doctor(" Dr. John Smith", "Orthopedic"));
		name.add(new Doctor(" Dr. Mikko Speed ", "General Surgery"));
		name.add(new Doctor(" Dr. James West", "Pediatrics"));
		name.add(new Doctor(" Dr. Ray Mundo", "Cardiology"));
		name.add(new Doctor(" Dr. Shawn Monroe", ""));
		name.add(new Doctor(" Dr. John Ellis", "Pulmonologist"));
		name.add(new Doctor(" Dr. Kenzo Robert", "Gastroenterologists"));
		name.add(new Doctor(" Dr. Yohan Perez", "Neurologist"));
		name.add(new Doctor(" Dr. Kael Velasquez", "Psychiatrist"));
		name.add(new Doctor(" Dr. Lash Rodriguez", "Rheumatologist"));

		// Nurse
		name.add(new Nurse("Nurse. Janne Barloe", "Registered Nurse"));
		name.add(new Nurse("Nurse. Smith Caddle", "Registered Nurse"));
		name.add(new Nurse("Nurse. Amy Hart", "Registered Nurse"));
		name.add(new Nurse("Nurse. Stella Katz", "Critical Care Nurse"));
		name.add(new Nurse("Nurse. Cassy laurier", "Critical Care Nurse"));
		name.add(new Nurse("Nurse. Kath Santiago", "Critical Care Nurse"));
		name.add(new Nurse("Nurse. Cath Madden", "ER Nurse"));
		name.add(new Nurse("Nurse. Mavis Elrod", "ER Nurse"));
		name.add(new Nurse("Nurse. Fiora Hansley", "ER Nurse"));
		name.add(new Nurse("Nurse. May Monroe ", "Nurse Manager"));

		// Maintenance
		name.add(new Maintenance("Maintenace, Simon Ajello ", "Preventive Maintenance"));
		name.add(new Maintenance("Maintenace, Benjamin Barone ", "Corrective maintenance"));
		name.add(new Maintenance("Maintenace, Lucas Bernard", "Preventive Maintenance"));
		name.add(new Maintenance("Maintenace, Noah Santos", "Corrective maintenance"));
		name.add(new Maintenance("Maintenace, Liam De Leon ", "Preventive Maintenance"));
		name.add(new Maintenance("Maintenace, Oliver Cruz ", "Corrective maintenance"));
		name.add(new Maintenance("Maintenace, William Aquino", "Predictive Maintenance"));
		name.add(new Maintenance("Maintenace, Henry Chavez", "Predictive Maintenance"));
		name.add(new Maintenance("Maintenace, Mateo Abalos", "Hard Floor Maintenance"));
		name.add(new Maintenance("Maintenace, Ethan Gonzales", "Hard Floor Maintenance"));

		System.out.println("---------------Staffs And Maintinance---------------");

		System.out.println("Please Choose a Category: ");
		System.out.println("[1] Doctor");
		System.out.println("[2] Nurse");
		System.out.println("[3] Maintenanace");

		Set<Integer> chosenCategories = new HashSet<>();

		while (chosenCategories.size() < 3) {
			int choice;
			while (true) {
				choice = input.nextInt();

				switch (choice) {
				case 1:
					System.out.println("\r\n"
							+ "\t \t \t \t \t \t \t \t \t \t ██████╗  ██████╗  ██████╗████████╗ ██████╗ ██████╗ ███████╗\r\n"
							+ "\t \t \t \t \t \t \t \t \t \t ██╔══██╗██╔═══██╗██╔════╝╚══██╔══╝██╔═══██╗██╔══██╗██╔════╝\r\n"
							+ "\t \t \t \t \t \t \t \t \t \t ██║  ██║██║   ██║██║        ██║   ██║   ██║██████╔╝███████╗\r\n"
							+ "\t \t \t \t \t \t \t \t \t \t ██║  ██║██║   ██║██║        ██║   ██║   ██║██╔══██╗╚════██║\r\n"
							+ "\t \t \t \t \t \t \t \t \t \t ██████╔╝╚██████╔╝╚██████╗   ██║   ╚██████╔╝██║  ██║███████║\r\n"
							+ "\t \t \t \t \t \t \t \t \t \t ╚═════╝  ╚═════╝  ╚═════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝\r\n"
							+ "");
					for (Staff staffs : name) {
						if (staffs instanceof Doctor) {
							staffs.displayInfo();
							System.out.println();
						}
					}

					break;

				case 2:
					System.out.println("---------- NURSE ----------");
					for (Staff staffs : name) {
						if (staffs instanceof Nurse) {
							staffs.displayInfo();
							System.out.println();
						}
					}

					break;

				case 3:
					System.out.println("---------- MAINTENANCE ----------");
					for (Staff staffs : name) {
						if (staffs instanceof Maintenance) {
							staffs.displayInfo();
							System.out.println();
						}
					}

				default:
					System.out.println("------------------------------------");

				}
				if (chosenCategories.add(choice)) {
					break;
				} else {
					System.out.println("Category already chosen. Please choose a different category.");

				}

			}
		}
	}
}
