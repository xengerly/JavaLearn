package SecondClass29;

import java.io.File;

public class MyClass30 {
    public static void main(String[] args) {
        File input = new File("The Terminator.m4v");
        StandardFile file = new StandardFile(input);
        File mile = new File("8 Mile.m4v");
        TextFile textFile = new TextFile(mile);

        StandardFile newFile = file;
    }
}
