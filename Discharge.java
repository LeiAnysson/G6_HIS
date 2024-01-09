package Package2;
import java.util.*;

public class Discharge extends PatientRecord {
	static Billing bill = new Billing();
	static String input;
	PatientRecord pinfo = new PatientRecord();
	static Map<String, String> patientDue = new TreeMap<>(bill.patientBal);

	public static void discharge() {
		System.out.println("No. of Patients: " + patientName.size());
		displayRecords();
		System.out.println("==============================================================================");
		while(true) {
			System.out.print("Enter Patient ID to discharge patient[PT_LASTNAME]: ");
			input = scn.nextLine();
			if(patientName.containsKey(input)){
			for (Map.Entry<String,String> entry : patientName.entrySet()){
				String key = entry.getKey().toString();
				//String value = patientDue.get(key);
					if(patientDue.equals("YES")){
						System.err.println("Cannot discharge patient due to balance.");
					}else if(patientDue.equals("NO")){
						System.out.println("Patient has been discharged!");
						patientStatus.replace(key, "Discharged");
						displayPT();
					}
				}
			}else{
					System.err.println("=========================");
					System.err.println("Patient ID cannot be found.");
					System.err.println("=========================");
				}
		}
	}
}
