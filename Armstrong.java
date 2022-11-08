import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int sum = 0;
        int temp;
        int count = 0;
        int rem = 0;
        // temp = n;
        // System.out.println(n);
        for (int i = 1; i <= 1000; i++) {
            temp = i;
            while (temp > 0) {
                int n1 = temp % 10;

                sum = (n1 * n1 * n1) + sum;
                temp = temp / 10;
            }
            if (i == sum) {
                count++;
                System.out.println(count);

            } // else {
              // System.out.println("not");

        }
    }
}
