public class Scope {
    public static void main(String[] args) {
        /*
        di java, variable hanya bisa diakses di dalam area dimana mereka dibuat
        ini disebut scope
         */

        sayHello("Marwan");
//        System.out.println(hello); // error karena memanggil variable diluar block
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); // error karena memanggil variable diluar block
    }
}
