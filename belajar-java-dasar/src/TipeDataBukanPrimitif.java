public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /*
        Primitif > Bukan Primitif
        byte > Byte
        short > Short
        int > Integer
        long > Long
        float > Float
        double > Double
        char > Character
        boolean > Boolean

        tipe data bukan primitif memiliki default nilai null.
         */

        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort;
        iniShort = 100;
        System.out.println(iniShort);

//        Konversi tipe data primitif ke tipe data bukan primitif
//        Konversi ke sesama tipe/yang kompatibel
        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        System.out.println(iniInteger2);

//        Konversi ke beda tipe/yang tidak kompatibel
//        Dikonversi ke yang kompatibel dahulu kemudian diambil valuenya
        short iniShort2 = iniInteger2.shortValue();
        byte iniByte2 = iniInteger2.byteValue();

        System.out.println(iniShort2);
        System.out.println(iniByte2);
    }
}
