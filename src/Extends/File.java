package Extends;

public class File extends Directory {
    String nameFile;

    void printInfo(){
        System.out.println("Название файла : " + this.nameFile);
        System.out.println("Название папки : " + this.nameFolder);
    }
}
