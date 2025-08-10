package Dz28;

public class User {
    String userName;
    String email;

    User(String userName, String email){
        this.userName = userName;
        this.email = email;
        System.out.println("Создан User: " + userName);
    }

}
