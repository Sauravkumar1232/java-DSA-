public class Patt {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {

        // for (int j = 0; j < 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 2 * i + 1; j++) {
        // System.out.print("*");
        // }
        // // for (int j = 0; j < i ; j++) {
        // // System.out.print("*");

        // // }
        // System.out.println();
        // }
        // }
        // for (int i = 5; i >= 0; i--) {
        // for (int j = 0; j < 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        int row = 5;
        int col = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1 || i == j || i == row / 2 || j == col / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
