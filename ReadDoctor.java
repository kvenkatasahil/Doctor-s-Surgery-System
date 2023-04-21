import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadDoctor {
    static ArrayList Doctors=new ArrayList();
    public static void read()throws
            IOException, FileNotFoundException
    {
        Doctors.clear();
        File ob1=new File("Doctors.txt");
        Scanner kvs=new Scanner(ob1);
        while(kvs.hasNextLine())
        {
            String a=kvs.nextLine();
            Doctors.add(a);
        }
    }

}
