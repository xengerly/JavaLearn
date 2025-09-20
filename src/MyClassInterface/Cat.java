package MyClassInterface;

public class Cat implements Speakable {

    @Override
    public void speak(String str) {
        System.out.println(str + ", мяу мяу...");
    }

    @Override
    public void introduceYourself() {
        System.out.println("Я кот");
    }
}
