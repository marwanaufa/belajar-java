// Class
public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    // Method yang akan dipanggil ketika object pertama kali dibuat
    // Constructor overloading hampir sama dengan method overloading. Nama bisa sama, dengan syarat tipe atau jumlah parameter berbeda.
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    /*
    Person(String paramName) {
        name = paramName;
    }
     */

    /*
     Karena pengisian name di constructor atas sama dengan pengisian name di constructor pertama, maka bisa dibuat dengan memanggil
     constructor pertama di constructor ke dua seperti di bawah ini
     */
    Person(String paramName) {
        this(paramName, null);
    }

    Person() {

    }

    // Method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }

    /*
    Variable Shadowing - adalah ketika ada nama variable yang sama di satu scope, maka variable pertama tidak akan bisa digunakan
    karena tertutupi oleh variable kedua.
    contoh:
    Person(String name, String address) {
        name = name; // variable name tidak akan berubah
        address = address; // variable address tidak akan berubah
    }

    kedua variable tidak akan berubah karena keduanya sama2 mengacu kepada parameter yang ada pada constructor Person.
    Tidak mengarah ke variable pertama yang diinisialisasi pada awal class.
    variable shadowing bisa diatasi menggunakan this keyword.
    contoh:
    Person(String name, String address) {
        this.name = name; // variable name tidak akan terkena vari
        this.address = address; // variable address tidak akan berubah
    }
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
     */
}
