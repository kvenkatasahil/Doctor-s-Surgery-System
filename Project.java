import java.time.LocalDate;
import java.util.*;
public class Project {


    public static void main(String[] args)
    {
        ArrayList D1= new ArrayList ();
        ArrayList  P1= new ArrayList();

        int n;
        String name = null;
        String designation = null;
        String specilazation = null;
        String gender = null;
        String age=null;
        String ph_no = null;
        String  weight = null;
        String Doc_relatedto;

        Scanner kvs=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("  ---------   WELCOME TO KVS HOSPITAL ------------");
        System.out.println("**************************************************");   
        System.out.println("Enter the 1 for Patient data");
        System.out.println("Enter the 2 for Appointment data");
        System.out.println("Enter the 3 for Doctor data");
        n= kvs.nextInt();

        //Scanner kvs=new Scanner(System.in);

        
        //Patient p1=new Patient(name,gender,age,ph_no,weight,Doc_relatedto);
       // Doctor d1=new Doctor(name,designation,specilazation,ph_no);

        
        switch (n){
            case 1: {
                int control_input = 0;
                Patient ob1 = new Patient();
                while (control_input != 1) {
                    kvs.nextLine();
                    System.out.println("Enter Patient Name");
                    name = kvs.nextLine();
                    System.out.println("Enter Patient Gender");
                    gender = kvs.nextLine();
                    System.out.println("Enter Patient Age");
                    age = kvs.nextLine();
                    System.out.println("Enter Patient Phone Number");
                    ph_no = kvs.nextLine();
                    System.out.println("Enter Patient Weight");
                    weight = kvs.nextLine();
                    System.out.println("Enter Doctor related to patient");
                    Doc_relatedto = kvs.nextLine();
                    LocalDate dateofjoin=LocalDate.now();

                    ob1.add(name,gender,age, ph_no, weight, Doc_relatedto,dateofjoin);
                    System.out.println(ob1);
                    System.out.println("Do you have  any further registrations : ");
                    System.out.println("Enter 0 to add patient");
                    System.out.println("Enter 1 not to add the patient");
                    control_input = kvs.nextInt();
                }
                ob1.Write();
                    break;
                }


            case 3:{
                int control_input = 0;
                Doctor ob1 = new Doctor();
                while (control_input != 1) {
                    kvs.nextLine();
                    System.out.println("Enter Doctor Name");
                    name = kvs.nextLine();
                    System.out.println("Enter Doctor designation");
                    designation = kvs.nextLine();
                    System.out.println("Enter Doctor specilization");
                    String specialization = kvs.nextLine();
                    System.out.println("Enter Doctor Phone Number");
                    ph_no = kvs.nextLine();
                    LocalDate dateofjoin=LocalDate.now();


                    ob1.add(name,designation,specialization,ph_no,dateofjoin);


                    System.out.println("Enter 0 for add another doctor");
                    System.out.println("Enter 1 to complete");
                    control_input = kvs.nextInt();
                }
                ob1.Write();
                break;
            }
            default:{
                System.out.println("Wrong Value entered");
            }

            
        }
        

    }
}
