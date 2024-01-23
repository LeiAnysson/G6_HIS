package Package2;

public class Staff {
	String name;
	String positions;

	public Staff(String name, String position) {
		this.name = name;
		this.positions = position;
	}

	public void displayInfo() {
		System.out.println("												  Name: " + name);
		System.out.println("												  Position: " + positions);
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return positions;
	}
}

class Doctor extends Staff {

	public Doctor(String name, String position) {
		super(name, position);
	}
}

class Nurse extends Staff {

	public Nurse(String name, String position) {
		super(name, position);
	}
}

class Maintenance extends Staff {

	public Maintenance(String name, String position) {
		super(name, position);
	}}