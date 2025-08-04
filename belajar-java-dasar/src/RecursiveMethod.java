public class RecursiveMethod {
    public static void main(String[] args) {
        /*
        kemampuan method untuk memanggil dirinya sendiri
         */

        System.out.println(factorial(10));
        System.out.println(factorialRecursive(10));
    }

//    tanpa recursive
    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

//    menggunakan recursive
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    /*
    hati2 dalam menggunakan recursive
    jika terlalu dalam, maka akan ada kemungkinan errror StackOverflow
    Karena ketika kita memanggil method, java akan menyimpannya dalam stack, jika method tersebut memanggil method lain maka stack akan terus menumpuk
    hingga stack terakhir tereksekusi, jika terlalu dalam maka stack akan terlalu besar.

    batasan maksimal stack tidak bisa dipastikan karena tergantung kapasitas laptop/komputer masing-masing
     */
}
