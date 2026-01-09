import java.util.Scanner;

public class Dz21 {
    public static void main(String[] args) {
        findTheWordWrittenWithFence();

    }


    public static void findEverySecondLetter() {
        char[] vowels = {'а', 'у', 'о', 'ы', 'э', 'я', 'ю', 'ё', 'и', 'е',
                'А', 'У', 'О', 'Ы', 'Э', 'Я', 'Ю', 'Ё', 'И', 'Е'};
        String[] words = {"Море", "Листвы", "Аист", "Книга", "Овес", "Ротик", "Поезд", "Туча", "Река", "Сила"};

        for (String word : words) {
            int count = 0;
            char[] charArray = word.toCharArray();
            for (char c : charArray) {
                for (char vowel : vowels) {
                    if (c == vowel) {
                        count++;
                        break;
                    }
                }
            }
            if (count == 2) {
                System.out.println(word);
            }
        }
    }


    public static void firstEvenNumber() {
        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Введите число : ");
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= 100 && number[i] % 2 == 0) {
                System.out.println(number[i]);
                break;

            }
        }
    }


    public static void findTheWordWrittenWithFence() {

        String[] words = {"hello", "wOrld", "java", "зАбОрЧиКоМ", "prOgRaM"};
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (isValid(words[i])) {
                result = words[i];
                break;
            }
        }

        System.out.println("Найденное слово: " + result);
    }

    public static boolean isValid(String word) {
        for (int i = 1; i < word.length(); i += 2) {
            if (!Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}


