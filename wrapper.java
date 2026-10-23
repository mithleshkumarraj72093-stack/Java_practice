public class wrapper {
    public static void main(String[] args){
        String age = "20";
        String marks = "90.5";
        
        int actualage = Integer.parseInt(age);
        double actualmarks = Double.parseDouble(marks);

        System.out.println("Age: " + actualage);
        System.out.println("Marks: " + actualmarks);

        System.out.println("Marks after bonus: " + (actualmarks + 5));

    }
}

