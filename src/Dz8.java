import java.util.Scanner;

public class Dz8 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      //  task1();
      //  task2();
       // task3();
    }

    public static void task1() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max = Math.max(x, y);
        System.out.println(max);

    }
    public  static  void task2(){

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

       String observation = x1 > y1 ? "x больше y" : "y больше  x";
        System.out.println(observation);


    }
    public  static  void  task3(){
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        int max =(x2 > y2 && x2 > z2) ? x2 : (y2>x2 && y2>z2) ? y2 :z2;
        System.out.println(max);

    }
}
