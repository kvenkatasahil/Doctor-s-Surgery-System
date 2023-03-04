import java.util.*;
public class Patient {
    static ArrayList<Patient>P1=new ArrayList<>();
    String name;
    String gender;
    String ph_no;
    String weight;
    public Patient(String name,String gender,String ph_no,String weight){
        this.name=name;
        this.gender=gender;
        this.ph_no=ph_no;
        this.weight=weight;

    }
    public void add()
    {
        P1.add(this);
    }
        @Override
        public String toString()
        {
            String b=" Name "+name+" Gender "+gender+" Phone Number "+ph_no+" Weight "+weight;
            return b;
        }

}
