package Dz28;

public class Admin extends Moderator{
    int ageAdmin;

    Admin(String userName,String email,String nameModerator,int ageAdmin){
        super(userName,email,nameModerator);
        this.ageAdmin = ageAdmin;
    }

}
