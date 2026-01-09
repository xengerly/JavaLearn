import java.util.Scanner;

public class  Dz7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        task1();

    }

    public static void task1() {

        System.out.print("Enter expression: ");

        System.out.println("Введите x :");
        int x = scanner.nextInt();
        System.out.println("Введите оператор : ");
        char operator = scanner.next().charAt(0);
        System.out.println("Введите y :");
        int y = scanner.nextInt();


        if (operator == '+') {
            System.out.println(x+y);
        } else if (operator == '-') {
            System.out.println(x + y);
        } else if  (operator=='*'){
            System.out.println(x*y);
        }else if (operator=='/'){
            System.out.println(x/y);        }
    }
}
