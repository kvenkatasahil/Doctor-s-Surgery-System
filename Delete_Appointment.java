import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Delete_Appointment {
    static String Appointmentid;
    static String Consult;
    static ArrayList changeFile=new ArrayList<>();
    public static void delete()
    {
        File x=new File("Appointments.txt");


        if (!x.exists()) {

        } else if (!x.isFile()) {

        } else {
            try {
                FileWriter fw = new FileWriter(x, false);
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void change(String Appointmentid) throws IOException {
        Delete_Appointment.Appointmentid =Appointmentid;
        Delete_Appointment.Consult=Consult;
        ReadAppointment.read();
        changeFile=ReadAppointment.Appointments;
        int c=0,c1;
        Delete_Appointment.delete();
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
