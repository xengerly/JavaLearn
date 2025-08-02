import java.util.Scanner;

public class poiskMasiv {
    public static void main(String[] args) {


    int [] [] Gorizontal = {
            {1,2,3},
            {5,4,5},
            {5,5,5}
    };

    int [] [] Vertikal = {
            {5,3,5},
            {5,8,2},
            {5,5,0}
    };

    int [] [] DiogonalLeft = {
            {5,7,8},
            {2,5,1},
            {4,6,5}
    };
    int [] [] DiogonalRight = {
            {2,1,5},
            {7,5,0},
            {5,4,5}
    };


        System.out.println(poisGorizontal(Gorizontal));
        System.out.println(poisGorizontal(Vertikal));
        System.out.println(poisGorizontal(DiogonalLeft));
        System.out.println(poisGorizontal(DiogonalLeft));
        System.out.println();
        System.out.println(poiskVertikal(Gorizontal));
        System.out.println(poiskVertikal(Vertikal));
        System.out.println(poiskVertikal(DiogonalLeft));
        System.out.println(poiskVertikal(DiogonalRight));
        System.out.println();
        System.out.println(poiskDiogonalLeft(DiogonalLeft));
        System.out.println(poiskDiogonalLeft(Gorizontal));
        System.out.println(poiskDiogonalLeft(Vertikal));
        System.out.println();
        System.out.println(poiskDiogonalRight(Gorizontal));
        System.out.println(poiskDiogonalRight(Vertikal));
        System.out.println(poiskDiogonalRight(DiogonalLeft));
        System.out.println(poiskDiogonalRight(DiogonalRight));



    }
    public static boolean poisGorizontal(int [] [] masiv){
        for (int i = 0; i < masiv.length; i++) {
            int acamulator = 0;
            for (int j = 0; j < masiv.length; j++) {
                int number = masiv[i][j];

                if (number == 5){
                    acamulator++;
                }
                if (acamulator == masiv.length){
                    return true;
                }
            }
        }
        return false;
    }

    public  static  boolean poiskVertikal (int [][] masiv){
        for (int i = 0; i < masiv.length; i++) {
            int acamulator = 0;
            for (int j = 0; j < masiv.length; j++) {
                int number = masiv[j][i];

                if (number == 5){
                    acamulator++;
                }
                if (acamulator == masiv.length){
                    return true;
                }
            }
        }
        return false;
    }

    public static  boolean poiskDiogonalLeft(int [] [] masiv){
        int acamulator = 0;
        for (int i = 0; i < masiv.length; i++) {
            int number = masiv[i][i];

            if (number == 5){
                acamulator++;
            }
            if (acamulator == masiv.length){
                return true;
            }
        }
        return false;
    }

    public  static  boolean poiskDiogonalRight(int [] [] masiv){
        int acamulator = 0;
        for (int i = 0; i < masiv.length; i++) {
            int number = masiv[masiv.length - 1-i][i];

            if (number == 5){
                acamulator++;
            }
            if (acamulator == masiv.length){
                return true;
            }

        }
        return false;
    }


}
