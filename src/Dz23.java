public class Dz23 {
    public static void main(String[] args) {

        join3("п", "р");
        join3("о", "г", "р");
        join3("а", "м", "м", "а");
    }

    static void max1(int x, int y) {
        x = 10;
        y = 12;
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }

    static void max1(String str1, String str2) {
        str1 = "Дорога";
        str2 = "Дуга";
        if (str1.length() > str2.length()) {
            System.out.println(str1);
        } else {
            System.out.println(str2);
        }
    }

    static boolean and(boolean x, boolean y) {
        return x && y;
    }

    static boolean and(boolean x, int y) {
        return x && (y != 0);
    }
    static boolean and(int x ,boolean y){
        return (x !=0) && y;
    }

    static void join3(String s1, String s2) {
        System.out.print(s1 + s2);

    }

    static void join3(String s1, String s2, String s3) {
        System.out.print(s1 + s2 + s3);


    }

    static void join3(String s1, String s2, String s3, String s4) {
        System.out.print(s1 + s2 + s3 + s4);


    }

}