import java.util.Objects;
import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {
        // Задание 2 +

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку :");
        String x1 = scanner.next();
        System.out.println("Длинна строки :" + x1.length());

        // Задагие 3 +


        System.out.println("Введите первую строку :");
        String x2 = scanner.next();


        System.out.println("Введите вторую строку :");
        String x3 = scanner.next();

        int x4 = x2.length() + x3.length();
        System.out.println("Длинна двух строк :" + x4);


        // Задание 4 +

        System.out.println("Введите строку x :");
        String x = scanner.next();


        System.out.println("Введите строку y :");
        String y = scanner.next();


        System.out.println("Введите строку z :");
        String z = scanner.next();

        String min = "";
        int x5 = x.length();
        int y2 = y.length();
        int z2 = z.length();

        if (x5 <= y2) {
            if (z2 < x5) {
                min = z;
            } else {

                min = x;
            }
        }
        if (y2 <= x5) {
            if (z2 < y2) {

                min = z;
            } else {

                min = y;
            }
        }
        System.out.println("Минимальная длинна строки : " + min);

        // Задание 5

        System.out.println("Введите первое дробное число : ");
        double  value1 = scanner.nextDouble();

        System.out.println("Введите второе дробное число : ");
        double value2 = scanner.nextDouble();

        System.out.println("Введите третье дробное число : ");
        double  value3 = scanner.nextDouble();

        double sqrt1 = Math.sqrt(value1);
        double sqrt2 = Math.sqrt(value2);
        double sqrt3 = Math.sqrt(value3);

        if (sqrt1<2){
            System.out.println(sqrt1);
        }
        if (sqrt2<2){
            System.out.println(sqrt2);
        }
        if (sqrt3<2){
            System.out.println(sqrt3);
        }





        // Задание 6
        //int x = 1;
        //while (x>=-3) {
        //      System.out.print(x);
        //    x = x - 1;
        // } 16  раз вывело x

        // Задание 7
        // String str = "Hell";
        // while (str.length()<10) {
        //      str = str + "o";
        // } 13 раз

        // Задание 9


        System.out.println("Введите строку : ");
        String scanner1 = scanner.next();
        String sub = scanner1.substring(0, 5);
        System.out.println(sub);

        // Задание 10

        System.out.println("Введите строку : ");
        String tr = scanner.next();

        if (Objects.equals(tr, "true")){
            System.out.println("Истина");
        }

        // Задание 11

        System.out.println("Введите первое число : ");
        double number1 = scanner.nextDouble();

        System.out.println("Введите второе число : ");
        double number2 = scanner.nextDouble();

        System.out.println("Введите третье число : ");
        double number3 = scanner.nextDouble();

        boolean even = number1 % 2 == 0 || number2 % 2 == 0 || number3 % 2 == 0;
        boolean  isNegative = number1 < 0  || number2 < 0 || number3 < 0 ;
        boolean  thousand = number1 > 1000 || number2 > 1000 || number3 > 1000;

        if (even) {
            System.out.println("есть четные числа");
        }
        if (isNegative){
            System.out.println("есть отрицательные числа");
        }
        if (thousand){
            System.out.println("Есть числа больше 1000");
        }

        // Задание 12
        System.out.println("Введите  первую строку : ");
        String string1 = scanner.next();

        System.out.println("Введите вторую строку : ");
        String string2 = scanner.next();

        System.out.println("Введите третье строку : ");
        String string3 = scanner.next();

        int line1 = string1.length();
        int line2 = string2.length();
        int line3 = string3.length();
        int min1 = 0 ;

        if (line1<line2) {
            if (line1<line3){
                min1 = line1;
            }else {
                min1 = line3;
            }
        }else {
            if (line2<line3){
                min1 = line2;
            }else {
                min1 = line3;
            }
        }


        String subs1 = string1.substring(0,min1);
        String subs2 = string2.substring(0,min1);
        String subs3 = string3.substring(0,min1);

        System.out.println(subs1);
        System.out.println(subs2);
        System.out.println(subs3);




    }
}
