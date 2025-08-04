public class Break {
    public static void main(String[] args) {
        /*
        break berfungsi untuk menghentikan perulangan meskipun nilai yang dicek selalu true
         */
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }
    }
}
