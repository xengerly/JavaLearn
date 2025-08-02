public class Dz24 {
    public static void main(String[] args) {
        int size = 10;
        int[][] numbers = new int[size][size];



    }

    public static void multiplicationTableFrom0To9() {
        int size = 10;

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int row = 2; row < size; row++) {
            for (int col = 1; col < size; col++) {
                int mult = row * col;
                if (mult >= 10) {
                    System.out.print(mult + " ");
                } else {
                    System.out.print(mult + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void multiplicationTableFrom0To20() {
        int size = 20;

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "  ");
        }
        for (int i = 10; i < 20; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int row = 2; row < size; row++) {
            for (int col = 1; col < size; col++) {
                int mult = row * col;
                if (mult >= 100) {
                    System.out.print(mult + " ");
                } else if (mult >= 10) {
                    System.out.print(mult + "  ");
                } else {
                    System.out.print(row + "   ");
                }
            }
            System.out.println("");
        }
    }

    public static void printEachElementTheArray() {
        int[][] numbers = {{10, 30, 23}, {45, 764, 74}, {35, 2, 78}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }


    }

    public static void printFirstArray() {
        int[][] charArray = {{10, 23, 4}, {12, 2, 9}, {1, 4, 2}};
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(charArray[i][j]);
            }
        }
    }

    public static void printTheMatrixTheMultiplicationTable(int[][] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int row = 2; row < numbers.length; row++) {
            for (int col = 1; col < numbers.length; col++) {
                int mult = row * col;
                if (mult >= numbers.length) {
                    System.out.print(mult + " ");
                } else {
                    System.out.print(mult + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void printAlphabetLatin() {
        char[][] charArray = new char[26][1];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i][0] = (char) ('a' + i);
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i][0] + " ");
        }
    }

    public static void printRussAlphabet() {
        char[][] charArray = new char[32][1];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i][0] = (char) ('а' + i);
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i][0] + " ");
        }
    }
}
