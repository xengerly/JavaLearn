import java.io.IOException;

public class Dz19_This {
    public static void main(String[] args) throws IOException {

        PrinterThis printerThis1 = new PrinterThis();
        printerThis1.x1 = 9;
        printerThis1.x2 = 6;
        printerThis1.x3 = 4;

        System.out.println(printerThis1.maximumNumberThreeNumbers());

        PrinterThis printetThis2 = new PrinterThis();
        printetThis2.str1 = "пр";
        printetThis2.str2 = "ив";
        printetThis2.str3 = "ет";
        System.out.println(printetThis2.oneBigLine());



    }
}
