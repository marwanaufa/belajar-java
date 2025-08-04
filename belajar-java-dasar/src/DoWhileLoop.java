public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        logikanya mirip seperti while loop tetapi kebalikannya
        yaitu melakukan tugasnya dulu baru melakukan pengecekan
        jadi perulangan akan dilakukan minimal satu kali walaupun nilainya false
         */
        var counter = 100;

        do {
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 10);
    }
}
