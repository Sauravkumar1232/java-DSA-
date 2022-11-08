public class Testclassinheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.walk();
        class Animal {
            void bark() {
                System.out.println("barking........");
            }
        }
    }

    class Dog extends Animal {
        void walk() {
            System.out.println("walking......");
        }
    }
}
