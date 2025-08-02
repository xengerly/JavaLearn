import java.sql.SQLOutput;

public class Printer {

    String maker;
    int price;




    Printer (String inputMaker, int inputPrice){
        this.maker = inputMaker;
        this.price = inputPrice;
    }

    Printer(String inputMaker){
        this.maker = inputMaker;
    }

    Printer(){
        System.out.println("Вот такие дела ");
    }

    void init (String inputMaker,int inputPrice){
        this.maker = inputMaker;
        this.price = inputPrice;
    }

    void init(String inputMaker){
        this.maker = inputMaker;
    }


    static void myMethod() {
        System.out.println("Hello world");
    }

    void writePrinterInfo() {
        System.out.println("Im printer");
        System.out.println("My name; is " + this.maker);
        System.out.println("My price " + this.price);
    }

   void decreasePrice() {
        this.price = this.price - 10;
    }
}
