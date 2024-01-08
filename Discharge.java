package Package2;
import java.util.*;

public class Discharge {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------Hospital Discharge Form-----------");
		System.out.print("FirstName: ");
		String fname = input.nextLine();
		System.out.print("LastName: ");
		String lname = input.nextLine();
		System.out.print("Your Phone Number: ");
		int pn = input.nextInt();
		System.out.print("Facility Name:  ");
		String fcn = input.next();
		System.out.print("");

		System.out.println("Attending Physician");
		System.out.print("FirstName: ");
		String fnm = input.next();
		System.out.print("LastName: ");
		String lnm = input.next();

		System.out.print("You where diagnosed with: ");
		String dn = input.next();
		System.out.print("You where treated with: ");
		String td = input.next();
		System.out.print("Your test were (include result):");
		String ts = input.next();
		System.out.println("");

		System.out.println("----------Your Discharge Info----------");
                System.out.println("Name: " + fname + "" + lname);
                System.out.println("Phone Number: " + "" + pn );
                System.out.println("Facility Name: " + fcn);
                System.out.println("");
                System.out.println("----------Attending Physician----------");
                System.out.println("Name: " + fnm + "" + lnm);
                System.out.println("");
                System.out.println("At admission you presented with the following symptomps: " + st );
                System.out.println("You where diagnosed with : " + dn);
                System.out.println("You where treated with:  " + td);
                System.out.println("Your test were (include result): " + ts);
	}       
}
