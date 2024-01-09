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
	static Map<String,String> patientStatus = new TreeMap<>();
	String input;
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
	
	public void records() {
		addDefault();
		displayRecords();
	}
    public void addPatient() {
    	System.out.print("Enter Last name: ");
    	lastName = scn.nextLine();
    	System.out.print("Enter First name: ");
    	firstName = scn.nextLine();

    	name = firstName + " " + lastName;

    	patientID = "PT_" + lastName.toUpperCase();

    	System.out.print("Enter age: ");
    	age = scn.nextLine();
    	System.out.print("Enter Gender [F/M]: ");
    	gender = scn.nextLine().toUpperCase();
    	System.out.print("Enter Address: ");
    	address = scn.nextLine();
    	System.out.print("Enter Email Address: ");
    	email = scn.nextLine();
    	System.out.print("Enter Birthday[DDMMYY]: ");
    	bday = scn.nextLine();
    	System.out.print("Enter Contact Number: ");
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
    	redirect();
    }
    public static void displayPT(){
    	System.out.println("============================================================================================================================================================================================================================================");
		System.out.println("\t\tELECTRONIC HEALTH RECORD\n");
    	for(Map.Entry<String, String> entry : patientName.entrySet()){
    		String key = entry.getKey();
    		System.out.println();
    		System.out.println("\t Full Name: " + patientName.get(key) + "\t \t Patient ID: " + entry.getKey() + "\n");
    		System.out.println("\t Age: " + patientAge.get(key) + " \t \t \t Gender: " + patientGender.get(key));
    		System.out.println("\t Address: " + patientAddress.get(key) + " \t \t Date of Birth: " + patientBirthday.get(key) + "\n");
    		System.out.println("\t Email Address: " + patientEmail.get(key));
    		System.out.println("\t ContactNumber: " + patientNumber.get(key) + "\n");
       		System.out.println("\t Status: " + patientStatus.get(key));  
    		System.out.println("   _________________________________________________________");
    		System.out.println("\t Patient Admitted. Thank you!");
    	}
    }
    public static void displayRecords() {
    	for(Map.Entry<String, String> entry : patientName.entrySet()){
    		String key = entry.getKey();
    		System.out.println("\nPatient ID: " + entry.getKey());
    		System.out.println("Full Name: " + patientName.get(key));
    		System.out.println("Age: " + patientAge.get(key));
    		System.out.println("Gender: " + patientGender.get(key));
    		System.out.println("Address: " + patientAddress.get(key));
    		System.out.println("Date of Birth: " + patientBirthday.get(key));
    		System.out.println("Email Address: " + patientEmail.get(key));
    		System.out.println("Contact Number: " + patientNumber.get(key));
       		System.out.println("Status: " + patientStatus.get(key)); 
       		remainingBal();
       		System.out.println("Remaining balance: " + bill.patientBal.get(key));
    	}
    }
    public static void remainingBal() {
    	for (Map.Entry<String, String> entry : patientName.entrySet()){
    		String key = entry.getKey();
			if(bill.patientBal.get(key).contains("YES")){
				bill.patientRemaining.put(key, bill.patientBalance.get(key));		
	    	}
			else if(bill.patientBal.get(key).contains("NO")){
				bill.patientRemaining.put(key, "NONE");
    		}
    	}
    }
    public static void addDefault() {
		patientName.put("PT_MARQUEZ", "Lei Anysson Marquez");
		patientName.put("PT_VILLA", "Adrianne Villa");
		patientName.put("PT_GONZALES", "Prinz Aliester Gonzales");
		patientName.put("PT_BULAN", "Cydric James Bulan");
		
    	patientAge.put("PT_MARQUEZ", "19");
    	patientAge.put("PT_VILLA", "20");
    	patientAge.put("PT_GONZALES", "19");
    	patientAge.put("PT_BULAN", "18");
    	
    	patientGender.put("PT_MARQUEZ", "F");
    	patientGender.put("PT_VILLA", "M");
    	patientGender.put("PT_GONZALES", "M");
    	patientGender.put("PT_BULAN", "M");
    	
    	patientAddress.put("PT_MARQUEZ", "Bocaue, Bulacan");
    	patientAddress.put("PT_VILLA", "Pandi, Bulacan");
    	patientAddress.put("PT_GONZALES", "Bulakan, Bulacan");
    	patientAddress.put("PT_BULAN", "Bulakan, Bulacan");
    	
    	patientBirthday.put("PT_MARQUEZ", "060406");
    	patientBirthday.put("PT_VILLA", "270903");
    	patientBirthday.put("PT_GONZALES", "");
    	patientBirthday.put("PT_BULAN", "012605");
    	
    	patientEmail.put("PT_MARQUEZ", "anyssonlei@gmail.com");
    	patientEmail.put("PT_VILLA", "adriannevilla23@gmail.com");
    	patientEmail.put("PT_GONZALES", "prinzgonzales10@gmail.com");
    	patientEmail.put("PT_BULAN", "cedricjamesbulan@gmail.com");
    	
    	patientNumber.put("PT_MARQUEZ", "0921-5912-572");
    	patientNumber.put("PT_VILLA", "0951-6246-823");
    	patientNumber.put("PT_GONZALES", "0966-6554-864");
    	patientNumber.put("PT_BULAN", "0998-4140-107");
    	
    	patientStatus.put("PT_MARQUEZ", "Admitted");
    	patientStatus.put("PT_VILLA", "Admitted");
    	patientStatus.put("PT_GONZALES", "Admitted");
    	patientStatus.put("PT_BULAN", "Admitted");
    	
    	bill.patientBal.put("PT_MARQUEZ", "NO");
    	bill.patientBal.put("PT_VILLA", "NO");
    	bill.patientBal.put("PT_GONZALES", "NO");
    	bill.patientBal.put("PT_BULAN", "NO");
	}
    public void redirect() {
    	System.out.println("\n[1] Homepage\n"
    			+ "[2] Exit");
    	input = scn.next();
    	if(input.equalsIgnoreCase("1")) {
    		Patient patient = new Patient();
    		patient.Patient();
    	}
    	else if(input.equalsIgnoreCase("2")) {
    		Main main = new Main();
    		main.thanks();
    	}
    }
}