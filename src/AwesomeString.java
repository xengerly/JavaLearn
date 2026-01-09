import java.util.Scanner;

public class AwesomeString {
    String name;
    String str;
    Scanner scanner;


    AwesomeString(){
        this.scanner = new Scanner(System.in);
        System.out.println("Default AwesomeString constructor works. Please specify input: ");
        this.str = scanner.nextLine();
    }

    AwesomeString(String inputStr){
        this.str = inputStr;
        this.scanner =  new Scanner(System.in);
    }

    AwesomeString(int num){
        this.str = String.valueOf(num);
        this.scanner = new Scanner(System.in);
    }


    void  readString(){
        System.out.println(this.name + " input : ");
        this.str = this.scanner.nextLine();
    }
}
