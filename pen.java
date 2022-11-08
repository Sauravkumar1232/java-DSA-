class pen {
    int price = 10;

    public static void main(String[] args) {

    }
}

class color extends pen {
    String color = "red";

    public static void main(String args[]) {
        color p = new color();
        System.out.println("price is=" + p.price);
        System.out.println("color is=" + p.color);

    }

}
