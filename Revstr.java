import java.util.Scanner;

public class Revstr {
    public static void main(String[] args) {
        // System.out.println("54987");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // System.out.println(s.length() - 1);
        /// System.out.println(s.charAt(4));
        // String temp="";
        // for (int i = 0; i < s.length() - 1; i++) {
        // for (int j = 0; j < s.length()-1; j++) {
        // temp=s.charAt(i);
        // if (s.charAt(i) == s.charAt(j)) {
        // System.out.println(i);
        // }
        // }
        // }
        int count;
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            // count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    // System.out.println(s.charAt(i));
                    // char[] s1 = s.toCharArray();
                    // s1[j] = '0';
                    // count++;System.out.println(s1[i]);
                    System.out.println(s1[i]);
                }

            }

            // if (count > 1 && s1[i] != 0)

        }
    }
}
