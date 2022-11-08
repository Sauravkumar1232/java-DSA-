// import java.util.*;

// public class adivideb {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int t = in.nextInt();
//         while (t-- > 0) {
//             int a = in.nextInt();
//             int b = in.nextInt();
//             System.out.println(a % b);
//             // t--;
//         }
//     }
// }
/* package codechef; // don't place package name! */

// /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int x;
        int y;
        int a;
        while (t > 0) {
            x = in.nextInt();
            y = in.nextInt();
            a = in.nextInt();
            t--;
            if (x <= a && a > y) {
                System.out.print("yes");
            } else {
                System.out.print("no");

            }
        }

    }
}
