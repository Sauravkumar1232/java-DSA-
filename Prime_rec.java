import java.util.Scanner;

public class Prime_rec {

    // static void prime(int num) {
    // boolean flag = true;
    // for (int i = 2; i < num; i++) {
    // if (num % i == 0) {
    // System.out.println("");
    // flag = false;
    // }
    // }
    // if (flag == true) {
    // System.out.println("prime no");
    // }
    // for (int i = 1; i <= num; i++) {
    // boolean flag = true;
    // for (int j = 2; j < num; j++) {
    // if (i % j == 0) {
    // // System.out.println("");
    // flag = false;
    // }
    // }
    // if (flag == true) {
    // System.out.println(i);
    // }
    // }
    // }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        // if(num==1||num==2){
        // System.out.println("");
        // }

        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }

    }
}
