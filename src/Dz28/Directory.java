package Dz28;

public class Directory extends File {
    int limit;

    Directory(int inputLimit){
        super(String.valueOf(12));
        this.limit = inputLimit;
    }

    Directory(String inputString,int inputLimit){
        super("Name");
        this.limit = inputLimit;
    }

}
