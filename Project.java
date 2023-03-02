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
        String ph_no = null;
        String weight = null;

        Scanner kvs=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("  ---------   WELCOME TO KVS HOSPITAL ------------");
        System.out.println("**************************************************");   
        System.out.println("Enter the 1 for Patient data");
        System.out.println("Enter the 2 for Appointment data");
        System.out.println("Enter the 3 for Doctor data");
        n= kvs.nextInt();

        //Scanner kvs=new Scanner(System.in);

        
        Patient p1=new Patient(name,gender,ph_no,weight);
        Doctor d1=new Doctor(name,designation,specilazation,ph_no);

        
        switch (n){
            case 1:{
                kvs.nextLine();
                System.out.println("Enter Patient Name");
                name = kvs.nextLine();
                System.out.println("Enter Patient Gender");
                gender = kvs.nextLine();
                System.out.println("Enter Patient Phone Number");
                ph_no = kvs.nextLine();
                System.out.println("Enter Patient Weight");
                weight = kvs.nextLine();

                Patient ob1=new Patient(name,gender,ph_no,weight);
                ob1.add();
                System.out.println(ob1);
                break;

            }
            case 3:{
                kvs.nextLine();
                System.out.println("Enter Doctor Name");
                name= kvs.nextLine();
                System.out.println("Enter Doctor designation");
                designation= kvs.nextLine();
                System.out.println("Enter Doctor specilization");
                String specialization = kvs.nextLine();
                System.out.println("Enter Doctor Phone Number");
                ph_no= kvs.nextLine();

                Doctor ob1=new Doctor(name,designation,specialization,ph_no);
                ob1.add();
                System.out.println(ob1);
                break;
            }
            default:{
                System.out.println("Wrong Value entered");
            }

            
        }
        

    }
}
