import java.io.File;
import java.io.IOException;
import java.util.*;

public class MySecondClass2 {
    public static void main(String[] args) throws IOException {
        Animal animal = new Animal();
        Animal cat = new Cat1();
        Animal dog = new Dog();

        Animal[] animals = new Animal[6];
        animals[0] = animal;
        animals[1] = cat;
        animals[2] = dog;
        animals[3] = (Animal) new Cat1();
        animals[4] = new Dog();
        //animals[5] = (Animal) new String("ds");
        Cat1 cat1 = (Cat1) cat;
        animals[5] = cat1;

        for (int i = 0; i < animals.length - 1; i++) {
            System.out.println(animals[i]);
            animals[i].voice();
        }
    }
}

class Animal {
    String name;

    public void voice() {
        System.out.println("Голос");
    }
}


class Cat1 extends Animal {
    @Override
    public void voice() {
        System.out.println("Мяу-Мяу");
    }
}


class Dog extends Animal {
    public void voice() {
        System.out.println("Гав-Гав");
    }
}



