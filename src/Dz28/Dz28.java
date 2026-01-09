package Dz28;

public class Dz28 {
    public static void main(String[] args) {

        File file = new File("Курица", 38,400);
        file.print();
        System.out.println();
        Moderator moderator = new Moderator("xengerly","xengerly@gmail.com","DiabloZ","FULL");
        moderator.print();
    }
}
