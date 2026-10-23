// public class method {
//     static void greet1(String name, int Rollno, int marks){
//         System.out.println("name is "+ name);
//         System.out.println("Rollno is "+ Rollno);
//         System.out.println("marks is "+ marks);
    
//     }

//      static void employees(String name, int Salary, String CompanyName, String Position){
//         System.out.println("Employees name " + name);
//         System.out.println("Employees salary = "+ Salary);
//         System.out.println("Employees Company name  = "+ CompanyName);
//         System.out.println("Employees Position "+ Position);
    
//     }
// public static void main(String[] agrs){
//     greet1("Mithilesh", 453, 95);
//     System.out.println();

//     employees("Mithilesh", 500000, "Microsoft", "manager");
  
  
// }
    
// }

public class method {

    // static void parameters(String name, int marks){
    //     System.out.println("Name : " + name + " Marks : " + marks);
    // }
    // public static void main(String[] agrs){
    //     parameters("Mithilesh", 98);
    // }
static int getsum(){
    int a = 10;
    int b = 20;

    
    return a+b;
}

    
public static void main(String[] args){
    int result = getsum();
    System.out.println(result);
}
}