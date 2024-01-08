package Package2;
import java.util.*;
public class PatientRecord {
    private static Scanner sc = new Scanner(System.in);
    private static Map<String, PatientInfo> patientRecords = new HashMap<>();

    public static void main(String[] args) {
        PatientRecord patientRecord = new PatientRecord();
        patientRecord.addPatient();
        patientRecord.displayPatientRecords();
    }

    public void addPatient() {
        System.out.println("Enter Patient Information:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = sc.nextLine();

        PatientInfo patientInfo = new PatientInfo(name, age, address, contactNumber);
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

            System.out.println(""); // alignment or lines
        }
    }
}
