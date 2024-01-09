package Package2;
import java.util.*;

public class Discharge extends PatientRecord {
	static Billing bill = new Billing();
	static String input;
	public static void discharge() {
		while(true) {
			System.out.print("Enter Patient ID to discharge patient[PT_LASTNAME]: ");
			input = scn.nextLine();
			for (Map.Entry<String,String> entry : patientName.entrySet()){
				String key = entry.getKey().toString();
				if(patientName.containsKey(input)){
					if(bill.patientBal.get(key).contains("YES")){
						System.err.println("Cannot discharge patient due to balance.");
					}else if(bill.patientBal.get(key).contains("NO")){
						System.out.println("Patient has been discharged!");
						patientStatus.replace(key, "Discharged");
						displayPT();
					}
				}
				else{
					System.err.println("Patient ID cannot be found");
				}
			}
		}
	}
}
