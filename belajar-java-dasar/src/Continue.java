public class Continue {
    public static void main(String[] args) {
        /*
        continue berfungsi untuk menghentikan perulangan dan tidak menjalankan code di bawahnya, kemudian lanjut ke perulangan selanjutnya
         */
        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
        System.out.println("Perulangan Ganjil-" + counter);
        }

        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 1) {
                continue;
            }
            System.out.println("Perulangan Genap-" + counter);
        }
    }
}
