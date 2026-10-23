// public class Datatype {
//     public static void main(String[] args){
     

//         Object a = 25;
//         Object b = 25.5;
//         Object c = "Mithilesh";
//         Object d = true;

//         System.out.println("Value: " + a + " | Type: " + a.getClass().getSimpleName());
//         System.out.println("Value: " + b + " | Type: " + b.getClass().getSimpleName());
//         System.out.println("Value: " + c + " | Type: " + c.getClass().getSimpleName());
//         System.out.println("Value: " + d + " | Type: " + d.getClass().getSimpleName());
//     }
// }

class Student{
    String name;
    int  age;
}
public class Datatype {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Mithilesh";
        s1.age = 20;
        s2.name = "Mithilesh";
        s2.age = 20;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
