package Extends;

public class MyClass {
    public static void main(String[] args) {
        File file = new File();
        file.nameFile = "Кейс 32";
        file.nameFolder = "Desktop";
        file.printInfo();

        System.out.println();

        User user = new User();
        user.userName = "крокодил";
        user.nameModerator = "принц";
        user.nameAdministrator = "Kid";
        user.printInfo();

        System.out.println();

        ProtagonistsFriend friend = new ProtagonistsFriend();
        friend.namePersonage = "Спайдер мен";
        friend.nameHero = "Арсений";
        friend.nameVillain = "Бандит";
        friend.nameProtagonistsFriend = "John";
        friend.print();









    }
}
