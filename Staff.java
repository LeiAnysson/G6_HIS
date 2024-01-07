
public class Staff {
	static String name;
	static String positions;

	public Staff(String name, String position) {
		this.name = name;
		this.positions = position;
	}

	public void displayInfo() {
		System.out.println("\t \t \t \t \t \t \t \t Name: " + name);
		System.out.println("\t \t \t \t \t \t \t \t Position: " + positions);
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
	}
}
