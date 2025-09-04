import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dz32 {
    public static void main(String[] args) {
    fileNamesSaver();
    }
      static void fileNamesSaver() {
        Scanner scanner = new Scanner(System.in);
        String[] fileNames = new String[5];

        for (int i = 0; i < fileNames.length ; i++) {
            System.out.print("Введите название файла №" + (i + 1) + " :");
            fileNames[i] = scanner.next();
        }

        for (int i = 0; i < fileNames.length; i++) {
            String currentFileName = fileNames[i];

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFileName))) {
                for (int j = 0; j < fileNames.length; j++) {
                    writer.write(fileNames[j]);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при работе с файлом '" + currentFileName + "': " + e.getMessage());
            }
        }
    }
}
