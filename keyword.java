public class keyword {

    String name;

    keyword(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {

        keyword s1 = new keyword("Mithilesh");

        s1.show();
    }
}