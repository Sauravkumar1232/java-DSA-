public class bank {
    int accno;
    String name;
    float amount;

    void insert(int a, String n, float am) {
        accno = a;
        name = n;
        amount = am;
    }

    void display() {
        System.out.println(accno + name + amount);
    }

    void deposit(float am) {
        amount = amount + am;
        System.out.println(am + " deposited");

    }

    void withdraw(float am) {
        if (amount < am) {
            System.out.println("insufficent ammount");
        } else {
            amount = amount - am;
            System.out.println(am + " withdrawn");
        }

    }

    void checkbalence() {
        System.out.println("Balence is==>" + amount);
    }

    public static void main(String[] args) {
        bank a1 = new bank();
        a1.insert(52244, "Saurav", 2000);
        a1.display();
        a1.checkbalence();
        a1.deposit(3000);
        a1.checkbalence();
        a1.withdraw(150);
        a1.checkbalence();
    }

}
