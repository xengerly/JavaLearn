public class Dz12 {
    public static void main(String[] args) {



    }

    public static void printRussianAlphabet() { // Выведите буквы от а до я

        char firstLetter = 1040;
        char lastLetter = 1072;

        for (char letter = firstLetter; letter < lastLetter; letter++) {
            System.out.println(letter);
        }
    }

    public static void printTenRussianLetter1() {// выведите десять букв в алфавите после буквы й

        char firstLetter  =  1081;
        char lastLetter  =  1092;

        for (char letter = firstLetter; letter < lastLetter; letter++) {
            System.out.println(letter);
        }
    }

    public static void printTenRussianLetter2() { // выведите десять букв в алфавите, идущие до буквы ю

        char firstLetter = 1092;
        char lastLetter = 1103;

        for (char letter = firstLetter; letter < lastLetter; letter++) {
            System.out.println(letter);
        }
    }

    public static void printEverySecondLetterOfTheRussianAlphabet() { // выведите каждую вторую букву алфавита (а, в, д)

        char firstLetter = 1040;
            char lastLetter = 1072;

        for (char letter = firstLetter; letter < lastLetter;letter = (char) (letter+2)) {
            System.out.println(letter);
        }
    }

    public static void printEveryThirdLetterOfTheEnglishAlphabet() { // выведите каждую третью букву латинского алфавита
        char firstLetter = 65;
        char lastLetter = 90;
        for (char letter = firstLetter; letter < lastLetter; letter = (char) (letter+3)){
            System.out.println(letter);
        }
    }
    public static void printGreekAlphabet(){ //  выведите греческий алфавит через запятую
        char firstLetter  = 945;
        char lastLetter = 969;

        for (char letter = firstLetter; letter < lastLetter;letter++){
            System.out.print(letter + ",");
        }
        
    }

}





