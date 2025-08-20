import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Dz30 {
    public static void main(String[] args) {
        printDateCurrentYear();
    }

    static void printDateCurrentYear() {
        LocalDate endOgf2025 = LocalDate.of(2025, 12, 31);
        LocalDate currentDate = LocalDate.of(2025, 1, 1);

        while (currentDate.isBefore(endOgf2025)) {
            System.out.println(currentDate);
            currentDate = currentDate.plusDays(1);
        }
    }

    static void printFlightTime() {
        LocalDateTime now = LocalDateTime.of(2020, 1, 1, 12, 0);
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(now, zoneId);
        System.out.println(zonedDateTime.plusHours(10).plusMinutes(15));
        ZoneId tokyo = ZoneId.of("Asia/Vladivostok");
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of(String.valueOf(tokyo)));
        System.out.println(zonedDateTime1.plusHours(10).plusMinutes(15));
    }

    static void arrivalTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.println("Введите месяц числом");
        int month = scanner.nextInt();
        System.out.println("Введите дату ");
        int day = scanner.nextInt();

        LocalDate currentDate = LocalDate.of(2025, 1, 1);
        LocalDate enfOf2025 = LocalDate.of(year, month, day);

        while (currentDate.isBefore(enfOf2025)) {
            System.out.println(currentDate);
            currentDate = currentDate.plusDays(1);

        }

    }
}
