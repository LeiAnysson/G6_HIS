
package listofstaff;

public class Staffs {
        String name;
        String positions;
        
        public Staffs (String name, String position){
            this.name = name;
            this.positions = position;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + positions );
    }
}
   class Doctor extends Staffs {
 
    public Doctor(String name) {
            super(name, "Surgeon");
        }
    }
     class Doctor1 extends Staffs {
 
    public Doctor1(String name) {
            super(name, "Psychiatrist");
        }
    }
      class Doctor2 extends Staffs {
    public Doctor2(String name) {
            super(name, "Neorologist");
        }
    }
   

    class Nurse extends Staffs {
 
    public Nurse(String name) {
            super(name, "Pediatric");
        }
    }
      class Nurse1 extends Staffs {
 
    public Nurse1(String name) {
            super(name, "Psychiatric");
        }
    }
      class Nurse2 extends Staffs {
 
    public Nurse2(String name) {
            super(name, "Travel Nurse");
        }
    }

    
   class Maintenance extends Staffs {
  
    public Maintenance(String name) {
            super(name, "Janitor");
        }
    }
    class Maintenance1 extends Staffs {
  
    public Maintenance1(String name) {
            super(name, "Electrician");
        }
    }
     class Maintenance2 extends Staffs {
  
    public Maintenance2(String name) {
            super(name, "Paramedic");
        }
    }


   