public class ForEach {
    public static void main(String[] args) {
        /*
        berfungsi untuk mengakses data setiap index pada array
         */

//        tanpa forEach
        String[] array = {
                "Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now"
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        menggunakan forEach
        for (var value : array) {
            System.out.println(value);
        }
    }
}
