package Dz28;

public class Moderator extends User{

   String nameModerator;

   Moderator(String userName,String email,String nameModerator){
      super(userName,email);
      this.nameModerator = nameModerator;
   }

}
