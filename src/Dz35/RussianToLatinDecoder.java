package Dz35;

public class RussianToLatinDecoder implements Decoder {

    public static void main(String[] args) {
        RussianToLatinDecoder russianToLatinDecoder = new RussianToLatinDecoder();

        System.out.println(russianToLatinDecoder.decode("dhgfdsfd"));
        System.out.println(russianToLatinDecoder.encode("э"));

    }


    @Override
    public String encode(String source) {

        StringBuilder builder = new StringBuilder();
        char[] sourceChars = source.toCharArray();
        for (int i = 0; i < sourceChars.length; i++) {
            switch (sourceChars[i]) {
                case 'й' -> builder.append('q');
                case 'ц' -> builder.append('w');
                case 'у' -> builder.append('e');
                case 'к' -> builder.append('r');
                case 'е' -> builder.append('t');
                case 'н' -> builder.append('y');
                case 'г' -> builder.append('u');
                case 'ш' -> builder.append('i');
                case 'щ' -> builder.append('o');
                case 'з' -> builder.append('p');
                case 'х' -> builder.append(' ');
                case 'ъ' -> builder.append(' ');
                case 'ф' -> builder.append('a');
                case 'ы' -> builder.append('s');
                case 'в' -> builder.append('d');
                case 'а' -> builder.append('f');
                case 'п' -> builder.append('g');
                case 'р' -> builder.append('h');
                case 'о' -> builder.append('j');
                case 'л' -> builder.append('k');
                case 'д' -> builder.append('l');
                case 'ж' -> builder.append(' ');
                case 'э' -> builder.append(' ');
                case 'я' -> builder.append('z');
                case 'ч' -> builder.append('x');
                case 'с' -> builder.append('c');
                case 'м' -> builder.append('v');
                case 'и' -> builder.append('b');
                case 'т' -> builder.append('n');
                case 'ь' -> builder.append('m');
                case 'б' -> builder.append(' ');
                case 'ю' -> builder.append(' ');

                default -> builder.append('*');
            }
        }
        return builder.toString();
    }

    @Override
    public String decode(String encoded) {
        StringBuilder builder = new StringBuilder();
        char[] sourceChars = encoded.toCharArray();
        for (int i = 0; i < sourceChars.length; i++) {
            switch (sourceChars[i]) {
                case 'q' -> builder.append('й');
                case 'w' -> builder.append('ц');
                case 'у' -> builder.append('у');
                case 'r' -> builder.append('к');
                case 't' -> builder.append('е');
                case 'y' -> builder.append('н');
                case 'u' -> builder.append('г');
                case 'i' -> builder.append('ш');
                case 'o' -> builder.append('щ');
                case 'p' -> builder.append('з');
                case 'a' -> builder.append('ф');
                case 's' -> builder.append('ы');
                case 'd' -> builder.append('в');
                case 'f' -> builder.append('а');
                case 'g' -> builder.append('п');
                case 'h' -> builder.append('р');
                case 'j' -> builder.append('о');
                case 'k' -> builder.append('л');
                case 'l' -> builder.append('д');
                case 'z' -> builder.append('я');
                case 'x' -> builder.append('ч');
                case 'c' -> builder.append('с');
                case 'v' -> builder.append('м');
                case 'b' -> builder.append('и');
                case 'n' -> builder.append('т');
                case 'm' -> builder.append('ь');

                default -> builder.append('*');
            }
        }
        return builder.toString();
    }
}
