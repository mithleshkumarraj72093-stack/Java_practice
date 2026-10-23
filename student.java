// write a program using class and object 
import java.lang.*;

public class student {

    String name = "mithilesh";
    int reg = 27;

    public static void main(String[] args) {

        student s = new student();

        String dob = "18/12/2005";

        System.out.println("Name is "+s.name);
        System.out.println("Reg No "+s.reg);
        System.out.println("Data of birht "+dob);
    }
}