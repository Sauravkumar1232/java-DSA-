public class Final {
    // final int i = 5;
    int i = 5;

    void change() {
        i = 10;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Final f = new Final();
        f.change();
    }
}
