import java.util.Scanner;

public class ExampleDefaultValues {
    public int x;
    public boolean bool;
    public double dbl;
    Cat cat;
    public Scanner scanner;

    public void m7(){
        System.out.println("7");
        int x = 3;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            System.out.println(stackTrace[i]);
        }
    }
}
