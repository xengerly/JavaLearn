import java.io.IOException;

public class Dz19_This {
    public static void main(String[] args) throws IOException {

        PrintetThis printetThis1 = new PrintetThis();
        printetThis1.x1 = 9;
        printetThis1.x2 = 6;
        printetThis1.x3 = 4;

        PrintetThis printetThis2 = new PrintetThis();
        printetThis2.x1 = 9;
        printetThis2.x2 = 60;
        printetThis2.x3 = 4;

        PrintetThis printetThis3 = new PrintetThis();
        printetThis3.numbers = new int[]{4, 6, 2};

        PrintetThis printetThis4 = new PrintetThis();
        printetThis4.str1 = "пр";
        printetThis4.str2 = "ив";
        printetThis4.str3 = "ет";

        // printetThis1.maximumNumberThreeNumbers();
        printetThis2.maximumNumberThreeNumbers2(); //этот пример не работает так как есть логическая ошибка внутри принтед теста
        // printetThis4.oneBigLine();


    }
}
