import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Dz6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // task1();


        //task2();


        // task3();

    }

    public static int max(Integer... vals) {

        return Collections.max(Arrays.asList(vals));
    }

    public static void task1() {

        System.out.print("Введите дробное число : ");
        double x = scanner.nextDouble();

        if (x > Math.PI) {
            System.out.println("pimore");
        }
    }

    public static void task2() {
        System.out.print("Введите слово : ");
        String str = scanner.nextLine().trim();
        if (str.contains(" ")) {
            System.out.println("Ты вывел несколько слов");
        } else if (str.isEmpty()) {
            System.out.println("Строка пустая");
        } else {

            System.out.println("Ты вел одно слово");
        }
    }

    public static void task3() {
        System.out.print("Введите число 1 : ");
        int number1 = scanner.nextInt();

        System.out.print("Введите число 2 : ");
        int number2 = scanner.nextInt();

        System.out.print("Введите число 3 : ");
        int number3 = scanner.nextInt();

        System.out.print("Введите число 4 : ");
        int number4 = scanner.nextInt();

        int max = max(number1, number2, number3, number4);
        System.out.println(max);
    }

}
