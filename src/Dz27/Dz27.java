package Dz27;

public class Dz27 {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem("Windows");
        OperatingSystem operatingSystem1 = new OperatingSystem("Linux");

        WebSite webSite = new WebSite("GitHub", "https://www.github.com", "GitHub, Inc.");
        WebSite webSite1 = new WebSite("Google", "https://www.google.com");
        webSite.displayInfo();
        webSite1.displayInfo();




    }
}
