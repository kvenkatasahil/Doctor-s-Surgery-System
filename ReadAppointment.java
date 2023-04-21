import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAppointment {
    static ArrayList Appointments=new ArrayList();
    public static void read()throws
            IOException, FileNotFoundException
    {
        Appointments.clear();
        File ob1=new File("Appointments.txt");
        Scanner kvs=new Scanner(ob1);
        while(kvs.hasNextLine())
        {
            String random=kvs.nextLine();
            Appointments.add(random);
        }
    }

}
