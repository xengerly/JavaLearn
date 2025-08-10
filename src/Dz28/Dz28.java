package Dz28;

public class Dz28 {
    public static void main(String[] args) {

        Directory directory = new Directory("БЛабла",10);
        System.out.println(directory.name + " " + directory.limit);

        Directory directory1 = new Directory(13);
        System.out.println(directory1.limit);

        User user = new User("Ivan","xengerly@gmail.com");
        Moderator moderator = new Moderator("Ivan","name@gmail.com","Alex");
        Admin admin = new Admin("Ivan","blabbla","Джон",24);



    }
}
