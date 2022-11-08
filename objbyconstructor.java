public class objbyconstructor {
    int id;
    String name;
    int salary;

    void insert(int i, String n, int s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(e1.id + e1.name + e1.salary);
    }

    public static void main(String[] args) {
        objbyconstructor e1 = new objbyconstructor();
        e1.insert(1, "saurav", 20);
        e1.display();

    }

}
