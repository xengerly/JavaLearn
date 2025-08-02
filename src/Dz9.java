import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Dz9 {
    public static void main(String[] args)  {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите строку : ");
         String str = scanner.nextLine();





         String qwe =  revers(str);
        System.out.println(qwe);


    }

    public static String revers(String format) {

        return new StringBuilder(format).reverse().toString();
    }
}
