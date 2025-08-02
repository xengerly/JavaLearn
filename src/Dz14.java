import java.util.Scanner;

public class Dz14 {
    public static void main(String[] args) {

        number3();
    }

    public static void number1() { // Пользователь вводит 10 чисел, сохраните их в массив
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];

        int currentIndex = 0;
        while (currentIndex < 10) {
            a[currentIndex] = scanner.nextInt();
            currentIndex++;

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    public static void number2() { // Сохраните 10 чисел в массив, выведите их с конца
        Scanner scanner = new Scanner(System.in);

        int[] a1 = new int[10];
        int currentindex1 = 0;

        while (currentindex1 <= a1.length) {
            a1[currentindex1] = currentindex1 * currentindex1 * currentindex1 +  10;
            currentindex1++;
        }
        for (int i = a1.length - 1; i > 0; i--) {
            System.out.println(a1[i]);
        }
    }
    public  static  void  number3(){ // Сохраните 10 строк в массив, выведите с конца каждую вторую
        Scanner scanner  = new Scanner(System.in);

        String [] words = new String[10];
        int currentIndex = 0;

        while (currentIndex <= 9){
            System.out.print("Введите слово : ");
            words[currentIndex] = scanner.nextLine();
            currentIndex++;
        }

        for (int i = 9; i >= 0; i = i - 2) {
            System.out.println(words[i]);
        }
    }

    public static void number4(){

    }

}
