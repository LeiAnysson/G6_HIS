
package listofstaff;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class ListOfStaff {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    List <Staffs> name = new ArrayList<>();
  
    //Doctors
    name.add(new Doctor(" Dr. John Smith,"));
    name.add(new Doctor(" Dr. Mikko Speed "));
    name.add(new Doctor1(" Dr. James West"));
    name.add(new Doctor2(" Dr. Ray Mundo"));
    name.add(new Doctor1(" Dr. Shawn Monroe"));
    name.add(new Doctor2(" Dr. John Ellis"));  
    name.add(new Doctor(" Dr. Kenzo Robert"));  
    name.add(new Doctor1(" Dr. Yohan Perez"));
    name.add(new Doctor2(" Dr. Kael Velasquez"));
    name.add(new Doctor1(" Dr. Lash Rodriguez"));
    
    //Nurse
    name.add(new Nurse("Nurse. Janne Barloe"));
    name.add(new Nurse1("Nurse. Smith Caddle"));
    name.add(new Nurse2("Nurse. Amy Hart"));
    name.add(new Nurse("Nurse. Stella Katz"));
    name.add(new Nurse1("Nurse. Cassy laurier"));
    name.add(new Nurse2("Nurse. Kath Santiago"));
    name.add(new Nurse("Nurse. Cath Madden"));
    name.add(new Nurse1("Nurse. Mavis Elrod"));
    name.add(new Nurse2("Nurse. Fiora Hansley"));
    name.add(new Nurse("Nurse. May Monroe, "));
    
    //Maintenance
    name.add(new Maintenance("Maintenace, Simon Ajello "));
    name.add(new Maintenance1("Maintenace, Benjamin Barone "));
    name.add(new Maintenance2("Maintenace, Lucas Bernard"));
    name.add(new Maintenance1("Maintenace, Noah Santos"));
    name.add(new Maintenance2("Maintenace, Liam De Leon "));
    name.add(new Maintenance1("Maintenace, Oliver Cruz ")); 
    name.add(new Maintenance("Maintenace, William Aquino"));
    name.add(new Maintenance("Maintenace, Henry Chavez"));
    name.add(new Maintenance2("Maintenace, Mateo Abalos"));  
    name.add(new Maintenance("Maintenace, Ethan Gonzales"));
    
      System.out.println("---------------Staffs And Maintinance---------------");
    
      
      System.out.println("Please Choose a Category: ");
      System.out.println("[1] Doctor");
      System.out.println("[2] Nurse");
      System.out.println("[3] Maintenanace");
      
      Set<Integer> chosenCategories = new HashSet<>();

        while (chosenCategories.size() < 3) {
            int choice;
            while (true) {
       choice = input.nextInt();
            
          switch (choice){
        case 1:
            System.out.println("---------- DOCTORS ----------");
          for (Staffs staffs : name ) {
            if (staffs instanceof Doctor) {
                staffs.displayInfo();
                System.out.println();
            }
        }
          for (Staffs staffs : name ) {
            if (staffs instanceof Doctor1) {
                staffs.displayInfo();
                System.out.println();
                
            }
        }
          for (Staffs staffs : name ) {
            if (staffs instanceof Doctor2) {
                staffs.displayInfo();
                System.out.println();
           }
      }
          break;
          
        case 2:
                   System.out.println("---------- NURSE ----------");
            for (Staffs staffs : name ) {
            if (staffs instanceof Nurse) {
                staffs.displayInfo();
                System.out.println();
          
            }
       }
            for (Staffs staffs : name ) {
            if (staffs instanceof Nurse1) {
                staffs.displayInfo();
                System.out.println();
          
            }
       }
            for (Staffs staffs : name ) {
            if (staffs instanceof Nurse2) {
                staffs.displayInfo();
                System.out.println();
          
            }
        }
          break;
          
        case 3:
                   System.out.println("---------- MAINTENANCE ----------");
            for (Staffs staffs : name ) {
            if (staffs instanceof Maintenance) {
                staffs.displayInfo();
                System.out.println();
          
            }
        }
            for (Staffs staffs : name ) {
            if (staffs instanceof Maintenance1) {
                staffs.displayInfo();
                System.out.println();
            break;
            }
        }      
            
            for (Staffs staffs : name ) {
            if (staffs instanceof Maintenance2) {
                staffs.displayInfo();
                System.out.println();
            
            }
        }     
        default:
            System.out.println("------------------------------------");
            
        }
            if (chosenCategories.add(choice)) {
                    break;  
                } else {
                    System.out.println("Category already chosen. Please choose a different category.");
            
                }
      input.close();
          
           }
       }
    }
}
      
     
    
        
    

   
    
    