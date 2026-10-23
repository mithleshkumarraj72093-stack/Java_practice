// 5 wap to show details  of. Faculty  using  member function

public class Details{
    String Name = "Mithilesh";
    int age = 20;
    String Branch = "BCA";
    void show(){
        System.out.println(Name);
        System.out.println(age);
        System.out.println(Branch);
    }
    public static void main(String[] args){
        Details  d = new Details ();
       d.show();
    }
}