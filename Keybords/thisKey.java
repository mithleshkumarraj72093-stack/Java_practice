package Keybords;

public class thisKey {
    String  name;
    int age;
    String Branch;

    thisKey(String name, int age, String Branch){
        this.name = name;
        this.age = age;
        this.Branch = Branch;
       
    }
    void show(){
        System.out.println("Name -: " + this.name);
        System.out.println("Age -: " + this.age);
        System.out.println("Branch -: " + this.Branch);
    }
    public static void main(String[] args){
       thisKey s1 = new thisKey("mithilesh", 20, "BCA");
       thisKey s2 = new thisKey("Akash", 22, "BCA");
       

       s1.show();
       s2.show();
    }

}
