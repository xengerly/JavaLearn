import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Dz11 {

    public static void main(String[] args) throws IOException {

        number6();


    }


    public static void number1() {
        int x1 = 0;
        while (x1 < 1_000_000) {
            x1 = x1 + 100_000;
            System.out.println(x1);
        }
    }

    public static void number2() {
        double x1 = 1.0;
        while (x1 < 101.5) {
            x1 = x1 + 0.5;
            System.out.println(x1);
        }
    }

    public static void number3() {
        int letterCode = 97;
        while (letterCode <= 122) {
            char letter = (char) letterCode;
            System.out.println(letter);
            letterCode++;
        }
    }



    public static void number4() {
        int letterCode = 1072;
        while (letterCode < 1104) {
            char letter = (char) letterCode;
            System.out.println(letter);
            letterCode++;
        }
    }

    public static void number6() {


        try {

            BufferedReader reader = new BufferedReader(new FileReader("123.txt"));
            String sicretWord = reader.readLine();
            String tip = reader.readLine();
            System.out.println(sicretWord);

            String word = tip;
            Scanner scanner = new Scanner(System.in);

            while (!Objects.equals(word, sicretWord)){
                System.out.println(tip.equals(word)+ " Это не загаданное слово");
                System.out.print("Введите слово : ");
                word = scanner.nextLine();
                if (word.contains("Соба")){
                    System.out.println("Горячо");
                }else {
                    System.out.println("Холодно");
                }

            }
            System.out.println("Вы ввели загаданное слово");



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void number5() throws IOException {
        int x = 0;
        while (x < 10000) {
            File file = new File("files/" + x);
            file.createNewFile();
            x = x + 1;
        }
    }
}

