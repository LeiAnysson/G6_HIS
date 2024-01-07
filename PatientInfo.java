package oopTp;
 private static int patientIDs = 1;

    private String id;
    private String name;
    private int age;
    private String address;
    private String contactNumber;
    private boolean admitted;
    private boolean discharged;

    public PatientInfo(String name, int age, String address, String contactNumber) {
        this.id = patientID();
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.admitted = false;
        this.discharged = false;
    }

    private String patientID() {
        return "P" + patientIDs++;
    }

    public String getId() {
        return id;
    }

    public boolean isAdmitted() {
        return admitted;
    }

    public boolean isDischarged() {
        return discharged;
    }

    public void admitPatient() {
        admitted = true;
        System.out.println("Patient Was Admitted Successfully!");
    }

    public void dischargePatient() {
        discharged = true;
        System.out.println("Patient Was Discharged Successfully!");
    }

    public String getAdmissionStatus() {
        return admitted ? "Admitted" : "Not Admitted";
    }

    public String getDischargeStatus() {
        return discharged ? "Discharged" : "Not Discharged";
    }

    public void displayPatientInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }
}
