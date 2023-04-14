import java.time.LocalTime;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Appointment {
    static ArrayList A1=new ArrayList ();
    int Appointmentid = 1;
    String Patient_name;
    String Doctor_name;
    String noofconsult;
    String Appointment_no;
    String Diseases;
    LocalTime appoint_time;

    public void add(String Patient_name,String Doctor_name,String noofconsult,String Diseases,LocalTime appoint_time,int Appointmentid)
    {
        this.Appointmentid=Appointmentid;
        this.Patient_name=Patient_name;
        this.Doctor_name=Doctor_name;
        this.noofconsult=noofconsult;
        //this.Appointment_no=Appointment_no;
        this.Diseases=Diseases;
        this.appoint_time=appoint_time;

        A1.add(Appointmentid);
        A1.add(Patient_name);
        A1.add(Doctor_name);
        A1.add(noofconsult);
        //A1.add(Appointment_no);
        A1.add(Diseases);
        String x=appoint_time.toString();
        A1.add(x);

    }
    public void Write()
    {
        try
        {
            FileWriter ob1=new FileWriter("Appointments.txt",true);
            for(int i=0;i< A1.size();i+=6)
            {

                ob1.write(A1.get(i)+"\n"+A1.get(i+1)+"\n"+A1.get(i+2)+"\n"+A1.get(i+3)+"\n"+A1.get(i+4)+"\n"+A1.get(i+5)+"\n");
            }
            ob1.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

}
