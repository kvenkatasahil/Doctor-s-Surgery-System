import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadPatient {
    static ArrayList Patients=new ArrayList();
    public static void read() throws
            IOException, FileNotFoundException
    {
        Patients.clear();
        File ob1=new File("Patients.txt");
        Scanner kvs=new Scanner(ob1);
        while(kvs.hasNextLine())
        {
            String a=kvs.nextLine();
            Patients.add(a);
        }
    }

}
