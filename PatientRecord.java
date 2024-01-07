package oopTp;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

        System.out.println("");// anong message or disregard
    }

    public void displayPatientRecords() {
        System.out.println("\nPatient Records:");
        for (Map.Entry<String, PatientInfo> entry : patientRecords.entrySet()) {
            System.out.println("Patient ID: " + entry.getKey());
            
            Billing billing = new Billing(entry.getValue());
            billing.displayBillingInfo();

            System.out.println(""); // alignment or lines
        }
    }
}
