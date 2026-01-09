package Extends;

import Dz29.Moderator;

public class User extends  Administrator{
    String userName;

    void printInfo(){
        System.out.println("Имя пользователя : " + this.userName );
        System.out.println("Имя модератора : " + this.nameModerator);
        System.out.println("Имя администратора : " + this.nameAdministrator);
    }


}
