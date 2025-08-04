public class OperasiBoolean {
    public static void main(String[] args) {
        /*
        && > AND
        || > OR
        ! > NOT
         */
        var absen = 75;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >=75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
