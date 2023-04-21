import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Delete_Appointment {
    static String Appointmentid;
    static String Consult;
    static ArrayList changeFile=new ArrayList();

    public static void change(String Appointmentid) throws IOException {
        Delete_Appointment.Appointmentid =Appointmentid;

        ReadAppointment.read();
        changeFile=ReadAppointment.Appointments;
        int c=0,c1;

        for(int i=0;i<changeFile.size();i+=6)
        {
            if(changeFile.get(i).equals(Appointmentid))
            {
                 c=i+3;
                 c1=Integer.parseInt(changeFile.get(c).toString())+1;
                changeFile.set(c,c1);
            }
        }
        Appointment.A1=changeFile;

       Appointment ob1=new Appointment();
        ob1.Write();

    }
}
