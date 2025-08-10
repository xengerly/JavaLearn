package SecondClass29;

import java.io.File;

public class StandardFile {
    File inputFile;
    String filaName;

    StandardFile(File input){
        this.inputFile = input;
        this.filaName = input.getName();
    }

    String getInfo(){
        return this.filaName + ":" + this.inputFile;
    }


}
