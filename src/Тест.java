import MyClass27Inheritance.ITunesAudioBook;

import java.time.LocalDate;
import java.util.Scanner;

public class Тест {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год : ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц : ");
        int month = scanner.nextInt();
        System.out.println("Введите дату месяца : ");
        int dayOfMonth = scanner.nextInt();

        LocalDate start = LocalDate.of(year,1,1);
        LocalDate end = LocalDate.of(year,month,dayOfMonth);

        while (start.isBefore(end)){
            System.out.println(start);
            start = start.plusDays(1);
        }
    }
}
