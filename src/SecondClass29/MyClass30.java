package SecondClass29;

import java.io.File;

public class MyClass30 {
    public static void main(String[] args) {

        File mile = new File("8 Mile.m4v");
        TextFile textFile = new TextFile(mile);

        StandardFile standard = textFile;

        System.out.println(textFile.lineCount);
        System.out.println(textFile.filaName);
        System.out.println(standard.filaName);
    }
}
