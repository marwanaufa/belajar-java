public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "E";

        switch (nilai){
            case "A":
                System.out.println("Anda Lulus Dengan Cumlaude");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

//        Switch Lambda
        switch (nilai){
            case "A" -> System.out.println("Anda Lulus Dengan Cumlaude");
            case "B", "C" -> System.out.println("Anda Lulus Dengan Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

//        Kata kunci yield
        String ucapan;

//        tanpa yield
        switch (nilai){
            case "A" -> ucapan = "Anda Lulus Dengan Cumlaude";
            case "B", "C" -> ucapan = "Anda Lulus Dengan Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }

        System.out.println(ucapan);

//        menggunakan yield
        String ucapan2 = switch (nilai){
            case "A":
                yield "Anda Lulus Dengan Cumlaude";
            case "B", "C":
                yield "Anda Lulus Dengan Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan2);
    }
}
