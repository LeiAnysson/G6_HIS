package Package2;
import java.util.*;

public class Discharge extends PatientRecord {
	static Billing bill = new Billing();
	static String input;
	static Map<String, String> patientDue = new TreeMap<>(bill.patientBal);

	public static void discharge() {
		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  No. of Patients: " + patientName.size());
		displayRecords();
		scn.nextLine();
		System.out.println("==============================================================================");
		while(true) {
			System.out.print("t \t \t \t \t \t \t \t \t \t \t \t  Enter Patient ID to discharge patient[PT_LASTNAME]: ");
			input = scn.nextLine();
			if(patientName.containsKey(input)){
				System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  Patient has been discharged!");
			for (Map.Entry<String,String> entry : patientName.entrySet()){
				String key = entry.getKey().toString();
					patientStatus.replace(input, "Discharged");
					
				//String value = patientDue.get(key);
//					if(bill.patientBal.get(key).contains("YES")){
//						System.err.println("Cannot discharge patient due to balance.");
//					}else if(bill.patientBal.get(key).contains("NO")){
//						
//						displayRecords();
//					}
				}
				displayRecords();
				Redirect();
			}else{
					System.err.println("\t \t \t \t \t \t \t \t \t \t \t \t  =========================");
					System.err.println("\t \t \t \t \t \t \t \t \t \t \t \t  Patient ID cannot be found.");
					System.err.println("\t \t \t \t \t \t \t \t \t \t \t \t  =========================");
				}
		}
	}
	public static void Redirect() {
    	System.out.println("\n\t \t \t \t \t \t \t \t \t \t \t \t  [1] Homepage\n"
    			+ "\t \t \t \t \t \t \t \t \t \t \t \t  [2] Exit");
    	String input = scn.next();
    	if(input.equalsIgnoreCase("1")) {
    		Admin admin = new Admin();
    		admin.pickingAdmin();
    	}
    	else if(input.equalsIgnoreCase("2")) {
    		Main main = new Main();
    		main.thanks();
    	}
    }
}
