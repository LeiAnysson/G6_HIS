package oopTp;
class Billing {
    private PatientInfo patientInfo;

    public Billing(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }

    public void displayBillingInfo() {
        System.out.println("Billing Information for Patient ID: " + patientInfo.getId());

      // kung paano lalabas billing 
       
    }
}
