import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
public class Patient {
    static ArrayList P1=new ArrayList ();
    String name;
    int Patientid=1;
    String gender;
    String ph_no;
    String weight;
    String Doc_relatedto;
    String age;
    LocalDate dateofjoin;

    public void add(String name,String gender,String age,String ph_no, String weight, String Doc_relatedto,LocalDate dateofjoin,int Patientid)
    {
        this.Patientid=Patientid;
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.ph_no=ph_no;
        this.weight=weight;
        this.Doc_relatedto=Doc_relatedto;
        this.dateofjoin=dateofjoin;
        P1.add(Patientid);
        P1.add(name);
        P1.add(gender);
        P1.add(age);
        P1.add(ph_no);
        P1.add(weight);
        P1.add(Doc_relatedto);
        String x=dateofjoin.toString();
        P1.add(x);

    }

    public void Write()
    {
        try
        {
            FileWriter ob1=new FileWriter("Patients.txt",true);
            for(int i=0;i< P1.size();i+=8)
            {

                ob1.write(P1.get(i)+"\n"+P1.get(i+1)+"\n"+P1.get(i+2)+"\n"+P1.get(i+3)+"\n"+P1.get(i+4)+"\n"+P1.get(i+5)+"\n"+P1.get(i+6)+"\n"+P1.get(i+7)+"\n");
            }
            ob1.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
