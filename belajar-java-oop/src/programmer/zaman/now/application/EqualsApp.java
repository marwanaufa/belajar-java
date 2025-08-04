package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Eko";
        first = first + " " + "Khannedy";
        System.out.println(first);

        String second = "Eko Khannedy";
        System.out.println(second);

        /**
         * Object first dan second pada tahap ini memiliki isi yang sama, tetapi ketika dibandingkan akan bernilai false.
         */
        System.out.println(first == second); // false
        System.out.println(first == first); // true
        System.out.println(second == second); // true

        /**
         * Tapi ketika kita buat object lagi dengan isi seperti di bawah, kemudian dibandingkan dengan second, akan bernilai true.
         * Karena java mengoptimize memori. Ketika kita membuat 2 object yang tipenya sama dan isi yang sama, object kedua tidak akan dibuat lagi
         * tapi java hanya akan mereffer ke object yang lebih dulu dibuat. Jadi lokasi memorinya sama, inilah yang membuat nilainya true.
         */
        String third = "Eko Khannedy";
        System.out.println(third);

        System.out.println(second == third);

        /**
         * Jika memakai method equals akan berbeda hasilnya
         */
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(third));
    }
}

/**
 * Equals method
 *
 * Di java, cara membandingkan objek lumayan membingungkan.
 * Di bahasa pemrograman lain kita bisa memakai operator ==
 * Di java, operator == hanya untuk mengecek data primitif, untuk data non primitif menggunakan method equals.
 * Secara default, equals akan membandingkan dua object secara kesamaan posisi oject di memori, jadi kalau kita buat 2 object
 * yang isinya sama tetap akan dianggap berbeda.
 * Jadi kita harus mengoverride method equals milik object tersebut.
 */