package Dz28;

public class Moderator extends Admin{
    String access;

    public Moderator(String userName, String gmail, String nameAdministrator, String access) {
        super(userName, gmail, nameAdministrator);
        this.access = access;
    }


     void print (){
         System.out.println("Имя пользователя : " + userName);
         System.out.println("Почта пользователя :" + gmail);
         System.out.println("Имя администратора : " + nameAdministrator);
         System.out.println("Доступ модератора : " + access);
    }
}
