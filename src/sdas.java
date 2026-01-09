import java.util.ArrayList;
import java.util.Scanner;

public class sdas {
    public static void main(String[] args) {
//        int result1 = qwe1(4);
//        System.out.println(result1);
//
//        double result2 = qwe2(10, 10);
//        System.out.println(result2);
//
//        double result3 = anInt(160);
//        System.out.println(result3);
//
//        int result4 = zxc(0);
//        System.out.println(result4);
//
//        int result5 = asd(637);
//         System.out.println(result5);

        ArrayList<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count != 10) {
            count++;
            System.out.println("Введите строку №" + count);
            String line = scanner.nextLine();
            array.add(
                    line
            );


            if (line.contains("!")) {
                System.err.println(line);
            }


        }

        System.out.println("Ввведите число max ");
        int max = scanner.nextInt();

        for (String string : array) {
            int size = string.length();

            if (size < max) {
                System.out.println(string);
            } else {
                String ob = string.substring(0, max);
                System.err.println(ob);
            }

        }


    }

    public static int qwe1(double qwe) {
        return (int) (5 + qwe);

    }

    public static double qwe2(double qaz, double qaz2) {
        return (qaz * qaz2);

    }

    public static String str(String world) {
        return "Hello" + world;
    }

    public static double anInt(double itn) {
        return 200000 / itn;
    }

    public static int zxc(int cxz) {
        return (int) (Math.pow(5, 5));
    }

    public static int asd(int gfj) {
        return 1258 - gfj;
    }
}


