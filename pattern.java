import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print(" ");
        // }
        // System.out.println("#");
        // System.out.println(" ");
        // }
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if (i == 1 || i == 4 || j == 1 || j == 4) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();

        // }

        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(j + 1 + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print(j + 1);
        // }
        // System.out.println();
        // }
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(5 - j + 1);
                if (i == 1 && j == 4)
                    System.out.print("*");
            }

            System.out.println();
        }
    }

}