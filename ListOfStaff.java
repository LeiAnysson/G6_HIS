package Package2;
import java.util.*;

public class ListOfStaff extends adminEdit{

	public void ListOfStaff(){
		Scanner input = new Scanner(System.in);

		List<Staff> name = new ArrayList<>();

		// Doctors
		name.add(new Doctor(" Dr. John Smith", "Orthopedic"));
		name.add(new Doctor(" Dr. Mikko Speed ", "General Surgery"));	
		name.add(new Doctor(" Dr. James West", "Pediatrics"));	
		name.add(new Doctor(" Dr. Ray Mundo", "Cardiology"));		
		name.add(new Doctor(" Dr. Shawn Monroe", "Dermatologist"));	
		name.add(new Doctor(" Dr. John Ellis", "Pulmonologist"));	
		name.add(new Doctor(" Dr. Kenzo Robert", "Gastroenterologist"));	
		name.add(new Doctor(" Dr. Yohan Perez", "Neurologist"));	
		name.add(new Doctor(" Dr. Kael Velasquez", "Psychiatrist"));	
		name.add(new Doctor(" Dr. Lash Rodriguez", "Rheumatologist"));
			

		// Nurse
		name.add(new Nurse("Nurse Janne Barloe", "Registered Nurse"));
		name.add(new Nurse("Nurse Smith Caddle", "Registered Nurse"));
		name.add(new Nurse("Nurse Amy Hart", "Registered Nurse"));
		name.add(new Nurse("Nurse Stella Katz", "Critical Care Nurse"));
		name.add(new Nurse("Nurse Cassy laurier", "Critical Care Nurse"));
		name.add(new Nurse("Nurse Kath Santiago", "Critical Care Nurse"));
		name.add(new Nurse("Nurse Cath Madden", "ER Nurse"));
		name.add(new Nurse("Nurse Mavis Elrod", "ER Nurse"));
		name.add(new Nurse("Nurse Fiora Hansley", "ER Nurse"));
		name.add(new Nurse("Nurse May Monroe ", "Nurse Manager"));

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
	public static void D_staffMap() {
		D_staffName.put("DR_SMITH", "John Smith");
		D_staffPosition.put("DR_SMITH", "Orthopedic");
		D_staffNumber.put("DR_SMITH", "XXXX-XXXX-XXX");
		D_staffName.put("DR_SPEED", "Mikko Speed");
		D_staffPosition.put("DR_SPEED", "General Surgery");
		D_staffNumber.put("DR_SPEED", "XXXX-XXXX-XXX");
		D_staffName.put("DR_WEST", "James West");
		D_staffPosition.put("DR_WEST", "Pediatrics");
		D_staffNumber.put("DR_WEST", "XXXX-XXXX-XXX");
		D_staffName.put("DR_MUNDO", "Ray Mundo");
		D_staffPosition.put("DR_MUNDO", "Cardiology");
		D_staffNumber.put("DR_MUNDO", "XXXX-XXXX-XXX");
		D_staffName.put("DR_MONROE", "Shawn Monroe");
		D_staffPosition.put("DR_MONROE", "Dermatologist");
		D_staffNumber.put("DR_MONROE", "XXXX-XXXX-XXX");
		D_staffName.put("DR_ELLIS", "John Ellis");
		D_staffPosition.put("DR_ELLIS", "Pulmonologist");
		D_staffNumber.put("DR_ELLIS", "XXXX-XXXX-XXX");
		D_staffName.put("DR_ROBERT", "Kenzo Robert");
		D_staffPosition.put("DR_ROBERT", "Gastroenterologist");
		D_staffNumber.put("DR_ROBERT", "XXXX-XXXX-XXX");
		D_staffName.put("DR_PEREZ", "Yohan Perez");
		D_staffPosition.put("DR_PEREZ", "Neurologist");
		D_staffNumber.put("DR_PEREZ", "XXXX-XXXX-XXX");
		D_staffName.put("DR_VELASQUEZ", "Kael Velasquez");
		D_staffPosition.put("DR_VELASQUEZ", "Psychiatrist");
		D_staffNumber.put("DR_VELASQUEZ", "XXXX-XXXX-XXX");
		D_staffName.put("DR_RODRIGUEZ", "Lash Rodriguez");
		D_staffPosition.put("DR_RODRIGUEZ", "Rheumatologist");
		D_staffNumber.put("DR_RODRIGUEZ", "XXXX-XXXX-XXX");
	}
	public static void N_staffMap() {							//nurse
		N_staffName.put("DR_SMITH", "John Smith");
		N_staffPosition.put("DR_SMITH", "Orthopedic");
		N_staffNumber.put("DR_SMITH", "XXXX-XXXX-XXX");
		N_staffName.put("DR_SPEED", "Mikko Speed");
		N_staffPosition.put("DR_SPEED", "General Surgery");
		N_staffNumber.put("DR_SPEED", "XXXX-XXXX-XXX");
		N_staffName.put("DR_WEST", "James West");
		N_staffPosition.put("DR_WEST", "Pediatrics");
		N_staffNumber.put("DR_WEST", "XXXX-XXXX-XXX");
		N_staffName.put("DR_MUNDO", "Ray Mundo");
		N_staffPosition.put("DR_MUNDO", "Cardiology");
		N_staffNumber.put("DR_MUNDO", "XXXX-XXXX-XXX");
		N_staffName.put("DR_MONROE", "Shawn Monroe");
		N_staffPosition.put("DR_MONROE", "Dermatologist");
		N_staffNumber.put("DR_MONROE", "XXXX-XXXX-XXX");
		N_staffName.put("DR_ELLIS", "John Ellis");
		N_staffPosition.put("DR_ELLIS", "Pulmonologist");
		N_staffNumber.put("DR_ELLIS", "XXXX-XXXX-XXX");
		N_staffName.put("DR_ROBERT", "Kenzo Robert");
		N_staffPosition.put("DR_ROBERT", "Gastroenterologist");
		N_staffNumber.put("DR_ROBERT", "XXXX-XXXX-XXX");
		N_staffName.put("DR_PEREZ", "Yohan Perez");
		N_staffPosition.put("DR_PEREZ", "Neurologist");
		N_staffNumber.put("DR_PEREZ", "XXXX-XXXX-XXX");
		N_staffName.put("DR_VELASQUEZ", "Kael Velasquez");
		N_staffPosition.put("DR_VELASQUEZ", "Psychiatrist");
		N_staffNumber.put("DR_VELASQUEZ", "XXXX-XXXX-XXX");
		N_staffName.put("DR_RODRIGUEZ", "Lash Rodriguez");
		N_staffPosition.put("DR_RODRIGUEZ", "Rheumatologist");
		N_staffNumber.put("DR_RODRIGUEZ", "XXXX-XXXX-XXX");
	}
	public static void M_staffMap() {						//maintenance
		M_staffName.put("DR_SMITH", "John Smith");
		M_staffPosition.put("DR_SMITH", "Orthopedic");
		M_staffNumber.put("DR_SMITH", "XXXX-XXXX-XXX");
		M_staffName.put("DR_SPEED", "Mikko Speed");
		M_staffPosition.put("DR_SPEED", "General Surgery");
		M_staffNumber.put("DR_SPEED", "XXXX-XXXX-XXX");
		M_staffName.put("DR_WEST", "James West");
		M_staffPosition.put("DR_WEST", "Pediatrics");
		M_staffNumber.put("DR_WEST", "XXXX-XXXX-XXX");
		M_staffName.put("DR_MUNDO", "Ray Mundo");
		M_staffPosition.put("DR_MUNDO", "Cardiology");
		M_staffNumber.put("DR_MUNDO", "XXXX-XXXX-XXX");
		M_staffName.put("DR_MONROE", "Shawn Monroe");
		M_staffPosition.put("DR_MONROE", "Dermatologist");
		M_staffNumber.put("DR_MONROE", "XXXX-XXXX-XXX");
		M_staffName.put("DR_ELLIS", "John Ellis");
		M_staffPosition.put("DR_ELLIS", "Pulmonologist");
		M_staffNumber.put("DR_ELLIS", "XXXX-XXXX-XXX");
		M_staffName.put("DR_ROBERT", "Kenzo Robert");
		M_staffPosition.put("DR_ROBERT", "Gastroenterologist");
		M_staffNumber.put("DR_ROBERT", "XXXX-XXXX-XXX");
		M_staffName.put("DR_PEREZ", "Yohan Perez");
		M_staffPosition.put("DR_PEREZ", "Neurologist");
		M_staffNumber.put("DR_PEREZ", "XXXX-XXXX-XXX");
		M_staffName.put("DR_VELASQUEZ", "Kael Velasquez");
		M_staffPosition.put("DR_VELASQUEZ", "Psychiatrist");
		M_staffNumber.put("DR_VELASQUEZ", "XXXX-XXXX-XXX");
		M_staffName.put("DR_RODRIGUEZ", "Lash Rodriguez");
		M_staffPosition.put("DR_RODRIGUEZ", "Rheumatologist");
		M_staffNumber.put("DR_RODRIGUEZ", "XXXX-XXXX-XXX");
	}
}
