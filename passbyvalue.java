public class passbyvalue {
    public static void changeNumber(int num) {
        num = num + 10;
        System.out.println("Inside method " + num);
        
    }
    public static void main(String[] args) {
       int myNumber = 10;
       System.out.println("Before method " + myNumber);

       changeNumber(myNumber);

       System.out.println("Before method " + myNumber);

    }
}
