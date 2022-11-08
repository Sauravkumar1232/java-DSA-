import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        // System.out.println();
        boolean flag = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }

        }
        if (flag) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }

    }
}
