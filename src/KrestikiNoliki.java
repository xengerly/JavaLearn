import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KrestikiNoliki {

    /*
    блок настроек игры
     */

    private static char[][] map;  // матрица игры
    private static int SIZE = 3;  // размерность поля

    private static final char DOT_EMPTY = '•';  // свободное поле
    private static final char DOT_X = 'X';  // кресьтик
    private static final char DOT_O = '0'; // нолик
    private static final boolean SILLY_MODE = false;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {

        initMap();
        printMap();


        while (true) {

            humanTurn(); // ход человека
            if (isEndGame(DOT_X)) {
                // break;
            }
            computerTurn(); // ход компьютера
            if (isEndGame(DOT_O)) {
                // break;
            }
            System.out.println("Игра закончена");
        }


    }
    /*
    Метод подготовки игрового поля
     */

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    private static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.println((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.println((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.println(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты ячейки через пробел");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;


    }

    /*
    Ход компьютера
     */
    private static void computerTurn() {
        int x = -1;
        int y = -1;

        if (SILLY_MODE) {
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(x, y));
        } else {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    // проверяем клетки по направлению

                }
            }
        }

        System.out.println("Компьютер выбрал ячейку" + (y + 1) + " " + (x + 1));
//        map[y][x] = DOT_O;
    }

    /*
     * Метод валидации запрашиваемой ячейки на корректность
     * @param x - координаты по горизонтали
     * @param y - координаты по вертикали
     * @return boolean - признак валидности
     */
    private static boolean isCellValid(int x, int y) {
        boolean result = true;

        // Проверка координаты
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            result = false;
        }

        // Проверка заполноности ячейки
        if (map[y][x] != DOT_EMPTY) {
            result = false;
        }


        return result;
    }

    private static boolean isEndGame(char playerSymbol) {
        boolean result = false;

        printMap();

        // проверка необходимости следующего хода
        if (checkWin(playerSymbol)) {
            System.out.println("Победили" + playerSymbol);
            result = true;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            result = true;
        }


        return result;
    }

    /*
     * Проверка на 100 %-ю заполненость поля
     * @return boolean признак оптимальности
     */
    private static boolean isMapFull() {
        boolean result = true;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    result = false;
                }
            }
        }
        return result;
    }

    private static boolean checkWin(char playerSymbol) {
        boolean result = false;

        if (chekPoGorizontali(playerSymbol)){
            return true;
        }
        if (chekPoVertikal(playerSymbol)){
            return true;
        }
        if (chekPoDiogonalLeft(playerSymbol)){

            return true;
        }
        if (chekPoDiogonalRight(playerSymbol)){
            return true;
        }


        return result;


    }

    private static boolean chekPoGorizontali(char playerSymbol) {


        for (int i = 0; i < SIZE; i++) {
            int acamulator = 0;
            for (int j = 0; j < SIZE; j++) {
                char krestik = map[i][j];

                if (krestik == playerSymbol) {
                    acamulator++;
                }
                if (acamulator == SIZE) {
                    return true;
                }

            }
        }
        return false;
    }

    private static boolean chekPoVertikal(char playerSymbol) {
        for (int i = 0; i < SIZE; i++) {
            int acamulator = 0;
            for (int j = 0; j < SIZE; j++) {
                char krestik = map[j][i];

                if (krestik == playerSymbol) {
                    acamulator++;
                }
                if (acamulator == SIZE) {
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean chekPoDiogonalLeft(char playerSymbol) {
        int acamulator = 0;
        for (int i = 0; i < SIZE; i++) {
            char krestik = map[i][i];

            if (krestik == playerSymbol) {
                acamulator++;
            }
            if (acamulator == SIZE) {
                return true;
            }
        }
        return false;
    }

    private static boolean chekPoDiogonalRight(char playerSymbol) {
        int acamulator = 0;
        for (int i = 0; i < SIZE; i++) {

            char krestik = map[SIZE - 1 - i][i];

            if (krestik == playerSymbol) {
                acamulator++;
            }
            if (acamulator == SIZE) {
                return false;
            }
        }
        return false;
    }


}
