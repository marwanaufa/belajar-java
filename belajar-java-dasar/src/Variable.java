public class Variable {
    public static void main(String[] args) {
        String name; // akan keisi default value, string null. jika angka maka 0.
        name = "Marwan Aufa";

        int age = 30;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(address);

        name = "Muhammad Marwan Aufa";
        System.out.println(name);

        /*
        error. harus langsung diisi nilainya.

        var nama;
        nama = "Muhammad Marwan Aufa";
         */

        var namaLengkap = "Muhammad Marwan Aufa";

        System.out.println(namaLengkap);

        // Kata kunci final, seperti const, membuat variable tidak bisa diubah.
        final var namaLahir = "Muhammad Marwan Aufa";

        /*
        error. namaLahir tidak bisa dirubah karena final.
        namaLahir = "Muhammad Marwan Aufa Pertama";
         */
    }
}
