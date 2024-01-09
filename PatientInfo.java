

public class PatientInfo{
	private static int patientIDs = 1;
	private String id;
	private static String name;
	private static int age;
	private static String address;
	private static String gender;
	private static String birthday;
	private static int contact;
	private static String email;
	private boolean admitted;
	private boolean discharged;

	public static void setName(String n) {
		name = n;
	}

	public static String getName() {
		return "Fullname: " + name;
	}
	
	public static void setAge(int a) {
		age = a;
	}
	public static void setAddress(String add) {
		address = add;
	}

	public static String getAddress() {
		return "Address: " + address;
	}
	public static void setGender(String g) {
		gender = g;
	}

	public static String getGender() {
		return "Gender: " + gender;
	}


	public static void setBirthday(String bday) {
		birthday = bday;
	}

	public static String getBirthday() {
		return "Date of birth: " + birthday;
	}

	public static void setContact(int c) {
		contact = c;
	}

	public static int getContact() {
		return contact;
	}

	public static void setEmail(String e) {
		email = e;
	}

	public static String getEmail() {
		return "Email: " + email;
	}

	public void PatientInfo() {
		this.id = patientID();
		this.name = name;
		this.age = age;
		this.address = address;
		this.contact = contact;
		this.admitted = false;
		this.discharged = false;
	}

	public String patientID() {
		return "P" + patientIDs++;
	}

	public String getId() {
		return id;
	}

	public boolean isAdmitted() {
		return admitted;
	}

	public boolean isDischarged() {
		return discharged;
	}

	public void admitPatient() {
		admitted = true;
		System.out.println("Patient Was Admitted Successfully!");
	}

	public void dischargePatient() {
		discharged = true;
		System.out.println("Patient Was Discharged Successfully!");
	}

	public String getAdmissionStatus() {
		return admitted ? "Admitted" : "Not Admitted";
	}

	public String getDischargeStatus() {
		return discharged ? "Discharged" : "Not Discharged";
	}

	public void displayPatientInfo() {
		System.out.println("============================================================================================================================================================================================================================================");
		System.out.println("\t\tELECTRONIC HEALTH RECORD\n");
		System.out.println("\t" + getName() + "\t\t" + getBirthday());
		System.out.println("\t" + getAddress() + "\t\t" +getGender()); 
		System.out.println();
		System.out.println("\tContact #: " + getContact() + "\t\t" + getBirthday());
		System.out.println("\t" + getEmail());
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t\t    MEDICAL VISITS");
		System.out.println("-------------------------------------------------------------");
		System.out.println("   Date\t\t\tDoctor" + "\t\t\tDiagnosis\n" + "1. ");
		
		
		

	}
}