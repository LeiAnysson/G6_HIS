

import java.util.*;

public class adminEdit {
	static Scanner scn = new Scanner(System.in);
	static String pick = "";
	static Map<String,String> D_staffName = new TreeMap<>();
	static Map<String,String> D_staffPosition = new TreeMap<>();
	static Map<String,String> D_staffNumber = new TreeMap<>();
	static Map<String,String> D_staffSched = new TreeMap<>();
	static Map<String,String> N_staffName = new TreeMap<>();
	static Map<String,String> N_staffPosition = new TreeMap<>();
	static Map<String,String> N_staffNumber = new TreeMap<>();
	static Map<String,String> M_staffName = new TreeMap<>();
	static Map<String,String> M_staffPosition = new TreeMap<>();
	static Map<String,String> M_staffNumber = new TreeMap<>();
	static ListOfStaff staffList = new ListOfStaff();
	String lastName;
	String firstName;
	String position;
	String contactNum;
	String name;
	String docID = "";
	String nrsID = "";
	String mtnID = "";
	String rmID;
	public void addStaff() {
		staffList.D_staffMap();
		staffList.N_staffMap();
		staffList.M_staffMap();
	}
	public void picking() {
		System.out.println("============================================================================================================================================================================================================================================");
		System.out.println("Choose which staff to edit: \n" 
				+ "[1] Doctors\n" 
				+ "[2] Nurses\n" 
				+ "[3] Maintenance\n"
				+ "[0] Back");
		pick = scn.next();
		addStaff();
		editStaff();
	}
	public void editStaff() {
		
			if(pick.equals("1")) {														//doctors
				displayDOC(D_staffName, D_staffPosition, D_staffNumber);
				while(true) {
					pickAR();
					pick = scn.next();
					if (pick.equals("1")) {						//add
						scn.nextLine();
						System.out.print("Enter Last Name: ");
						lastName = scn.nextLine();
						System.out.print("Enter First Name: ");
						firstName = scn.nextLine();
						name = firstName + " " + lastName;
	
						System.out.print("Enter Position: ");
						position = scn.nextLine();
						System.out.print("Enter Contact Number: ");
						contactNum = scn.nextLine();
	
						docID = "DR_" + lastName.toUpperCase();
	
						D_staffName.put(docID, name);
						D_staffPosition.put(docID, position);
						D_staffNumber.put(docID, contactNum);
	
						System.out.println("Added Successfully!");
						displayDOC(D_staffName, D_staffPosition, D_staffNumber);
					}
				 else if(pick.equals("2")) {								//remove
					 scn.nextLine();
					
						System.out.print("Enter Doctor ID to delete [DR_LASTNAME]: ");
						rmID = scn.nextLine();
						if(D_staffName.containsKey(rmID)) {
							D_staffName.remove(rmID);
							D_staffPosition.remove(rmID);
							D_staffNumber.remove(rmID);
							System.out.println("Succesfully deleted!");
							displayDOC(D_staffName, D_staffPosition, D_staffNumber);
					
							//pick = scn.next();
						}
						else {
							System.err.println("=========================");
							System.err.println("Doctor ID cannot be found.");
							System.err.println("=========================");
						}	
					
				} else if(pick.equals("0")) {
					picking();
				}
				}
			}
			else if(pick.equals("2")) {												//nurses
				displayNRS(N_staffName, N_staffPosition, N_staffNumber);
				while(true) {
					pickAR();
					pick = scn.next();
					if (pick.equals("1")) {						//add
						scn.nextLine();
						System.out.print("Enter Last Name: ");
						lastName = scn.nextLine();
						System.out.print("Enter First Name: ");
						firstName = scn.nextLine();
						name = firstName + " " + lastName;
	
						System.out.print("Enter Position: ");
						position = scn.nextLine();
						System.out.print("Enter Contact Number: ");
						contactNum = scn.nextLine();
	
						nrsID = "RN_" + lastName.toUpperCase();
	
						N_staffName.put(nrsID, name);
						N_staffPosition.put(nrsID, position);
						N_staffNumber.put(nrsID, contactNum);
	
						System.out.println("Added Successfully!");
						displayNRS(N_staffName, N_staffPosition, N_staffNumber);
					}
				 else if(pick.equals("2")) {								//remove
					 scn.nextLine();
					 while(true) {
						System.out.print("Enter Nurse ID to delete [RN_LASTNAME]: ");
						rmID = scn.nextLine();
						if(N_staffName.containsKey(rmID)) {
							N_staffName.remove(rmID);
							N_staffPosition.remove(rmID);
							N_staffNumber.remove(rmID);
							System.out.println("Succesfully deleted!");
							editStaff();
						}
						else {
							System.err.println("=========================");
							System.err.println("Nurse ID cannot be found.");
							System.err.println("=========================");
						}	
					}
				} else if(pick.equals("0")) {
					picking();
				}
				}
			}
			else if (pick.equals("3")) {							//Maintenance
				displayMTN(M_staffName, M_staffPosition, M_staffNumber);
				while(true) {
					pickAR();
					pick = scn.next();
					if (pick.equals("1")) {						//add
						scn.nextLine();
						System.out.print("Enter Last Name: ");
						lastName = scn.nextLine();
						System.out.print("Enter First Name: ");
						firstName = scn.nextLine();
						name = firstName + " " + lastName;
	
						System.out.print("Enter Position: ");
						position = scn.nextLine();
						System.out.print("Enter Contact Number: ");
						contactNum = scn.nextLine();
	
						mtnID = "MT_" + lastName.toUpperCase();
	
						M_staffName.put(mtnID, name);
						M_staffPosition.put(mtnID, position);
						M_staffNumber.put(mtnID, contactNum);
	
						System.out.println("Added Successfully!");
						displayMTN(M_staffName, M_staffPosition, M_staffNumber);
					}
				 else if(pick.equals("2")) {								//remove
					 scn.nextLine();
					
						System.out.print("Enter Maintenance ID to delete [MT_LASTNAME]: ");
						rmID = scn.nextLine();
						if(M_staffName.containsKey(rmID)) {
							M_staffName.remove(rmID);
							M_staffPosition.remove(rmID);
							M_staffNumber.remove(rmID);
							System.out.println("Succesfully deleted!");
							displayMTN(M_staffName, M_staffPosition, M_staffNumber);
						}
						else {
							System.err.println("=========================");
							System.err.println("Maintenance ID cannot be found.");
							System.err.println("=========================");
							
					}
				} else if(pick.equals("0")) {
					picking();
				}
				}
			}
			else if (pick.equals("0")) {
				Admin admin = new Admin();
				admin.pickingAdmin();
				
		}// end of switch
	}// end of edit staff class
	public void displayDOC(Map<String,String> D_staffName, Map<String,String> D_staffPosition, Map<String,String> D_staffNumber){
		System.out.println("=============================================================");
		System.out.println("DOCTORS: " + D_staffName.size() + "\n");
		for (Map.Entry<String, String> entry : D_staffName.entrySet()) {
			String key = entry.getKey().toString();
			System.out.println(entry.getKey());
			System.out.println("Dr. " + D_staffName.get(key));
			System.out.println("Specialization: " + D_staffPosition.get(key));
			System.out.println("Contact #: " + D_staffNumber.get(key));
			System.out.println();
		}
	}
	public void displayNRS(Map<String,String> N_staffName, Map<String,String> N_staffPosition, Map<String,String> N_staffNumber){
		System.out.println("=============================================================");
		System.out.println("NURSES: " + N_staffName.size() + "\n");
		for (Map.Entry<String, String> entry : N_staffName.entrySet()) {
			String key = entry.getKey().toString();
			System.out.println(entry.getKey());
			System.out.println("Nurse " + N_staffName.get(key));
			System.out.println("Position: " + N_staffPosition.get(key));
			System.out.println("Contact #: " + N_staffNumber.get(key));
			System.out.println();
		}
	}
	public void displayMTN(Map<String,String> M_staffName, Map<String,String> M_staffPosition, Map<String,String> M_staffNumber){
		System.out.println("=============================================================");
		System.out.println("MAINTENANCE PERSONNEL: " + M_staffName.size() + "\n");
		for (Map.Entry<String, String> entry : M_staffName.entrySet()) {
			String key = entry.getKey().toString();
			System.out.println(entry.getKey());
			System.out.println("Maintenance " + M_staffName.get(key));
			System.out.println("Position: " + M_staffPosition.get(key));
			System.out.println("Contact #: " + M_staffNumber.get(key));
			System.out.println();
		}
	}
	public void pickAR() {
		System.out.println("[1] Add\n" + "[2] Remove\n" + "[0] Back");
	}
}// end of admin edit class.