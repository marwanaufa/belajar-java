public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

//        Augmented Assignments
        a = a + 10;
//        adalah sama dengan
        a += 10;

//        berlaku juga untuk tanda yang lain
        a -= 10;
        a *= 10;
        a /= 10;
        a %= 10;

//        Unary Operator
        /*
        ++ > a = a + 1
        -- > a = a - 1
        - > negatif a
        + > positif a (tidak perlu dituliskan, default number adalah positif)
        ! > not (kebalikan)
         */
    }
}
