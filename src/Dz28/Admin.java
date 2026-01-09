package Dz28;

public class Admin extends User {
    String nameAdministrator;

    public Admin(String userName, String gmail, String nameAdministrator) {
        super(userName, gmail);
        this.nameAdministrator = nameAdministrator;
    }
}
