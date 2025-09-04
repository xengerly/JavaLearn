public class Cat {
    String name;
    int age;
    Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void sayMeow(){
        System.out.println("Meow! Im " + name);
    }
}
