
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
						Doctor.write("Contact Number: " + contactNum);
						if (Doctor == null) {
							Doctor.close();
							if (doctor == null) {
								doctor.close();
							}
						}
					} else if (scn.equals("2")) {

					} else if (scn.equals("0")) {
						Admin admins = new Admin();
						admins.Admin();
					}
				}
			

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}// end of edit staff class

}// end of admin edit class.
