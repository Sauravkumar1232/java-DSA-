public class fibo_recur {
    static int fib(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        return fib(a - 1) + fib(a - 2);
    }

    public static void main(String[] args) {
        int a = 1;

        int result = fib(5);
        System.out.println(result);

    }
}
