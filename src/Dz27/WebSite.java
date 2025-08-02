package Dz27;

public class WebSite {
    String name;
    String url;
    String owner;

    WebSite(String name,String url , String owner){
        this.name = name;
        this.url = url;
        this.owner = owner;
    }

    WebSite(String name,String url){
        this.name = name;
        this.url = url;
        this.owner = "Неизвестен";
    }
    void displayInfo(){
        System.out.println("Название " + name + ",  URL:  " + url + ", Владелец " +  owner);
    }
}
