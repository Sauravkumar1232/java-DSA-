public class objbymathod {
    int i;
    String name;

    void insert(int roll, String n) {
        i = roll;
        name = n;
    }

    void display() {
        System.out.println(i + " " + name);
    }

    public static void main(String[] args) {
        objbymathod std1 = new objbymathod();
        objbymathod std2 = new objbymathod();
        std1.insert(10, "saurav");
        std2.insert(20, "kumar");
        std1.display();
        std2.display();

    }
}
