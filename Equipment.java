package Package2;
import java.util.*;

public class Equipment {
	public void IMG(){
		System.out.println("												Diagnostic Laboratory & Imaging");
		System.out.println("												1. EKG/ECG machines\n"
				+ "												2. Hemetology Analyzer/ Cell counter\n"
				+ "												3. Biochemistry Analyzer\n"
				+ "												4. X-ray machine\n"
				+ "												5. Ultrasound");
		backButton();
	}
	public void ICU(){
		System.out.println("												Critical Care / ICU equipment");
		System.out.println("												1. Patient monitor\n"
				+ "												2. Defibrillators\n"
				+ "												3. Ventilator\n"
				+ "												4. Infusion Pump\n"
				+ "												5. Syringe Pump");
		backButton();
	}
	public void OT(){
		System.out.println("												Operating Theatre(OT)");
		System.out.println("												1. Surgical lights/ OT light\n"
				+ "												2. Surgical tables/ OT tables\n"
				+ "												3. Electrosurgical unit/ Cautery machine\n"
				+ "												4. Anethesia machine/ Boyle's apparatus\n"
				+ "												5. Suction apparatus/ Suction machine\n"
				+ "												6.Sterilizer/ Autoclave");
		backButton();
	}
	public void backButton() {
		Scanner scn = new Scanner(System.in);
		System.out.println("												[0] Back");
		System.out.print("												  ");
		String back = scn.next();
		if (back.equals("0")) {
			Admin admin = new Admin();
			admin.categories(4);
		}
	}
}