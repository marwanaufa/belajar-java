public class MethodOverloading {
    public static void main(String[] args) {
        /*
        method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
        dengan syarat memilihi data yang berbeda, entah itu tipe datanya atau jumlah datanya.
         */
        sayHello();
        sayHello("Marwan", "Aufa");
        sayHello(1, 2);
    }

    static void sayHello() {
        System.out.println("Hello from the other side");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static void sayHello(int firstName, int lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
