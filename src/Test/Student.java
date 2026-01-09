package Test;

public class Student extends Person{
    String studentId;
    Student(String name, int age , String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void display(){
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}
