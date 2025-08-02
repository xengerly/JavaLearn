import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Dz13 {
    public static void main(String[] args) {


    }

    public static void printRomanNumerals() { // выведите римские цифры

        char firsNumber = 8543;
        char lastNumber = 8553;

        do {
            firsNumber++;
            System.out.println(firsNumber);

        } while (firsNumber < lastNumber);

    }

    public static void printNumbers() { // выведите числа от -0.9 до 0.9

        double firsNumber = -0.9;
        double lastNumber = 0.9;


        do {
            System.out.println(firsNumber);
            firsNumber = firsNumber + 0.1;

        } while (firsNumber < lastNumber);


    }

    public static String revers(String format) {
        return new StringBuilder(format).reverse().toString();
    }

    public static void reversWords() { // Пользователь вводит строку, выведите ее задом-наперёд.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово : ");
        String str = scanner.next();

        String resultWords = revers(str);
        System.out.println(resultWords);

    }

    public static void printWordsStartingWithACertainLetter() { // Пользователь вводит букву. Выведите любое слово, начинающуюся на эту букву

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово c заглавной букву : ");
        String word = scanner.next();

        if (word.equals("K")) {
            System.out.print("Корова");
        } else if (word.equals("А")) {
            System.out.print("Акула");
        } else if (word.equals("К")) {
            System.out.print("Крокодил");
        } else if (word.equals("К")) {
            System.out.print("Капибара");
        } else {
            System.out.print("Нету слова на букву " + word);
        }


    }

    private static void printWordsNumber() { // Пользователь вводит цифру: выведите страну, телефонный код которого начинается на эту цифру

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую цифру номера : ");
        String worldNumber = scanner.next();

        if (Objects.equals(worldNumber, "7")) {
            System.out.println("Россия");
        } else if (Objects.equals(worldNumber, "375")) {
            System.out.println("Беларусия");
        } else if (Objects.equals(worldNumber, "90")) {
            System.out.println("Турция");
        } else if (Objects.equals(worldNumber, "373")) {
            System.out.println("Молдова");
        } else {
            System.out.println("Вашего номера нету в списке");
        }
    }
}
