public class area {
    int length;
    int width;

    void insert(int i, int w) {
        length = i;
        width = w;
    }

    void calculate() {
        System.out.println(length * width);
    }

    public static void main(String[] args) {
        // area a1 = new area();
        // area a2 = new area();
        area a1 = new area(), a2 = new area(); // creating multiple object by one type only.......
        a1.insert(10, 20);
        a2.insert(5, 6);
        a1.calculate();
        a2.calculate();

    }
}
