import java.util.Scanner;

public class Secondlarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("array elements=");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("largest element =" + max);
        int max1 = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] != max && max1 < arr[i]) {// 5>1
                max1 = arr[i];
                // break;
            }
        }
        System.out.println("Second largest =" + max1);

    }
}
