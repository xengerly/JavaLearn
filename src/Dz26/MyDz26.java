package Dz26;

public class MyDz26 {
    public static void main(String[] args) {
        System.out.println();

        Admin admin = new Admin();
        admin.userName = "xengerly";
        admin.country = "Russia";
        admin.city = "Moscow";
        admin.nameCompany = "СБЕР";
        admin.printInformation();

        System.out.println();

        Moderator moderator = new Moderator();
        moderator.userName = "water";
        moderator.country = "USA";
        moderator.city = "New York";
        moderator.accessLevel = "Full";
        moderator.printInformation();

        System.out.println();

        mainCharacter character = new mainCharacter();
        character.characterAge = "23";
        character.characterGrowth = "169";
        character.nameMainCharacter = "Angel";
        character.printCharacter();

        System.out.println();

        Villain villain = new Villain();
        villain.characterAge = "20";
        villain.characterGrowth = "230";
        villain.nameVillain = "Хел";
        character.printCharacter();

        System.out.println();

        FriendMainCharacter friendMainCharacter = new FriendMainCharacter();
        friendMainCharacter.characterAge = "34";
        friendMainCharacter.characterGrowth = "184";
        friendMainCharacter.nameBestFriend = "Alon";
        friendMainCharacter.printCharacter();



    }
}
