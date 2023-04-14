import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadPatient {
    static ArrayList Patients=new ArrayList();
    public static void read()throws
            IOException, FileNotFoundException
    {
        Patients.clear();
        File ob1=new File("Patients.txt");
        Scanner sc=new Scanner(ob1);
        while(sc.hasNextLine())
        {
            String random=sc.nextLine();
            Patients.add(random);
        }
    }

}
