import java.util.Scanner;

public class Dz16 {
    public static void main(String[] args) {
        number3And4();

    }

    public static void number1() {
        String[] words = {"Про", "Ракета", "Интернет", "Воск", "Енот", "Тонн"};

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].toLowerCase().charAt(0));
        }

    }

    public static void number3And4() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        char[] vowels = {'а', 'у', 'о', 'ы', 'э', 'я', 'ю', 'ё', 'и', 'е',
                'А', 'У', 'О', 'Ы', 'Э', 'Я', 'Ю', 'Ё', 'И', 'Е'};
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();

        for (char c : charArray) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }

    public static void number5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово : ");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

    public static void number6() {
        Scanner scanner = new Scanner(System.in);
        char[] vowels = {'а', 'у', 'о', 'ы', 'э', 'я', 'ю', 'ё', 'и', 'е',
                'А', 'У', 'О', 'Ы', 'Э', 'Я', 'Ю', 'Ё', 'И', 'Е'};

        System.out.print("Введите слово : ");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();

        String result = null;
        for (char c : charArray) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    result = word.replace(vowel, 'y');
                }
            }
        }
        System.out.println(result);
    }

    public static void number7() {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int dotIndex = 0;
        int i = 0;

        while (i < str.length() && dotIndex == 0) {
            if (str.charAt(i) == '.') {
                dotIndex = i;
            }
            i++;
        }
        char[] intPart = new char[dotIndex];
        char[] fractPart = new char[str.length() - dotIndex - 1];

        for (int x = 0; x < dotIndex; x++) {
            intPart[x] = str.charAt(x);
        }
        System.out.println(intPart);

        int fractIndex = 0;
        for (int x = dotIndex + 1; x < str.length(); x++) {
            fractPart[x - dotIndex - 1] = str.charAt(x);
            fractIndex++;
        }
        System.out.println(fractPart);


    }


}
