class Recursion_Sum {
    static int sumofrange(int a) {
        if (a == 1) {
            return 1;
        }
        return a + sumofrange(a - 1);
    }

    public static void main(String[] args) {
        System.out.println("sum of two number== " + sumofrange(10));
    }
}