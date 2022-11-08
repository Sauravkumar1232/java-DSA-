class newkeyword {
    int id;
    String name;
}

class demo {
    public static void main(String[] args) {
        newkeyword s1 = new newkeyword(); // new keyword use to allocate memory at runtime
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
