package Dz28;

public class File extends Directory  {
        int price;


    public File(String productName, int idProduct, int price) {
        super(productName, idProduct);
        this.price = price;
    }

    void print(){
        System.out.println("Название продуката : " + productName);
        System.out.println("Номер товара : " + idProduct);
        System.out.println("Цена за продукт : " + price );
    }

}
