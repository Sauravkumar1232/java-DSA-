public class constructoroberloading {
    int id;
    String name;
    int age;

    constructoroberloading(int i, String n) {
        id = i;
        name = n;
    }

    constructoroberloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;

    }

    void display() {
        System.out.println(id + name + age);
    }

    public static void main(String[] args) {
        constructoroberloading Student = new constructoroberloading(10, "Saurav");
        // Student(10, "Saurav");
        // constructoroberloading Student1 = new constructoroberloading(20, "Kumar",
        // 21);
        // Student(10, "Saurav", 21);
        Student.display();
        constructoroberloading Student1 = new constructoroberloading(Student);
        Student1.display();
    }

}
