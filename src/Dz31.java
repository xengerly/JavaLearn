import java.util.Scanner;

public class Dz31 {
    public static void main(String[] args) {

    }

    static void displayError() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число : ");
            char number = scanner.next().charAt(0);
            if (!Character.isDigit(number)) {
                throw new RuntimeException("Ввод некоректный");
            } else {
                System.out.println("Вы ввели число " + number);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    static void inputNumberEnteredYet() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число : ");
            char number = 0;
            while (!Character.isDigit(number)) {
                number = scanner.next().charAt(0);
                if (!Character.isDigit(number)) {
                    System.out.println("Вы ввели не число");
                }
            }
            System.out.println("Вы ввели " + number);
        } catch (RuntimeException e) {

        }
    }
}
