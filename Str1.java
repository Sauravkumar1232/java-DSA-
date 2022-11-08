import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        // Scanner str = new Scanner(System.in);
        // String str1 = "this is a bat";
        // String rev = "";
        // System.out.println(str1);
        // // String[] rev1 = str1.substring();
        // String rev1 = "";
        // for (int i = 0; i <= str1.length() - 1; i++) {
        // rev1 = str1.substring(0, 3);

        // for (int j = rev1.length() - 1; j >= 0; j--) {
        // rev1 = rev1 + rev1.charAt(j);
        // break;
        // }
        // }
        // rev = rev + rev1;
        // System.out.println(rev);
        String str = "this iS a bat";
        String words[] = str.split("");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = " ";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);

            }
            reverseString = reverseString + reverseWord;
        }
        System.out.println(reverseString);
    }

}
