import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class Project {


    public static void main(String[] args) throws IOException {
        ArrayList  D1= new ArrayList ();
        ArrayList  P1= new ArrayList();
        ArrayList  A1 = new ArrayList();

        int n;
        String name = null;
        String designation = null;
        String specilazation = null;
        String gender = null;
        String age=null;
        String ph_no = null;
        String  weight = null;
        String Doc_relatedto=null;
        String Patient_name=null;
        String Doctor_name=null;
        String noofconsult=null;
        String Appointment_no=null;
        String Diseases=null;


        Scanner kvs=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("  ---------   WELCOME TO KVS HOSPITAL ------------");
        System.out.println("**************************************************");   
        System.out.println("Enter the 1 to add Patient data");
        System.out.println("Enter the 2 to Book Appointment ");
        System.out.println("Enter the 3 to add Doctor data");
        System.out.println("Enter the 4 for Patient data");
        System.out.println("Enter the 5 for Doctor data");
        System.out.println("Enter the 6 for Appointment data");
        System.out.println("Enter the 7 to check the Patient");
        System.out.println("Enter the 8 to check the Doctor");
        System.out.println("Enter the 9 to check the Appointment");
        System.out.println("Enter the 10 when patient came for another time");
        System.out.println("Enter the 11 to check the treatment for the patient");

        n= kvs.nextInt();

        switch (n){
            case 1: {
                ReadPatient.read();
                int control_input = 0;
                Patient ob1 = new Patient();
                int Patientidt=ReadPatient.Patients.size()-8;
                String Patientidl=(String)ReadPatient.Patients.get(Patientidt);
                int Patientid=Integer.parseInt(Patientidl);
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

                    Patientid+=1;
                    ob1.add(name,gender,age, ph_no, weight, Doc_relatedto,dateofjoin,Patientid);
                    System.out.println("Do you have  any further registrations : ");
                    System.out.println("Enter 0 for add another patient");
                    System.out.println("Enter 1 to complete");
                    control_input = kvs.nextInt();
                }
                ob1.Write();
                    break;
                }
            case 2:{
                ReadAppointment.read();
                int control_input = 0;
                Appointment ob1= new Appointment();
                int Appointmentidt=ReadAppointment.Appointments.size()-6;
                String Appointmentidl=(String)ReadAppointment.Appointments.get(Appointmentidt);
                int Appointmentid=Integer.parseInt(Appointmentidl);
                while (control_input!=1){
                    kvs.nextLine();
                    System.out.println("Enter Patient Name");
                    Patient_name = kvs.nextLine();
                    System.out.println("Enter Doctor Name");
                    Doctor_name = kvs.nextLine();
                    System.out.println("Enter the Disease");
                    Diseases= kvs.nextLine();
                    noofconsult="1";
                    //Appointment_no="1258463";
                    LocalTime appoint_time= LocalTime.now();
                    Appointmentid+=1;
                    ob1.add(Patient_name,Doctor_name,noofconsult, Diseases,appoint_time,Appointmentid);
                    System.out.println("Do you have  any further registrations : ");
                    System.out.println("Enter 0 for add another patient");
                    System.out.println("Enter 1 to complete");
                    control_input = kvs.nextInt();
                }
                ob1.Write();
                break;
            }

            case 3:{
                ReadDoctor.read();
                int control_input = 0;
                Doctor ob1 = new Doctor();
                int Doctoridt=ReadDoctor.Doctors.size()-6;
                String Doctoridl=(String)ReadDoctor.Doctors.get(Doctoridt);
                int Doctorid=Integer.parseInt(Doctoridl);
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

                    Doctorid+=1;
                    ob1.add(name,designation,specialization,ph_no,dateofjoin,Doctorid);
                    System.out.println("Enter 0 for add another doctor");
                    System.out.println("Enter 1 to complete");
                    control_input = kvs.nextInt();
                }
                ob1.Write();
                break;
            }
            case 4:
            {
                ReadPatient.read();
                int x=ReadPatient.Patients.size();
                for(int i=0;i<x;i+=8)
                {
                    System.out.println("Patient Id: "+ReadPatient.Patients.get(i));
                    System.out.println("Patient Name: "+ReadPatient.Patients.get(i+1));
                    System.out.println("Patient Gender: "+ReadPatient.Patients.get(i+2));
                    System.out.println("Patient Age: "+ReadPatient.Patients.get(i+3));
                    System.out.println("Patient Phone Number: "+ReadPatient.Patients.get(i+4));
                    System.out.println("Patient Weight: "+ReadPatient.Patients.get(i+5));
                    System.out.println("Patient's Doctor: "+ReadPatient.Patients.get(i+6));
                    System.out.println("Patient's Admitted date: "+ReadPatient.Patients.get(i+7));
                    System.out.println("----------------------------------------------------------");
                }
                break;
            }
            case 5:
            {
                ReadDoctor.read();
                int x=ReadDoctor.Doctors.size();
                for(int i=0;i<x;i+=6)
                {
                    System.out.println("Doctor Id: "+ReadDoctor.Doctors.get(i));
                    System.out.println("Doctor Name: "+ReadDoctor.Doctors.get(i+1));
                    System.out.println("Doctor Designation: "+ReadDoctor.Doctors.get(i+2));
                    System.out.println("Doctor Specialization: "+ReadDoctor.Doctors.get(i+3));
                    System.out.println("Doctor Phone Number: "+ReadDoctor.Doctors.get(i+4));
                    System.out.println("Doctor Joined Date: "+ReadDoctor.Doctors.get(i+5));
                    System.out.println("----------------------------------------------------------");

                }
                break;
            }
            case 6:
            {
                ReadAppointment.read();
                int x=ReadAppointment.Appointments.size();
                for(int i=0;i<x;i+=6)
                {
                    System.out.println("Appointment No. :"+ReadAppointment.Appointments.get(i));
                    System.out.println("Patient Name: "+ReadAppointment.Appointments.get(i+1));
                    System.out.println("Doctor Name: "+ReadAppointment.Appointments.get(i+2));
                    System.out.println("No of Consultations: "+ReadAppointment.Appointments.get(i+3));
                    //System.out.println("Appointment Number: "+ReadAppointment.Appointments.get(i+4));
                    System.out.println("Disease: "+ReadAppointment.Appointments.get(i+4));
                    System.out.println("Appointment time: "+ReadAppointment.Appointments.get(i+5));
                    System.out.println("----------------------------------------------------------");
                }
                break;
            }
            case 7: {
                ReadPatient.read();
                System.out.println("Enter Patient Id to check");
                String id = kvs.next();
                for (int i = 0; i < ReadPatient.Patients.size(); i += 8) {
                    if (ReadPatient.Patients.get(i).equals(id)==true)
                    {
                        System.out.println("Patient Id: " + ReadPatient.Patients.get(i));
                        System.out.println("Patient Name: " + ReadPatient.Patients.get(i + 1));
                        System.out.println("Patient Gender: " + ReadPatient.Patients.get(i + 2));
                        System.out.println("Patient Age: " + ReadPatient.Patients.get(i + 3));
                        System.out.println("Patient Phone Number: " + ReadPatient.Patients.get(i + 4));
                        System.out.println("Patient Weight: " + ReadPatient.Patients.get(i + 5));
                        System.out.println("Patient's Doctor: " + ReadPatient.Patients.get(i + 6));
                        System.out.println("Patient's Admitted date: " + ReadPatient.Patients.get(i + 7));
                        System.out.println("----------------------------------------------------------");
                        break;
                    }
                    else {

                        if(i>ReadPatient.Patients.size()-9)
                    {
                        System.out.println("Patient not found");
                        break;
                    }

                    }

                }
                break;
            }
            case 8: {
                ReadDoctor.read();
                System.out.println("Enter Doctor Id to check");
                String id = kvs.next();
                for (int i = 0; i < ReadDoctor.Doctors.size(); i += 6){
                    if (ReadAppointment.Appointments.get(i).equals(id)) {
                        System.out.println("Doctor Id: " + ReadDoctor.Doctors.get(i));
                        System.out.println("Doctor Name: " + ReadDoctor.Doctors.get(i + 1));
                        System.out.println("Doctor Designation: " + ReadDoctor.Doctors.get(i + 2));
                        System.out.println("Doctor Specialization: " + ReadDoctor.Doctors.get(i + 3));
                        System.out.println("Doctor Phone Number: " + ReadDoctor.Doctors.get(i + 4));
                        System.out.println("Doctor Joined Date: " + ReadDoctor.Doctors.get(i + 5));
                        System.out.println("----------------------------------------------------------");
                        break;
                    }
                    else {

                        if(i>ReadDoctor.Doctors.size()-7)
                        {
                            System.out.println("Doctor not found");
                            break;
                        }
                    }
                }
                break;
            }
            case 9:{
                ReadAppointment.read();
                System.out.println("Enter Appointment Number to check the appointment");
                String id = kvs.next();
                for (int i = 0; i < ReadAppointment.Appointments.size(); i += 6) {
                    if (ReadAppointment.Appointments.get(i).equals(id)) {
                        System.out.println("Appointment No. :" + ReadAppointment.Appointments.get(i));
                        System.out.println("Patient Name: " + ReadAppointment.Appointments.get(i + 1));
                        System.out.println("Doctor Name: " + ReadAppointment.Appointments.get(i + 2));
                        System.out.println("No of Consultations: " + ReadAppointment.Appointments.get(i + 3));
                        //System.out.println("Appointment Number: "+ReadAppointment.Appointments.get(i+4));
                        System.out.println("Disease: " + ReadAppointment.Appointments.get(i + 4));
                        System.out.println("Appointment time: " + ReadAppointment.Appointments.get(i + 5));
                        System.out.println("----------------------------------------------------------");
                        break;
                    }
                    else {
                            if(i>ReadAppointment.Appointments.size()-7)
                            {
                                System.out.println("Appointment not found");
                                break;
                            }

                    }
                }
                break;
            }
            case 10:
            {
                ReadAppointment.read();
                System.out.println("Enter you appointment id");
                String id=kvs.next();
                Delete_Appointment.change(id);
                break;
            }
            case 11:{
                ReadAppointment.read();
                System.out.println("Enter Appointment Number to check the Treatment");
                String id = kvs.next();
                for (int i = 0; i < ReadAppointment.Appointments.size(); i += 6) {
                    if (ReadAppointment.Appointments.get(i).equals(id)){
                        if (ReadAppointment.Appointments.get(i+4).equals("pnemonia")){
                            System.out.println("Patient Name: " + ReadAppointment.Appointments.get(i + 1));
                            System.out.println("Doctor Name: " + ReadAppointment.Appointments.get(i + 2));
                            System.out.println("No of Consultations: " + ReadAppointment.Appointments.get(i + 3));
                            System.out.println("Disease: " + ReadAppointment.Appointments.get(i + 4));
                            System.out.println("Treatment");
                            System.out.println("Antibiotics prescribed for bacterial pneumonia");
                            //System.out.println("Antifungal medicines are prescribed for fungal pneumonia");
                        }
                        if (ReadAppointment.Appointments.get(i+4).equals("blood pressure")){
                            System.out.println("Patient Name: " + ReadAppointment.Appointments.get(i + 1));
                            System.out.println("Doctor Name: " + ReadAppointment.Appointments.get(i + 2));
                            System.out.println("No of Consultations: " + ReadAppointment.Appointments.get(i + 3));
                            System.out.println("Disease: " + ReadAppointment.Appointments.get(i + 4));
                            System.out.println("Treatment");
                            System.out.println("Tablet used is Olmezest");

                        }
                        if (ReadAppointment.Appointments.get(i+4).equals("fever")){
                            System.out.println("Patient Name: " + ReadAppointment.Appointments.get(i + 1));
                            System.out.println("Doctor Name: " + ReadAppointment.Appointments.get(i + 2));
                            System.out.println("No of Consultations: " + ReadAppointment.Appointments.get(i + 3));
                            System.out.println("Disease: " + ReadAppointment.Appointments.get(i + 4));
                            System.out.println("Treatment");
                            System.out.println("Tablet used is Ofloxacin");
                            System.out.println("AntiBiotic is used");
                        }
                        if (ReadAppointment.Appointments.get(i+4).equals("Headache")){
                            System.out.println("Patient Name: " + ReadAppointment.Appointments.get(i + 1));
                            System.out.println("Doctor Name: " + ReadAppointment.Appointments.get(i + 2));
                            System.out.println("No of Consultations: " + ReadAppointment.Appointments.get(i + 3));
                            System.out.println("Disease: " + ReadAppointment.Appointments.get(i + 4));
                            System.out.println("Treatment");
                            System.out.println("Tablet used is Saridon");
                        }
                    }
                }
                break;
            }

            default:{
                System.out.println("Wrong Value entered");
            }
        }
    }
}
