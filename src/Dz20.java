import java.util.Scanner;

public class Dz20 {
    public static void main(String[] args) {
        deleteSpace();

    }

    public static void printPoems() { // Пользователь вводит стихотворение из четырёх строк.
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку : ");
        String line1 = scanner.nextLine();
        System.out.println("Введите вторую строку : ");
        String line2 = scanner.nextLine();
        System.out.println("Введите третью строку : ");
        String line3 = scanner.nextLine();
        System.out.println("Введите четвертую строку : ");
        String line4 = scanner.nextLine();

        builder.append(
                line1 + '\n'
                        + line2 + '\n'
                        + line3 + '\n'
                        + line4 + '\n'
        );

        String str = builder.toString();
        System.out.print(str);
    }

    public static void printWordsBackwards() { // Пользователь вводит три слова, соберите из них строку, где слова будут в обратном порядке

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три слов ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String words = scanner.nextLine();
            builder.insert(0, words);
            builder.insert(0, " ");
        }
        System.out.println(builder.toString());
    }

    public static void addText() { // Пользователь вводит слово. Добавьте к нему в начало «вы говорите:» \слово пользователя. И в конец: «.. и что?»

        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String userWord = scanner.nextLine();

        builder.insert(0, "Вы говорите ");
        builder.append(userWord);
        builder.insert(35, " И что ?");

        String str = builder.toString();
        System.out.println(str);

    }

    public static void insertSentencesBetweenWords() {

        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предложение из двух слов : ");
        String words = scanner.nextLine();
        builder.insert(0, words);
        builder.insert(4, "так сказать ");

        String result = builder.toString();
        System.out.println(result);

    }

    public static void afterEachWordAComma() { // Пользователь вводит пять слов, соберите из них целую строку, между  каждым словом вставьте «, и»

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пять слов ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String words = scanner.nextLine();
            builder.insert(0, words + ",и ");
        }
        System.out.println(builder.toString());
    }

    public static void deleteSpace() { //  Пользователь вводит предложение, удалите все пробелы из него
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово через пробел");
        String words = scanner.nextLine();

        StringBuilder builder = new StringBuilder(words);
        String result = words.trim();
        System.out.println(result);
    }
}
