import java.util.*;
import java.lang.*;
import java.io.*;

public class Hello_World {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (arr[i] != arr[j]) {
                System.out.println("False");
                return;
            } else {
                i++;
                j--;
            }
        }
        System.out.println("True");
    }
}