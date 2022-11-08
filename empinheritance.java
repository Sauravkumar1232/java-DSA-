class empinheritance {
    float salary = 4000;
}

class programmer extends empinheritance {
    int bounce = 1000;

    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println("programmer salary" + p.salary);
        System.out.println("programmer bounce" + p.bounce);
    }
}
