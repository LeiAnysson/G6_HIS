package Package2;
import java.util.*;
class Billing {
    private PatientInfo patientInfo;
    Scanner scn = new Scanner(System.in);
    static String input = "";
    static String sp = "";
    static String price = "";
    static int Orthopedic = 0;
    static int Pediatric = 0; 
    static int GeneralSurgery = 0; 
    static int Cardiologist = 0; 
    static int Dermatologist = 0; 
    static int Pulmonologist = 0; 
    static int Gastroenterologist = 0; 
    static int Neurologist = 0; 
    static int Psychiatrist = 0; 
    static int Rheumatologist = 0; 
    static int insurance = 0;
    static int labFEE = 0;
    static int matFEE = 0;
    static int meds = 0;
    static int treatment = 0;
    
    public Billing(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }

    public void displayBillingInfo() {
    	//System.out.println("Billing Information for Patient ID: " + patientInfo.getId());
    	System.out.println("Billing for:\n"
    			+ "[1] Check-up\n"
    			+ "[2] Treament");
    	input = scn.next(); 
    	if(input.equals("1")) {
    		System.out.println("Choose which doctor specialization has served you: ");
    		input = scn.next();
    		consultation(input);
    		displayCU();
    	}
    	else if(input.equals("1")) {
    		System.out.println("Choose which doctor specialization has served you: ");
    		input = scn.next();
    		treatment(input);
    		displayTMT();
    	}
    	
    }
    public void consultation(String input) {
    	switch(input) {
    	case "1":
    		Orthopedic = 700;
    		sp = "Orthopedic";
    		price = Integer.toString(Orthopedic); 
    		break;
    	case "2":
    		Pediatric = 1000;
    		sp = "Pediatric";
    		price = Integer.toString(Pediatric); 
    		break;
    	case "3":
    		GeneralSurgery = 700;
    		sp = "General Surgery";
    		price = Integer.toString(GeneralSurgery); 
    		break;
    	case "4":
    		Cardiologist = 1500;
    		sp = "Cardiologist";
    		price = Integer.toString(Cardiologist); 
    		break;
    	case "5":
    		Dermatologist = 1000;
    		sp = "Dermatologist";
    		price = Integer.toString(Dermatologist); 
    		break;
    	case "6":
    		Pulmonologist = 1000;
    		sp = "Pulmonologist";
    		price = Integer.toString(Pulmonologist); 
    		break;
    	case "7":
    		Gastroenterologist = 1000;
    		sp = "Gastroenterologist";
    		price = Integer.toString(Gastroenterologist); 
    		break;
    	case "8":
    		Neurologist = 1000;
    		sp = "Neurologist";
    		price = Integer.toString(Neurologist); 
    		break;
    	case "9":
    		Psychiatrist = 1500;
    		sp = "Psychiatrist";
    		price = Integer.toString(Psychiatrist); 
    		break;
    	case "10":
    		Rheumatologist = 500;
    		sp = "Rheumatologist";
    		price = Integer.toString(Rheumatologist); 
    		break;
    	}
    }
    public void treatment(String input) {
    	switch(input) {
    	case "1":
    		Orthopedic = 700;
    		sp = "700";
    		labFEE = 3560;
    	    matFEE = 400000;
    	    meds = 3800;
    	    treatment = 180000;
    		price = Integer.toString(labFEE + matFEE + meds + Orthopedic + treatment); 
    		break;
    	case "2":
    		Pediatric = 1000;
    		sp = "100";
    		labFEE = 5800;
    	    matFEE = 1800;
    	    meds = 1300;
    	    treatment = 1500;
    		price = Integer.toString(labFEE + matFEE + meds + Pediatric + treatment);
    		break;
    	case "3":
    		GeneralSurgery = 700;
    		sp = "700";
    		labFEE = 3540;
    	    matFEE = 90000;
    	    meds = 6000;
    	    treatment = 600000;
    		price = Integer.toString(labFEE + matFEE + meds + GeneralSurgery + treatment);
    		break;
    	case "4":
    		Cardiologist = 1500;
    		sp = "1500";
    		labFEE = 32000;
    	    matFEE = 51000;
    	    meds = 2000;
    	    treatment = 300000;
    		price = Integer.toString(labFEE + matFEE + meds + Cardiologist + treatment);
    		break;
    	case "5":
    		Dermatologist = 1000;
    		sp = "1000";
    		labFEE = 500;
    	    matFEE = 700;
    	    meds = 2000;
    	    treatment = 9000;
    		price = Integer.toString(labFEE + matFEE + meds + Dermatologist + treatment);
    		break;
    	case "6":
    		Pulmonologist = 1000;
    		sp = "1000";
    		labFEE = 8200;
    	    matFEE = 2000;
    	    meds = 2000;
    	    treatment = 6000;
    		price = Integer.toString(labFEE + matFEE + meds + Pulmonologist + treatment);
    		break;
    	case "7":
    		Gastroenterologist = 1000;
    		sp = "1000";
    		labFEE = 5000;
    	    matFEE = 900;
    	    meds = 900;
    	    treatment = 20000;
    		price = Integer.toString(labFEE + matFEE + meds + Gastroenterologist + treatment);
    		break;
    	case "8":
    		Neurologist = 1000;
    		sp = "1000";
    		labFEE = 900;
    	    matFEE = 2000;
    	    meds = 1500;
    	    treatment = 1200;
    		price = Integer.toString(labFEE + matFEE + meds + Neurologist + treatment);
    		break;
    	case "9":
    		Psychiatrist = 1500;
    		sp = "1500";
    		labFEE = 400;
    	    matFEE = 300;
    	    meds = 4200;
    	    treatment = 2500;
    		price = Integer.toString(labFEE + matFEE + meds + Psychiatrist + treatment);
    		break;
    	case "10":
    		Rheumatologist = 500;
    		sp = "500";
    		labFEE = 300;
    	    matFEE = 700;
    	    meds = 500;
    	    treatment = 1000;
    		price = Integer.toString(labFEE + matFEE + meds + Rheumatologist + treatment);
    		break;
    	}
    }
    public void displayCU() {
    	System.out.println("============================================================================================================================================================================================================================================");
    	System.out.println("CHECK-UP BILL");
    	System.out.println("Patient Name: " + patientInfo.getId());
    	System.out.println("\t" + sp + "\t" + price);
    	System.out.println("__________________________________________________________");
    	System.out.println("Patient Balance: \t \t" + price);	
    }
    public void displayTMT() {
    	System.out.println("============================================================================================================================================================================================================================================");
    	System.out.println("TREATMENT BILL");
       	System.out.println("Patient Name: " + patientInfo.getId());
    	System.out.println("\tLaboratory Fee \t" + labFEE + "\n"
    			+ "\tDoctor Fee \t" + sp + "\n"
    			+ "\tMaterials Fee \t" + matFEE + "\n"
    			+ "\tMedicine \t" + meds + "\n"
    			+ "\tTreatment \t" + treatment);
    	System.out.println("__________________________________________________________");
    	System.out.println("Patient Balance: \t \t" + price);	
    }
    public void insurance() {
    	//ask if may insurance then add sa total price
    }
    
}
