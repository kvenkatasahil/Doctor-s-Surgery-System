import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
public class Doctor {
    static ArrayList D1=new ArrayList();
    String name;
    String designation;
    String specialization;
    String ph_no;
    LocalDate dateofjoin;

    public void add(String name,String designation,String specialization,String ph_no,LocalDate dateofjoin)
    {
        this.name=name;
        this.designation= designation;
        this.specialization=specialization;
        this.ph_no=ph_no;
        this.dateofjoin=dateofjoin;

        D1.add(name);
        D1.add(designation);
        D1.add(specialization);
        D1.add(ph_no);
        String x=dateofjoin.toString();
        D1.add(x);
    }
    public void Write()
    {
        try
        {
            FileWriter ob1=new FileWriter("Doctors.txt",true);
            for(int i=0;i< D1.size();i+=5)
            {

                ob1.write(D1.get(i)+"\n"+D1.get(i+1)+"\n"+D1.get(i+2)+"\n"+D1.get(i+3)+"\n"+D1.get(i+4)+"\n");
            }
            ob1.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    public String toString()
//    {
//        String a=" Name " +name+ " Designation "+ designation +" Specialization  "+specialization+" Phone Number "+ph_no;
//        return a;
//    }

}


