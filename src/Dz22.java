public class Dz22 {
    public static void main(String[] args) {
        rename(new int[]{0});
    }

    public static int rename(int numbers[]) {
        numbers = new int[]{5, 3, 6, 42};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            } else {
                System.out.println(-1);
            }
        }
        return 0;
    }

}
