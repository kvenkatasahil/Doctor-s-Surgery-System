import java.util.*;
public class Doctor {
    static ArrayList<Doctor>D1=new ArrayList<>();
    String name;
    String designation;
    String specialization;
    String ph_no;
    public Doctor(String name,String designation,String specialization,String  ph_no) {
        this.name = name;
        this.designation = designation;
        this.specialization = specialization;
        this.ph_no = ph_no;
    }
    public void add()
    {
        D1.add(this);
    }
    @Override
    public String toString()
    {
        String a=" Name " +name+ " Designation "+ designation +" Specialization  "+specialization+" Phone Number "+ph_no;
        return a;
    }

}


