package Package2;
import java.util.*;

public class ListOfStaff extends adminEdit{

	public void ListOfStaff(){
		Scanner input = new Scanner(System.in);

		List<Staff> name = new ArrayList<>();

		// Doctors
		name.add(new Doctor("												Dr. John Smith", "Orthopedic"));
		name.add(new Doctor(" 												Dr. Mikko Speed ", "General Surgery"));	
		name.add(new Doctor(" 												Dr. James West", "Pediatrics"));	
		name.add(new Doctor(" 												Dr. Ray Mundo", "Cardiology"));		
		name.add(new Doctor(" 												Dr. Shawn Monroe", "Dermatologist"));	
		name.add(new Doctor(" 												Dr. John Ellis", "Pulmonologist"));	
		name.add(new Doctor(" 												Dr. Kenzo Robert", "Gastroenterologist"));	
		name.add(new Doctor(" 												Dr. Yohan Perez", "Neurologist"));	
		name.add(new Doctor(" 												Dr. Kael Velasquez", "Psychiatrist"));	
		name.add(new Doctor(" 												Dr. Lash Rodriguez", "Rheumatologist"));
			

		// Nurse
		name.add(new Nurse("												Nurse Janne Barloe", "Registered Nurse"));
		name.add(new Nurse("												Nurse Smith Caddle", "Registered Nurse"));
		name.add(new Nurse("												Nurse Amy Hart", "Registered Nurse"));
		name.add(new Nurse("												Nurse Stella Katz", "Critical Care Nurse"));
		name.add(new Nurse("												Nurse Cassy laurier", "Critical Care Nurse"));
		name.add(new Nurse("												Nurse Kath Santiago", "Critical Care Nurse"));
		name.add(new Nurse("												Nurse Cath Madden", "ER Nurse"));
		name.add(new Nurse("												Nurse Mavis Elrod", "ER Nurse"));
		name.add(new Nurse("												Nurse Fiora Hansley", "ER Nurse"));
		name.add(new Nurse("												Nurse May Monroe ", "Nurse Manager"));

		// Maintenance
		name.add(new Maintenance("												Maintenace, Simon Ajello ", "Preventive Maintenance"));
		name.add(new Maintenance("												Maintenace, Benjamin Barone ", "Corrective maintenance"));
		name.add(new Maintenance("												Maintenace, Lucas Bernard", "Preventive Maintenance"));
		name.add(new Maintenance("												Maintenace, Noah Santos", "Corrective maintenance"));
		name.add(new Maintenance("												Maintenace, Liam De Leon ", "Preventive Maintenance"));
		name.add(new Maintenance("												Maintenace, Oliver Cruz ", "Corrective maintenance"));
		name.add(new Maintenance("												Maintenace, William Aquino", "Predictive Maintenance"));
		name.add(new Maintenance("												Maintenace, Henry Chavez", "Predictive Maintenance"));
		name.add(new Maintenance("												Maintenace, Mateo Abalos", "Hard Floor Maintenance"));
		name.add(new Maintenance("												Maintenace, Ethan Gonzales", "Hard Floor Maintenance"));

		System.out.println("===========================================================================================================");

		System.out.println("												Please Choose a Category: ");
		System.out.println("												[1] Doctor");
		System.out.println("												[2] Nurse");
		System.out.println("												[3] Maintenance");
		System.out.println("												[4] Homepage");

		Set<Integer> chosenCategories = new HashSet<>();

		while (chosenCategories.size() <= 3) {
			int choice;
			while (true) {
				choice = input.nextInt();

				switch (choice) {
				case 1:
					System.out.println("\r\n"
							+ "\t \t \t \t \t \t \t \t \t  ██████╗  ██████╗  ██████╗████████╗ ██████╗ ██████╗ ███████╗\r\n"
							+ "\t \t \t \t \t \t \t \t \t  ██╔══██╗██╔═══██╗██╔════╝╚══██╔══╝██╔═══██╗██╔══██╗██╔════╝\r\n"
							+ "\t \t \t \t \t \t \t \t \t  ██║  ██║██║   ██║██║        ██║   ██║   ██║██████╔╝███████╗\r\n"
							+ "\t \t \t \t \t \t \t \t \t  ██║  ██║██║   ██║██║        ██║   ██║   ██║██╔══██╗╚════██║\r\n"
							+ "\t \t \t \t \t \t \t \t \t  ██████╔╝╚██████╔╝╚██████╗   ██║   ╚██████╔╝██║  ██║███████║\r\n"
							+ "\t \t \t \t \t \t \t \t \t  ╚═════╝  ╚═════╝  ╚═════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝\r\n"
							+ "");
					for (Staff staffs : name) {
						if (staffs instanceof Doctor) {
							staffs.displayInfo();
							System.out.println();
						}
					}
					System.out.println("===========================================================================================================");

					System.out.println("												Please Choose a Category: ");
					System.out.println("												[1] Doctor");
					System.out.println("												[2] Nurse");
					System.out.println("												[3] Maintenance");
					System.out.println("												[4] Homepage");

					break;

				case 2:
					System.out.println("\r\n"
							+ "									███╗   ██╗██╗   ██╗██████╗ ███████╗███████╗\r\n"
							+ "									████╗  ██║██║   ██║██╔══██╗██╔════╝██╔════╝\r\n"
							+ "									██╔██╗ ██║██║   ██║██████╔╝███████╗█████╗  \r\n"
							+ "									██║╚██╗██║██║   ██║██╔══██╗╚════██║██╔══╝  \r\n"
							+ "									██║ ╚████║╚██████╔╝██║  ██║███████║███████╗\r\n"
							+ "									╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝╚══════╝\r\n"
							+ "                                           \r\n"
							+ "");
					for (Staff staffs : name) {
						if (staffs instanceof Nurse) {
							staffs.displayInfo();
							System.out.println();

						}
					}
					System.out.println("===========================================================================================================");

					System.out.println("												Please Choose a Category: ");
					System.out.println("												[1] Doctor");
					System.out.println("												[2] Nurse");
					System.out.println("												[3] Maintenance");
					System.out.println("												[4] Homepage");

					break;

				case 3:
					System.out.println("---------- MAINTENANCE ----------");
					for (Staff staffs : name) {
						if (staffs instanceof Maintenance) {
							staffs.displayInfo();
							System.out.println();

						}
					}
					System.out.println("===========================================================================================================");

					System.out.println("												Please Choose a Category: ");
					System.out.println("												[1] Doctor");
					System.out.println("												[2] Nurse");
					System.out.println("												[3] Maintenance");
					System.out.println("												[4] Homepage");
					break;
				case 4:
					Admin admin = new Admin();
					admin.pickingAdmin();
					break;
				}
				//redirect();
				if (chosenCategories.add(choice)) {
					break;
				} else {
					System.out.println("												Category already chosen. Please choose a different category.");

				}

			}
		}
	}
	public static void D_staffMap() {
		D_staffName.put("DR_SMITH", "John Smith");
		D_staffPosition.put("DR_SMITH", "Orthopedic");
		D_staffNumber.put("DR_SMITH", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_SMITH", "Monday-Wednesday \nTime: 8am - 4pm \nRoom: RM-101");
		D_staffName.put("DR_SPEED", "Mikko Speed");
		D_staffPosition.put("DR_SPEED", "General Surgery");
		D_staffNumber.put("DR_SPEED", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_SPEED", "Saturday \nTime: 8am - 4pm \nRoom: RM-102");
		D_staffName.put("DR_WEST", "James West");
		D_staffPosition.put("DR_WEST", "Pediatrics");
		D_staffNumber.put("DR_WEST", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_WEST", "Tuesday-Friday \nTime: 8am - 1pm \nRoom: RM-103");
		D_staffName.put("DR_MUNDO", "Ray Mundo");
		D_staffPosition.put("DR_MUNDO", "Cardiologist");
		D_staffNumber.put("DR_MUNDO", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_MUNDO", "Friday-Saturday \nTime: 12pm - 5pm \nRoom: RM-104");
		D_staffName.put("DR_MONROE", "Shawn Monroe");
		D_staffPosition.put("DR_MONROE", "Dermatologist");
		D_staffNumber.put("DR_MONROE", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_MONROE", "Tuesday-Thursday \nTime: 12pm - 4pm \nRoom: RM-105");
		D_staffName.put("DR_ELLIS", "John Ellis");
		D_staffPosition.put("DR_ELLIS", "Pulmonologist");
		D_staffNumber.put("DR_ELLIS", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_ELLIS", "Tuesday \nTime: 8am - 4pm \nRoom: RM-106");
		D_staffName.put("DR_ROBERT", "Kenzo Robert");
		D_staffPosition.put("DR_ROBERT", "Gastroenterologist");
		D_staffNumber.put("DR_ROBERT", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_ROBERT", "Monday \nTime: 8am - 12pm \nRoom: RM-107");
		D_staffName.put("DR_PEREZ", "Yohan Perez");
		D_staffPosition.put("DR_PEREZ", "Neurologist");
		D_staffNumber.put("DR_PEREZ", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_PEREZ", "Wednesday-Friday \nTime: 8am - 4pm \nRoom: RM-108");
		D_staffName.put("DR_VELASQUEZ", "Kael Velasquez");
		D_staffPosition.put("DR_VELASQUEZ", "Psychiatrist");
		D_staffNumber.put("DR_VELASQUEZ", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_VELASQUEZ", "Monday-Tuesday \nTime: 12pm - 4pm \nRoom: RM-109");
		D_staffName.put("DR_RODRIGUEZ", "Lash Rodriguez");
		D_staffPosition.put("DR_RODRIGUEZ", "Rheumatologist");
		D_staffNumber.put("DR_RODRIGUEZ", "XXXX-XXXX-XXX");
		D_staffSched.put("DR_RODRIGUEZ", "Saturday \nTime: 8am - 4pm \nRoom: RM-110");
	}
	public static void N_staffMap() {							//nurse
		N_staffName.put("RN_BARLOE", "Jane Barloe");
		N_staffPosition.put("RN_BARLOE", "Registered Nurse");
		N_staffNumber.put("RN_BARLOE", "XXXX-XXXX-XXX");
		N_staffName.put("RN_CADDLE", "Smith Caddle");
		N_staffPosition.put("RN_CADDLE", "Registered Nurse");
		N_staffNumber.put("RN_CADDLE", "XXXX-XXXX-XXX");
		N_staffName.put("RN_HART", "Amy Hart");
		N_staffPosition.put("RN_HART", "Registerd Nurse");
		N_staffNumber.put("RN_HART", "XXXX-XXXX-XXX");
		N_staffName.put("RN_KATZ", "Stella Katz");
		N_staffPosition.put("RN_KATZ", "Critical Care Nurse");
		N_staffNumber.put("RN_KATZ", "XXXX-XXXX-XXX");
		N_staffName.put("RN_LAURIER", "Caassy Laurier");
		N_staffPosition.put("RN_LAURIER", "Critical Care Nurse");
		N_staffNumber.put("RN_LAURIER", "XXXX-XXXX-XXX");
		N_staffName.put("RN_SANTIAGO", "Kath Santiago");
		N_staffPosition.put("RN_SANTIAGO", "Critical Care Nurse");
		N_staffNumber.put("RN_SANTIAGO", "XXXX-XXXX-XXX");
		N_staffName.put("RN_MADDEN", "Cath Madden");
		N_staffPosition.put("RN_MADDEN", "ER Nurse");
		N_staffNumber.put("RN_MADDEN", "XXXX-XXXX-XXX");
		N_staffName.put("RN_ELROD", "Mavis Elrod");
		N_staffPosition.put("RN_ELROD", "ER Nurse");
		N_staffNumber.put("RN_ELROD", "XXXX-XXXX-XXX");
		N_staffName.put("RN_HANSLEY", "Fiora Hansley");
		N_staffPosition.put("RN_HANSLEY", "ER Nurse");
		N_staffNumber.put("RN_HANSLEY", "XXXX-XXXX-XXX");
		N_staffName.put("RN_MONROE", "May Monroe");
		N_staffPosition.put("RN_MONROE", "ER Nurse");
		N_staffNumber.put("RN_MONROE", "XXXX-XXXX-XXX");
	}
	public static void M_staffMap() {						//maintenance
		M_staffName.put("MT_AJELLO", "Simon Ajello");
		M_staffPosition.put("MT_AJELLO", "Preventive Maintenance");
		M_staffNumber.put("MT_AJELLO", "XXXX-XXXX-XXX");
		M_staffName.put("MT_BARONE", "Benjamin Barone");
		M_staffPosition.put("MT_BARONE", "Corrective Maintenance");
		M_staffNumber.put("MT_BARONE", "XXXX-XXXX-XXX");
		M_staffName.put("MT_BERNARD", "Lucas Bernard");
		M_staffPosition.put("MT_BERNARD", "Preventative Maintenance");
		M_staffNumber.put("MT_BERNARD", "XXXX-XXXX-XXX");
		M_staffName.put("MT_SANTOS", "Noah Santos");
		M_staffPosition.put("MT_SANTOS", "Corrective Maintenance");
		M_staffNumber.put("MT_SANTOS", "XXXX-XXXX-XXX");
		M_staffName.put("MT_DELEON", "Liam De leon");
		M_staffPosition.put("MT_DELEON", "Preventive Maintenance");
		M_staffNumber.put("MT_DELEON", "XXXX-XXXX-XXX");
		M_staffName.put("MT_CRUZ", "Oliver Cruz");
		M_staffPosition.put("MT_CRUZ", "Corrective Maintenance");
		M_staffNumber.put("MT_CRUZ", "XXXX-XXXX-XXX");
		M_staffName.put("MT_AQUINO", "William Aquino");
		M_staffPosition.put("MT_AQUINO", "Predective Maintenance");
		M_staffNumber.put("MT_AQUINO", "XXXX-XXXX-XXX");
		M_staffName.put("MT_CHAVEZ", "Henry Chavez");
		M_staffPosition.put("MT_CHAVEZ", "Predictive Nurse");
		M_staffNumber.put("MT_CHAVEZ", "XXXX-XXXX-XXX");
		M_staffName.put("MT_ABALOS", "Mateo Abalos");
		M_staffPosition.put("MT_ABALOS", "Hard Floor Maintenance");
		M_staffNumber.put("MT_ABALOS", "XXXX-XXXX-XXX");
		M_staffName.put("MT_ETHAN", "Ethan Gonzales");
		M_staffPosition.put("MT_ETHAN", "Hard Floor Maintenance");
		M_staffNumber.put("MT_ETHAN", "XXXX-XXXX-XXX");
	}
	public void redirect() {
		System.out.println("\n												[4] Homepage\n"
				+ "[0] Exit");
		String input = scn.next();
		if(input.equalsIgnoreCase("4")) {
			Admin admin = new Admin();
			admin.pickingAdmin();
		}
		else if(input.equalsIgnoreCase("0")) {
			Main main = new Main();
			main.thanks();
		}
	}
}
