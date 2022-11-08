public class Recursion_he {

    static void print(int num) {
        if (num == 5) {
            return;
        }

        System.out.println(num);
        print(num + 1);
        // return print(num + 1);

    }

    public static void main(String[] args) {
        // System.out.println("this is a recursion");
        // main(null);
        print(1);

    }
}
