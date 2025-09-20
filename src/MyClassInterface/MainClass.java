package MyClassInterface;

public class MainClass {
    public static void main(String[] args) {
        Speakable speakable = new Cat();
        sayHello(speakable);
        Speakable speakable1 = new Dog();
        sayHello(speakable1);
        Speakable speakable2 = new Donkey();
        sayHello(speakable2);
    }

    public static   void  sayHello(Speakable speakable){
        speakable.introduceYourself();
        speakable.speak("Привет");
    }
}
