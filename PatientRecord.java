package Package2;
import java.util.*;
public class PatientRecord {
    private static Scanner sc = new Scanner(System.in);
    private static Map<String, PatientInfo> patientRecords = new HashMap<>();

  
    public void addPatient() {
    	System.out.print("Full Name: ");
    	PatientInfo.setName(sc.nextLine());
		System.out.print("Address: ");
		PatientInfo.setAddress(sc.nextLine());
		System.out.print("Gender: ");
		PatientInfo.setGender(sc.nextLine());
		System.out.print("Date of Birth [DD/MM/YYYY]: ");
		PatientInfo.setBirthday(sc.nextLine());
		System.out.print("Contact #: ");
		PatientInfo.setContact(sc.nextInt());
		sc.nextLine();
		System.out.print("Email: ");
		PatientInfo.setEmail(sc.nextLine());

        PatientInfo patientInfo = new PatientInfo();
        patientRecords.put(patientInfo.getId(), patientInfo);

        System.out.println("Patient Added Successfully!");
    }

    public void displayPatientRecords() {
        System.out.println("\nPatient Records:");
        for (Map.Entry<String, PatientInfo> entry : patientRecords.entrySet()) {
            System.out.println("Patient ID: " + entry.getKey());
            
            entry.getValue().displayPatientInfo();

            System.out.println("Admission Status: " + entry.getValue().getAdmissionStatus());
            if (!entry.getValue().isAdmitted()) {
                System.out.println("Admit the patient? (Y/N)");
                String admitChoice = sc.nextLine().toUpperCase();
                if (admitChoice.equals("Y")) {
                    entry.getValue().admitPatient();
                }
            }

            System.out.println("Discharge Status: " + entry.getValue().getDischargeStatus());
            if (entry.getValue().isAdmitted() && !entry.getValue().isDischarged()) {
                System.out.println("Discharge the patient? (Y/N)");
                String dischargeChoice = sc.nextLine().toUpperCase();
                if (dischargeChoice.equals("Y")) {
                    entry.getValue().dischargePatient();
                }
            }
        }
    }
}