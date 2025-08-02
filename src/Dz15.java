import java.util.Scanner;

public class Dz15 {
    public static void main(String[] args) {

        number2();
    }


    public static void number1() {
        final int[] a = {5, 8, 11,11,231,325,4,32,54,53,43,2,42,42,42,4,23,3,4,2,6,1,7,6,3,3,6,3,6,3,6,28,9};
        System.out.print("Введите размер массива : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Введите число : ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]*2);
        }


    }

    public static void number2() {
        final int[] a = {5, 8, 11};
        System.out.print("Введите размер массива : ");
        Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Число массива : ");
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Максимальное число " + max);
    }
}
