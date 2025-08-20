package Dz28;

public class Directory extends File {
    int limit;
    String string;

    Directory(int inputLimit){
        super(String.valueOf(inputLimit));
        this.limit = inputLimit;
    }

    Directory(String inputString,int inputLimit){
        super(inputString);
        this.limit = inputLimit;
        this.string = inputString;
        System.out.println(string + " " + limit);
    }
    
}
