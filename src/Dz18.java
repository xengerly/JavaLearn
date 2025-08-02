import java.util.Scanner;

public class Dz18 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        String word4 = scanner.next();
//        String word5 = scanner.next();

        // System.out.println(number1(10, 110));
        // System.out.println(number2(144,256));
        // System.out.println(number3(word1,word2,word3));
        // System.out.println(number4(word1, word2, word3, word4));
        //  System.out.println(findMax(numbersMax));
        int[] numbersMax = {50, 7, 8, 15};
        String[] words = {"Природа", "Аптека", "Машина", "Дорога", "Школа"};
        findMaxLengthFrom5Strings(words);


    }


    static int number1(int a, int b) {
        int max;
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double number2(double a, double b) {

        double x = Math.sqrt(a);
        double y = Math.sqrt(b);
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

    static String number3(String a, String b, String c) {
        String max = null;
        if (a.length() > b.length() && a.length() > c.length()) {
            max = a;
        } else if (b.length() > a.length() && b.length() > c.length()) {
            max = b;
        } else if (c.length() > a.length() && c.length() > b.length()) {
            max = c;
        }
        System.out.println(max);
        return max;
    }

    static String number4(String a, String b, String c, String d) {
        String max = null;
        if (a.length() > b.length() && a.length() > c.length() && a.length() > d.length()) {
            max = a;
        } else if (b.length() > a.length() && b.length() > c.length() && b.length() > d.length()) {
            max = b;
        } else if (c.length() > a.length() && c.length() > b.length() && c.length() > d.length()) {
            max = c;
        } else if (d.length() > a.length() && d.length() > c.length() && d.length() > b.length()) {
            max = c;
        }

        System.out.println(max);
        return max;
    }

    static String findMaxLengthFrom5Strings(String[] arrOfString) {
        int maxLength = 0;
        String longestWord = "";
        for (int i = 0; i < arrOfString.length; i++) {
            if (arrOfString[i].length() > maxLength) {
                maxLength = arrOfString[i].length();
                longestWord = arrOfString[i];
            }
        }
        System.out.println(longestWord);
        return longestWord;
    }

    static String number6(String a) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 != 0) {
                System.out.println(result.append(Character.toUpperCase(a.charAt(i))));
            } else {
                result.append(a.charAt(i));
            }
        }
        return a;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
