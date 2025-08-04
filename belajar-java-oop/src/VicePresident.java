// Inheritance
// Ini adalah class child dari parent Manager
// Class child akan memiliki semua yang dimiliki class parentnya

class VicePresident extends Manager{
    // Method overriding > method yang sudah ada di parent class dideklarasikan ulang di child class nya.
    // Bukan method overloading dan sangat berbeda.
    // Contoh, method sayHello sudah dideklarasikan di class Manager, tetapi dideklarasikan ulang atau dibuat lagi di class VicePresident.
    // Method overriding membuat method yang berada di parent class tidak bisa diakses lagi dari child class.

    // Super bisa digunakan untuk memanggil constructor dari parent class, namun hanya bisa dipanggil didalam constructor yang sudah dibuat di child class.
    // Ketika di parent class ada constructor yang memiliki parameter, maka di child class wajib membuat constructor dan melakukan super ke constructor di parent.
    // Ketika di parent class ada constructor yang tidak memiliki parameter, maka child tidak wajib membuat constructor karena constructor tanpa parameter di parent
    // menjadi default constructor untuk childnya.
    // Ketika di parent ada lebih dari satu constructor, yg memiliki parameter berbeda, child bebas memanggil constructor yang mana saja.
    VicePresident(String name) {
        super(name);
    }
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is VP " + this.name);
    }
}
