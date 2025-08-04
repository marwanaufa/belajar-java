public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

//        Tanpa ternary operator
        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Maaf Anda Tidak Lulus";
        }

        System.out.println(ucapan);

//        Menggunakan ternary operator
        String ucapan2 = nilai >= 75 ? "Selamat Anda Lulus" : "Maaf Anda Tidak Lulus";

        System.out.println(ucapan2);
    }
}
