package Dz29;

import java.io.File;

public class Admin extends  Moderator {
  int age;


  Admin(int age, String name){
      super(name);
      this.age = age;
      System.out.println("Конструктор Admin с age = " + age);
  }

}
