import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
public class Doctor {
    static ArrayList D1 = new ArrayList();
    int Doctorid = 1;
    String name;
    String designation;
    String specialization;
    String ph_no;
    LocalDate dateofjoin;

    public void add(String name, String designation, String specialization, String ph_no, LocalDate dateofjoin, int Doctorid) {
        this.Doctorid = Doctorid;
        this.name = name;
        this.designation = designation;
        this.specialization = specialization;
        this.ph_no = ph_no;
        this.dateofjoin = dateofjoin;

        D1.add(Doctorid);
        D1.add(name);
        D1.add(designation);
        D1.add(specialization);
        D1.add(ph_no);
        String x = dateofjoin.toString();
        D1.add(x);

    }

    public void Write() {
        try {
            FileWriter ob1 = new FileWriter("Doctors.txt", true);
            for (int i = 0; i < D1.size(); i += 6) {

                ob1.write(D1.get(i) + "\n" + D1.get(i + 1) + "\n" + D1.get(i + 2) + "\n" + D1.get(i + 3) + "\n" + D1.get(i + 4) + "\n" + D1.get(i + 5) + "\n");
            }
            ob1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}