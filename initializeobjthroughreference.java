class initializeobjthroughreference {
    int i;
    String name;

    public static void main(String[] args) {
        initializeobjthroughreference std1 = new initializeobjthroughreference();
        initializeobjthroughreference std2 = new initializeobjthroughreference();

        std1.i = 20;
        std1.name = "saurav"; // many object can use a class
        std2.i = 22;
        std2.name = "kumar";
        System.out.println(std1.i + " " + std1.name);
        System.out.println(std2.i + " " + std2.name);
    }
}