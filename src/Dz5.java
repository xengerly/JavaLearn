import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dz5 {
    public static void main(String[] args) {
        // Задание 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int x = scanner.nextInt();

        System.out.print("Введите второе число : ");
        int y = scanner.nextInt();

        double z = Math.pow(y, x);
        System.out.println(z);

        // Задание 2 и 3

        System.out.println("Введите первое  число : ");
        int x1 = scanner.nextInt();

        System.out.println("Введите второе  число : ");
        int y1 = scanner.nextInt();



        double z2 = Math.pow(x1, y1);
        double z3 = Math.pow(z2, 3);
        System.out.println(z2);
        System.out.println(z3);


        // Заданиее 4

        System.out.print("Введите первую строку : ");
        String x2 = scanner.next();

        System.out.print("Введите вторую строку : ");
        String y2 = scanner.next();

        double line1 = x2.length();
        double line2 = y2.length();

        double math =  Math.abs(line1 - line2);
        System.out.println(math);

        // Задание 5 и 6

        System.out.println("Введите первую строку : ");
        String linee1 = scanner.next();

        System.out.println("Введите вторую строку : ");
        String linee2 = scanner.next();

        System.out.println("Введите третью строку : ");
        String linee3 = scanner.next();

        int result1 = linee1.length();
        int result2 = linee2.length();
        int result3 = linee3.length();

        int maxLength = max(result1,result2,result3);
        int minLength = min(result1,result2,result3);


        int resultLine = Math.abs(maxLength - minLength);
        System.out.println("Разница в длинне :  " + resultLine);

        // Задание 9

        int letterCode = 97;
        while (letterCode <= 122) {
            char letter = (char) letterCode;
            System.out.println(letter);
            letterCode++;
        }

        // Задание 11

        int start = 65;
        int end = 122;

        int randomBigFloor1 = ThreadLocalRandom.current().nextInt(start, end);

        System.out.println(
                Character.toChars(randomBigFloor1)
        );


        // Задание 12

        double random1 = Math.random();
        double randomBig1 = random1 * 11 + 12;
        double randomBigFloor5 = Math.floor(randomBig1);
        System.out.println(randomBigFloor5);


    }
    public static int max (Integer... vals) {

        return Collections.max(Arrays.asList(vals));
    }
    public  static  int min(Integer...vals){

        return  Collections.min(Arrays.asList(vals));
    }
}
