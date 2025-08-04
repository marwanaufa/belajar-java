public class PersonApp {
    public static void main(String[] args) {
        /*
        // Membuat object dengan class Person
        var person1 = new Person();
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        // Pengisian value di object
        person1.name = "Muhammad Marwan Aufa";
        person1.address = "Banyumas";
        // person1.country = "Tidak bisa diubah";
         */

        // Inisiasi object menjadi seperti ini karena sudah ada constructor
        var person1 = new Person("Marwan Aufa", "Banyumas");
        var person2 = new Person("Reandra");
        var person3 = new Person();
        person3.name = "Ganesha";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // Penggunaan method
        person1.sayHello("Anvil");

        // Menggunakan class yang diextend

    }
}
