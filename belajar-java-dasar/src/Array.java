public class Array {
    public static void main(String[] args) {
//        Beberapa cara inisialisasi array
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Muhammad";
        arrayString[1] = "Marwan";
        arrayString[2] = "Aufa";

        Integer[] arrayInteger = {
                10, 20, 30, 40, 50, 60, 70, 80
        };

        Integer[] arrayInteger2 = new Integer[] {
                10, 20, 30, 40, 50, 60, 70, 80
        };

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[2] = "Reandra";

        System.out.println(arrayString[2]);

        /*
        Operasi di Array
        array.length > melihat panjang array
        array[index] = nilai > mengubah data array
        array[index] > mengakses data array
         */

//        Array dalam array
        String[][] members = {
                {"Eko","Kurniawan"},
                {"Budi","Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
