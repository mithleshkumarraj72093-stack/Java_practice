public class Student1 {
    String name;          // Instance variable (unique for each student)
    static int studentCount = 0; // Static variable (shared among all students)

    // Constructor
    public Student1(String name) {
        this.name = name;
        studentCount++;   // Increments the shared counter whenever a student is created
    }


    public class mian {
        public static void main(String[] args) {
        // Accessing static variable before creating any objects
        System.out.println("Initial Students: " + Student1.studentCount); // Outputs 0

        Student1 s1 = new Student1("Alice");
        Student1 s2 = new Student1("Bob");

        // Both objects share the same static variable
        System.out.println(s1.name + " registered.");
        System.out.println(s2.name + " registered.");
        
        // Accessing via class name shows the updated shared value
        System.out.println("Total Students: " + Student1.studentCount); // Outputs 2
    }
}
}
 
    

