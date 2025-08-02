public class Masiv2 {
    public static void main(String[] args) {


        int[][] arrayVertikal = {
                {7, 5, 14},
                {5, 5, 2},
                {6, 5, 11}
        };
        int[][] arrayDiaganalLeft = {
                {5, 3, 1},
                {7, 5, 2},
                {4, 6, 5}
        };
        int[][] arrayDiaganalRight = {
                {14, 3, 5},
                {7, 5, 2},
                {5, 6, 5}
        };
        int[][] arrayGorizontal = {
                {5, 3, 5},
                {4, 0, 2},
                {5, 5, 5}
        };


        System.out.println(poisVertikal(arrayVertikal));
        System.out.println(poisVertikal(arrayDiaganalLeft));
        System.out.println(poisVertikal(arrayDiaganalRight));
        System.out.println(poisVertikal(arrayGorizontal));
        System.out.println();
        System.out.println(poiskGorizontal(arrayVertikal));
        System.out.println(poiskGorizontal(arrayDiaganalLeft));
        System.out.println(poiskGorizontal(arrayDiaganalRight));
        System.out.println(poiskGorizontal(arrayGorizontal));
        System.out.println();
        System.out.println(poiskDiogonal(arrayVertikal));
        System.out.println(poiskDiogonal(arrayDiaganalLeft));
        System.out.println(poiskDiogonal(arrayDiaganalRight));
        System.out.println(poiskDiogonal(arrayGorizontal));


    }


    public static boolean poiskGorizontal(int[][] masiv2) {
        for (int i = 0; i < masiv2.length; i++) {
            int acamulator = 0;
            for (int j = 0; j < masiv2.length; j++) {
                int result = masiv2[i][j];

                if (result == 5) {
                    acamulator++;
                }
                if (acamulator == masiv2.length) {
                    return true;
                }
            }
        }
        return false;

    }


    public static boolean poisVertikal(int[][] masiv) {

        for (int i = 0; i < masiv.length; i++) {
            int acamulator = 0;
            for (int j = 0; j < masiv.length; j++) {
                int result = masiv[j][i];
                if (result == 5) {
                    acamulator++;
                }
                if (acamulator == masiv.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean poiskDiogonal(int[][] masiv) {
        int acamulatorLeft = 0;
        int acamulatorRight = 0;
        for (int i = 0; i < masiv.length; i++) {
            int resultLeft = masiv[i][i];
            int resultRight = masiv[masiv.length - 1 - i][i];
            if (resultLeft == 5) {
                acamulatorLeft++;
            }
            if (resultRight == 5) {
                acamulatorRight++;
            }
            if (acamulatorLeft == masiv.length) {
                return true;
            }
            if (acamulatorRight == masiv.length) {
                return true;
            }


        }
        return false;
    }


}

