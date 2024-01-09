package Package2;
import java.util.*;
public class PatientRecord {
	static Scanner scn = new Scanner(System.in);
	static Billing bill = new Billing();
	static Map<String,String> patientName= new TreeMap<>();
	static Map<String,String> patientAge = new TreeMap<>();
	static Map<String,String> patientAddress = new TreeMap<>();
	static Map<String,String> patientGender = new TreeMap<>();
	static Map<String,String> patientBirthday = new TreeMap<>();
	static Map<String,String> patientContact = new TreeMap<>();
	static Map<String,String> patientEmail= new TreeMap<>();
	static Map<String,String> patientNumber= new TreeMap<>();
	static Map<String, String> patientStatus = new TreeMap<>();
	static Map<String, String> patientDue = new TreeMap<>(bill.patientBal);
	String lastName;
	String firstName;
	String patientID;
	String age;
	String gender;
	String address;
	String email;
	String bday;
	String number;
	String name;
  
    public void addPatient() {
    	System.out.print("Enter Last name: ");
    	lastName = scn.nextLine();
    	System.out.print("Enter First name: ");
    	firstName = scn.nextLine();

    	name = firstName + " " + lastName;

    	patientID = "PT_" + lastName.toUpperCase();

    	System.out.print("Enter age: ");
    	age = scn.nextLine();
    	System.out.print("Enter Gender: ");
    	gender = scn.nextLine();
    	System.out.print("Enter Address: ");
    	address = scn.nextLine();
    	System.out.print("Enter Email: ");
    	email = scn.nextLine();
    	System.out.print("Enter Birthday: ");
    	bday = scn.nextLine();
    	System.out.print("Enter Number: ");
    	number = scn.nextLine();

    	patientName.put(patientID, name);
    	patientAge.put(patientID, age);
    	patientGender.put(patientID, gender);
    	patientAddress.put(patientID, address);
    	patientBirthday.put(patientID, bday);
    	patientEmail.put(patientID, email);
    	patientNumber.put(patientID, number);
    	patientStatus.put(patientID, "Admitted");
    	displayPT();

        System.out.println("Patient Added Successfully!");
    }
    public static void displayPT(){
    	System.out.println("============================================================================================================================================================================================================================================");
		System.out.println("\t\tELECTRONIC HEALTH RECORD\n");
    	for(Map.Entry<String, String> entry : patientName.entrySet()){
    		String key = entry.getKey();
    		System.out.println("\t " + entry.getKey());
    		System.out.println("\t Full Name: " + patientName.get(key));
    		System.out.println("\t Age: " + patientAge.get(key));
    		System.out.println("\t Gender: " + patientGender.get(key));
    		System.out.println("\t Address: " + patientAddress.get(key));
    		System.out.println("\t Date of Birthday: " + patientBirthday.get(key));
    		System.out.println("\t Email: " + patientEmail.get(key));
    		System.out.println("\t Number: " + patientNumber.get(key));
    		System.out.println("\t Status: " + patientStatus.get(key));    
    		if(patientDue.get(key).contains("YES")){
    			System.out.println("\n\t Remaining balance: " + patientDue.get(key));
    		}
    	}
    }
}