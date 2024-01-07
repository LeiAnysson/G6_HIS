package oopTp;
class PatientInfo {
    private static int patientIDs = 1;
    private String id;
    private String name;
    private int age;
    private String address;
    private String contactNumber;

    public PatientInfo(String name, int age, String address, String contactNumber) {
        this.id = generatePatientID();
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    private String generatePatientID() {
        return "P" + patientIDs++;
    }

    public String getId() {
        return id;
    }
}
