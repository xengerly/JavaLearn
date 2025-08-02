public class Dz2 {
    public static void main(String[] args) {
        // Задание 1
        int z = 3;
        int c = 25;
        double result = Math.pow(z, c);
        if (result > 1_000_000_000) {
            System.out.println("Степень это мощь");
        }


//Задание 2
        int m = 4;
        if (m >= 0) {
            System.out.println("ПОЗИТИВ");
        } else {

            System.out.println("НЕГАТИВ");
        }

        // Задание 3
        int q = 15_000_000;
        double w = Math.sqrt(q);
        if (w < 5000) {
            System.out.println("два измирения лучше,чем одно");
        }

        // Задание 4
        int r = 2;
        int t = 10;
        double result4 = Math.pow(r, t);
        if (result4 < 512) {
            System.out.println("Pentium2");
        } else {
            System.out.println("ARM");
        }


// Задание 5
        double a = 3.25;
        double b = 12.25;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
// Задаине 6
        int first = 3;
        int second = 15;
        System.out.println(Math.pow(first, second));
        System.out.println(Math.pow(second, first));

        // Задание 7

        int x = 3;
        int y = 8;
        if (Math.pow(x, y) > Math.pow(y, x)) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        // Задание 8
        int v = 0;
        while (v < 100) {
            v = v + 1;
            System.out.println(v);
        }

        // Задание 9

        int n = 50;
        while (n != 101) {
            System.out.println(n);
            n = n + 1;
        }

        // Задание 10
        int i = 101;
        while (i > 1) {
            i = i - 1;
            System.out.print(i + ",");
        }
        System.out.println();
        // Задание 11

        int p = 1;
        while (p > -100) {
            p = p - 1;
            System.out.print(p);
            System.out.println();


        }

        // Задание 13

        String str = "Я буду программистом";
        String srt2 = str.toUpperCase();
        System.out.println(srt2);


        // Задание 12

        String name = "Доооо";
        String name2 = name.replaceAll("оооо", "обро");
        System.out.println(name2);


        // Задание 14
        String java = "Яблако";
        String java2 = java.replaceAll("а", "@");
        String java3 = java.replaceAll("o", "0");

        System.out.println(java2);
        System.out.println(java3);


        // Задание 15
        String line = "Если пропала консоль и ты не можешь ее вернуть";// Текст
        String line2 = "Проблема с консолью вне экрана";// Текст
        int resultLine1 = line.length();// Длинна
        int resultLine2 = line2.length();// Длинна
        System.out.println(resultLine1);
        System.out.println(resultLine2);
        if (resultLine1 > resultLine2) {
            System.out.println(line);
        } else {
            System.out.println(line2);
        }


        int aa = 5;
        int bb = 10;
        int cc = 15;
        int resABC;

        if (aa > bb) {
            if (aa > cc) {
//a
                resABC = aa;
            } else {
//c
                resABC = cc;
            }
        } else {
            if (bb > cc) {
//b
                resABC = bb;
            } else {
                //c
                resABC = cc;
            }
        }
        System.out.println(resABC);

    }
}
