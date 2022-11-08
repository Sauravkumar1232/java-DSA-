import java.util.Scanner;

class codechef {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        int n = in.nextInt();
        System.out.println("enter k");
        int k = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}