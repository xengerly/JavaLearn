public class Dz33 {
    public static void main(String[] args) {
        // ExampleDefaultValues exampleDefaultValues = new ExampleDefaultValues();
        // exampleDefaultValues.cat.sayMeow();
        arrayNull();
    }

    static void arrayNull() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
