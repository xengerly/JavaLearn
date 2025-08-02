import java.util.Random;

public class Massiv {
    public static void main(String[] args) {


        int[][] array = new int[4][4];
         //filArray(array);
        superMasiv(array);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(i + " " + j);
                System.out.println(array[i][j]);
            }

        }
    }

    private static int[][] filArray(int[][] masiv) {

        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv.length; j++) {
                masiv[i][j] = j;
            }
        }
        return masiv;
    }

    private static void superMasiv(int[][] megaMasiv) {
        int i = 0;
        int j = 0;
        while (i < megaMasiv.length) {
            while (j < megaMasiv.length) {
                megaMasiv[i][j] = j;
                j++;
            }
            i++;
        }
    }


}
