package MyClassInterface;

public class Donkey implements Speakable{
    @Override
    public void speak(String str) {
        System.out.println(str + "! Иа-иа");
    }

    @Override
    public void introduceYourself() {
        System.out.println("Я ослик");
    }
}
