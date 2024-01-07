import java.util.Scanner;

public class Admission {
	private static String name;
	private static String address;
	private static String gender;
	private static String birthday;
	private static String contact;
	private static String email;

	public static void setName(String n) {
		name = n;
	}

	public static String getName() {
		return "Fullname: " + name;
	}

	public static void setAddress(String add) {
		address = add;
	}

	public static String getAddress() {
		return "Address: " + address;
	}

	public static void setGender(String g) {
		gender = g;
	}

	public static String getGender() {
		return "Gender: " + gender;
	}

	public static void setBirthday(String bday) {
		birthday = bday;
	}

	public static String getBirthday() {
		return "Date of birth: " + birthday;
	}

	public static void setContact(String c) {
		contact = c;
	}

	public static String getContact() {
		return contact;
	}

	public static void setEmail(String e) {
		email = e;
	}

	public static String getEmail() {
		return "Email: " + email;
	}

	public static void admit() {
		Scanner scn = new Scanner(System.in);
		System.out.println(
				"============================================================================================================================================================================================================================================");
		System.out.println("\r\n"
				+ "\t \t \t \t \t██╗  ██╗ ██████╗ ███████╗██████╗ ██╗████████╗ █████╗ ██╗          █████╗ ██████╗ ███╗   ███╗██╗███████╗███████╗██╗ ██████╗ ███╗   ██╗    ███████╗ ██████╗ ██████╗ ███╗   ███╗\r\n"
				+ "\t \t \t \t \t██║  ██║██╔═══██╗██╔════╝██╔══██╗██║╚══██╔══╝██╔══██╗██║         ██╔══██╗██╔══██╗████╗ ████║██║██╔════╝██╔════╝██║██╔═══██╗████╗  ██║    ██╔════╝██╔═══██╗██╔══██╗████╗ ████║\r\n"
				+ "\t \t \t \t \t███████║██║   ██║███████╗██████╔╝██║   ██║   ███████║██║         ███████║██║  ██║██╔████╔██║██║███████╗███████╗██║██║   ██║██╔██╗ ██║    █████╗  ██║   ██║██████╔╝██╔████╔██║\r\n"
				+ "\t \t \t \t \t██╔══██║██║   ██║╚════██║██╔═══╝ ██║   ██║   ██╔══██║██║         ██╔══██║██║  ██║██║╚██╔╝██║██║╚════██║╚════██║██║██║   ██║██║╚██╗██║    ██╔══╝  ██║   ██║██╔══██╗██║╚██╔╝██║\r\n"
				+ "\t \t \t \t \t██║  ██║╚██████╔╝███████║██║     ██║   ██║   ██║  ██║███████╗    ██║  ██║██████╔╝██║ ╚═╝ ██║██║███████║███████║██║╚██████╔╝██║ ╚████║    ██║     ╚██████╔╝██║  ██║██║ ╚═╝ ██║\r\n"
				+ "\t \t \t \t \t╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝     ╚═╝   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═╝  ╚═╝╚═════╝ ╚═╝     ╚═╝╚═╝╚══════╝╚══════╝╚═╝ ╚═════╝ ╚═╝  ╚═══╝    ╚═╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝\r\n"
				+ "                                                                                                                                                                             \r\n"
				+ "");
		System.out.print("Full Name: ");
		setName(scn.nextLine());
		System.out.print("Address: ");
		setAddress(scn.nextLine());
		System.out.print("Gender: ");
		setGender(scn.nextLine());
		System.out.print("Date of Birth [DD/MM/YYYY]: ");
		setBirthday(scn.nextLine());
		System.out.print("Contact #: ");
		setContact(scn.nextLine());
		scn.nextLine();
		System.out.print("Email: ");
		setEmail(scn.nextLine());
		System.out.println(
				"============================================================================================================================================================================================================================================");
		displayInfo();
	}

	public static void displayInfo() {
		System.out.println(
				"============================================================================================================================================================================================================================================");
		System.out.println("\t\tELECTRONIC HEALTH RECORD\n");
		System.out.println("\t" + getName() + "\t\t" + getBirthday());
		System.out.println("\t" + getAddress());
		System.out.println();
		System.out.println("\tContact #: " + getContact() + "\t\t" + getGender());
		System.out.println("\t" + getEmail());
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t\t    MEDICAL VISITS");
		System.out.println("-------------------------------------------------------------");
		System.out.println("   Date\t\t\tDoctor" + "\t\t\tDiagnosis\n" + "1. ");

	}
}