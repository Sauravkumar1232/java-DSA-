public class Static {
    int roll;
    String name;
    static String college = "RDEC";

    Static(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Static s1 = new Static(1, "Saurav");
        Static s2 = new Static(2, "kumar");
        s1.display();
        s2.display();

    }
}
