
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class adminEdit {
	static Scanner scn = new Scanner(System.in);

	public String name;
	public String contactNum;
	public String position;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void editStaff() {
		try {
			BufferedReader doctor = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter Doctor = new BufferedWriter(new FileWriter("try.txt"));
			BufferedReader nurse = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter Nurse = new BufferedWriter(new FileWriter("Nurse.txt"));
			PrintWriter print = new PrintWriter(System.out);
			adminEdit admin = new adminEdit();
			System.out
					.println("What staff you want to edit: \n" + "[1] Doctors\n" + "[2] Nurses\n" + "[3] Maintenance");
			String edit = scn.next();

			if (edit.equals("1")) {
				System.out.println("[1] Add\n" + "[2] Remove\n" + "[0] Back");

				if (scn.next().equals("1")) {
					System.out.print("Enter Name: ");
					String name = doctor.readLine();
					System.out.print("Enter Position: ");
					String position = doctor.readLine();
					System.out.print("Enter Contact Number: ");
					String contactNum = doctor.readLine();

					Doctor.write("Dr." + name + "\n");
					Doctor.write("Position: " + position + "\n");
					Doctor.write("Contact Number: " + contactNum + "\n");
					Doctor.newLine();
					Doctor.flush();
					String answer = "Y";
					while (answer.equals("Y")) {
						System.out.println("Do you want to add another? ");
						answer = scn.next().toUpperCase();
						System.out.print("Enter Name: ");
						name = doctor.readLine();
						System.out.print("Enter Position: ");
						position = doctor.readLine();
						System.out.print("Enter Contact Number: ");
						contactNum = doctor.readLine();

						Doctor.write("Dr." + name + "\n");
						Doctor.write("Position: " + position + "\n");
						Doctor.write("Contact Number: " + contactNum + "\n");

						Doctor.newLine();
						Doctor.flush();

					}
					while (answer == "N") {
						break;
					}

				}
			} else if (scn.next().equals("2")) {

				System.out.println("[1] Add\n" + "[2] Remove\n" + "[0] Back");
				if (scn.next().equals("1")) {
					System.out.println("Enter Name: ");
					name = nurse.readLine();
					System.out.println("Enter Position: ");
					position = nurse.readLine();
					System.out.println("Enter Contact Number: ");
					contactNum = nurse.readLine();

					Nurse.write("Nurse." + name + "\n");
					Nurse.write("Position: " + position + "\n");
					Nurse.write("Contact Number: " + contactNum + "\n");

					Nurse.newLine();
					Nurse.flush();

				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of edit staff class

}// end of admin edit class.
