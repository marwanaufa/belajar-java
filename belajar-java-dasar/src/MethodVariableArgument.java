public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 85, 60, 75, 90, 80};
        sayCongrats("Marwan", values);
        sayCongrats2("Marwan", 80, 85, 60, 75, 90, 80);
    }

//    tanpa variable argument
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total/ values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

//    menggunakan variable argument
    static void sayCongrats2(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total/ values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
