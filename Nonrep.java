public class Nonrep {
    public static void main(String[] args) {
        String str = "gibblegabbler";
        System.out.println("the string is " + str);
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    /// break;
                }
            }
            if (unique) {
                System.out.println(str.charAt(i));
                // break;
            }
        }
    }
}
