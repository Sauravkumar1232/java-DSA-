public class Factorial_rec {
    static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else
            return (num) * fact(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("The factorial is= " + fact(4));
    }
}
