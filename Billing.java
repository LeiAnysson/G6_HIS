package Package2;
import java.util.*;
class Billing extends PatientRecord{
    Scanner scn = new Scanner(System.in);
    DoctorSchedule doc = new DoctorSchedule();
    static String input = "";
    static String sp = ""; 
    static float Orthopedic = 0;
    static float Pediatric = 0; 
    static float GeneralSurgery = 0; 
    static float Cardiologist = 0; 
    static float Dermatologist = 0; 
    static float Pulmonologist = 0; 
    static float Gastroenterologist = 0; 
    static float Neurologist = 0; 
    static float Psychiatrist = 0; 
    static float Rheumatologist = 0; 
    static float insurance = 0;
    static float rate = 0;
    static float price = 0;
    static float labFEE = 0;
    static float matFEE = 0;
    static float meds = 0;
    static float treatment = 0;
    static float newPrice;
    static String balance;
    static float dp;
    static String KEY;
    Map<String, String> patientBalance = new TreeMap<>();
    Map<String, String> patientBal = new TreeMap<>();
    Map<String, String> patientRemaining = new TreeMap<>();

    public void redirect() {
    	System.out.println("\n\t \t \t \t \t \t \t \t \t \t \t \t  [1] Homepage\n"
    			+ "\t \t \t \t \t \t \t \t \t \t \t \t  [2] Exit");
    	System.out.print("												  ");
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
    public void BillingRecords() {
		addDefault();
		displayBillingInfo();
	}
    public void displayBillingInfo() {
	    	System.out.print("\t \t \t \t \t \t \t \t \t \t \t \tEnter Patient ID to compute bill [PT_LASTNAME]: ");
	    	input = scn.nextLine();
	    	KEY = input;
	    		if(patientName.containsKey(input)) {
	    			System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tBilling for:\n"
	    					+ "\t \t \t \t \t \t \t \t \t \t \t \t[1] Check-up\n"
	    					+ "\t \t \t \t \t \t \t \t \t \t \t \t[2] Treament");
	    			System.out.print("												  ");
	    			input = scn.next(); 
	    			if(input.equals("1")) {
	    				doc.staffList.D_staffMap();
	    				doc.staffPosition = new TreeMap<>(doc.staffList.D_staffPosition);
	    				System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tChoose which doctor specialization has served you: ");
	    				displayList();
	    				System.out.print("												  ");
	    				input = scn.next();
	    				consultation(input);
	    				displayCU();
	    				redirect();
	    			}
	    			else if(input.equals("2")) {
	    				doc.staffList.D_staffMap();
	    				doc.staffPosition = new TreeMap<>(doc.staffList.D_staffPosition);
	    				System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tChoose which doctor specialization has served you: ");
	    				displayList();
	    				System.out.print("												  ");
	    				input = scn.next();
	    				treatment(input);
	    				insurance(price);
	    				displayTMT();
	    				MOP();
	    				redirect();
	    			}
				}
				else {
					System.err.println("\t \t \t \t \t \t \t \t \t \t \t \t  Patient ID cannot be found.");
					redirect();
				}
	    	}
    	//}
    public void consultation(String input) {
    	switch(input) {
    	case "1":
    		Pulmonologist = 1000;
    		sp = "Pulmonologist(Check-Up)";
    		price = Pulmonologist; 
    		break;
    	case "2":
    		Dermatologist = 1000;
    		sp = "Dermatologist(Check-Up)";
    		price = Dermatologist;
    		break;
    	case "3":
    		Cardiologist = 1500;
    		sp = "Cardiologist(Check-Up)";
    		price = Cardiologist; 
    		break;
    	case "4":
    		Neurologist = 1000;
    		sp = "Neurologist(Check-Up)";
    		price = Neurologist; 
    		break;
    	case "5":
    		Gastroenterologist = 1000;
    		sp = "Gastroenterologist(Check-Up)";
    		price = Gastroenterologist; 
    		break;
    	case "6":
    		Rheumatologist = 500;
    		sp = "Rheumatologist(Check-Up)";
    		price = Rheumatologist; 
    		break;
    	case "7":
    		Orthopedic = 700;
    		sp = "Orthopedic(Check-Up)";
    		price = Orthopedic;
    		break;
    	case "8":
    		GeneralSurgery = 700;
    		sp = "General Surgery(Check-Up)";
    		price = GeneralSurgery;
    		break;
    	case "9":
    		Psychiatrist = 1500;
    		sp = "Psychiatrist(Check-Up)";
    		price = Psychiatrist; 
    		break;
    	case "10":
    		Pediatric = 1000;
    		sp = "Pediatric(Check-Up)";
    		price = Pediatric; 
    		break;
    	}
    }
    public void treatment(String input) {
    	switch(input) {
    	case "1":
    		Pulmonologist = 1000;
    		sp = "1000";
    		labFEE = 8200;
    	    matFEE = 2000;
    	    meds = 2000;
    	    treatment = 6000;
    		price = labFEE + matFEE + meds + Pulmonologist + treatment;
    		break;
    	case "2":
    		Dermatologist = 1000;
    		sp = "1000";
    		labFEE = 500;
    	    matFEE = 700;
    	    meds = 2000;
    	    treatment = 9000;
    		price = labFEE + matFEE + meds + Dermatologist + treatment;	
    		break;
    	case "3":
    		Cardiologist = 1500;
    		sp = "1500";
    		labFEE = 32000;
    	    matFEE = 51000;
    	    meds = 2000;
    	    treatment = 300000;
    		price = labFEE + matFEE + meds + Cardiologist + treatment;
    		break;
    	case "4":
    		Neurologist = 1000;
    		sp = "1000";
    		labFEE = 900;
    	    matFEE = 2000;
    	    meds = 1500;
    	    treatment = 1200;
    		price = labFEE + matFEE + meds + Neurologist + treatment;
    		break;
    	case "5":
    		Gastroenterologist = 1000;
    		sp = "1000";
    		labFEE = 5000;
    	    matFEE = 900;
    	    meds = 900;
    	    treatment = 20000;
    		price = labFEE + matFEE + meds + Gastroenterologist + treatment;
    		break;
    	case "6":
    		Rheumatologist = 500;
    		sp = "500";
    		labFEE = 300;
    	    matFEE = 700;
    	    meds = 500;
    	    treatment = 1000;
    		price = labFEE + matFEE + meds + Rheumatologist + treatment;
    		break;
    	case "7":
    		Orthopedic = 700;
    		sp = "700";
    		labFEE = 3560;
    	    matFEE = 400000;
    	    meds = 3800;
    	    treatment = 180000;
    		price = (labFEE + matFEE + meds + Orthopedic + treatment) - insurance; 
    		break;
    	case "8":
    		GeneralSurgery = 700;
    		sp = "700";
    		labFEE = 3540;
    	    matFEE = 90000;
    	    meds = 6000;
    	    treatment = 600000;
    		price = labFEE + matFEE + meds + GeneralSurgery + treatment;
    		break;
    	case "9":
    		Psychiatrist = 1500;
    		sp = "1500";
    		labFEE = 400;
    	    matFEE = 300;
    	    meds = 4200;
    	    treatment = 2500;
    		price = labFEE + matFEE + meds + Psychiatrist + treatment;
    		break;
    	case "10":
    		Pediatric = 1000;
    		sp = "100";
    		labFEE = 5800;
    	    matFEE = 1800;
    	    meds = 1300;
    	    treatment = 1500;
    		price = labFEE + matFEE + meds + Pediatric + treatment;
    		break;
    	}
    }
    public void MOP(){
    	System.out.println("\n\t \t \t \t \t \t \t \t \t \t \t \tMode of Payment: \n"
    			+ "\t \t \t \t \t \t \t \t \t \t \t \t[1] Full Payment \n"
    			+ "\t \t \t \t \t \t \t \t \t \t \t \t[2] Downpayment");
    	System.out.print("												  ");
    	input = scn.next();

    	if(input.equals("1")){
    		displayTMT();
    		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  Please pay on the Hospital's on-site cashier to settle your balance.");
    		//balance = "0";
    		for (Map.Entry<String, String> entry : patientName.entrySet()){
    			String key = entry.getKey();
    			patientBalance.put(key, balance);
    			patientBal.put(key, "NO");
    		}
    	} else if(input.equals("2")){
    		System.out.print("\t \t \t \t \t \t \t \t \t \t \t \t  Required Downpayment: 10,000\n");
    		dp = 10000;
    		balance = Float.toString(newPrice - dp);
    		displayTMT();
    		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  	Downpayment: " + dp);
    		System.out.println("\t \t \t \t \t \t \t \t \t	____________________________________________________________________________________");
    		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t \tNew Total Balance: \t" + balance);
    		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tPlease pay on the Hospital's on-site cashier to settle your balance.");
	    	patientBalance.put(KEY, balance);
	    	patientBal.replace(KEY, "YES");
    	}	
    }

    public void displayCU() {
    	System.out.println("============================================================================================================================================================================================================================================");
    	System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tCHECK-UP BILL");
    	System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tPatient Name: " + patientName.get(KEY));
    	System.out.println("\n\t \t \t \t \t \t \t \t \t \t \t \t  " + sp + "\t \t" + price);
    	System.out.println("\t \t \t \t \t \t \t \t \t		____________________________________________________________________________________");
    	System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  Total Balance: \t \t \t" + price);	
		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tPlease pay on the Hospital's on-site cashier to settle your balance.");
    }
    public void displayTMT() {
    	System.out.println("============================================================================================================================================================================================================================================");
    	System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tTREATMENT BILL");
    	System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tPatient Name: " + patientName.get(KEY));
    	System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t \tLaboratory Fee \t \t" + labFEE + "\n"
    				+ "\t \t \t \t \t \t \t \t \t \t \t \t	Doctor Fee \t \t" + sp + "\n"
    				+ "\t \t \t \t \t \t \t \t \t \t \t \t	Materials Fee \t \t" + matFEE + "\n"
    				+ "\t \t \t \t \t \t \t \t \t \t \t \t	Medicine \t \t" + meds + "\n"
    				+ "\t \t \t \t \t \t \t \t \t \t \t \t \tTreatment \t \t" + treatment + "\n"
    				+ "\t \t \t \t \t \t \t \t \t \t \t \t	- Insurance \t \t" + insurance);
    	System.out.println("\t \t \t \t \t \t \t \t \t \t____________________________________________________________________________________");
    	System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t \tTotal Balance: \t \t" + newPrice);	
    }
    public void insurance(float price) {
    	System.out.println("============================================================================================================================================================================================================================================");
    	System.out.print("\t \t \t \t \t \t \t \t \t \t \t \tDo you have any patients benefits?[Y/N] ");
    	String input = scn.next();
    	if(input.equalsIgnoreCase("Y")){
    		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tWhich among the benefits do you currently have?\n"
    				+ "\t \t \t \t \t \t \t \t \t \t \t \t[1] PhilHealth\n"
    				+ "\t \t \t \t \t \t \t \t \t \t \t \t[2] SSS\n"
    				+ "\t \t \t \t \t \t \t \t \t \t \t \t[3] Pag-IBIG");
    		System.out.print("												  ");
    		input = scn.next();
    		switch (input) {
    		case "1":
    			rate = (float) 0.20;
    			insurance = rate * price;
    			newPrice = price - insurance;
    			System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  Insurance: \t" + insurance);
    			break;
    		case "2":
    			rate = (float) 0.20;
    			insurance = rate * price;
    			newPrice = price - insurance;
    			System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  Insurance: \t" + insurance);
    			break;
    		case "3":
    			rate = (float) 0.10;
    			insurance = rate * price;
    			newPrice = price - insurance;
    			System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tInsurance: \t" + insurance);
    			break;
    		}
    	}else if(input.equalsIgnoreCase("N")) {
    		rate = 0;
    		insurance = rate;
    		newPrice = price;
    		System.out.println("\t \t \t \t \t \t \t \t \t \t \t \tInsurance: \t" + newPrice);
    	}
    }
    public void displayList() {
    	for(int i = 1; i <= 1; i++) {
			for (Map.Entry<String, String> entry : doc.staffPosition.entrySet()) {
    			String key = entry.getKey();
				System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t[" + i + "] " + doc.staffPosition.get(key));
				i++;
			}
		}
    }
    
}