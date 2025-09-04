import java.util.Locale;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();//Создаем экземпляр класса
        calculator.run();

        class Calculator {
            private  Scanner scanner = new Scanner(System.in);



            public void run(){
                while (true){
                    double a = inputNumber("a");
                    char operator = inputChar();
                    double b = inputNumber("b");

                    double result = 0;
                    if (operator == '+'){
                        result =plus(a,b);
                    } else if (operator == '-') {
                        result = minus(a,b);
                    } else if (operator == '*') {
                        result = ymnojenie(a,b);
                    } else if (operator == '/') {
                        result = delenie(a,b);
                    }
                    System.out.println("Ваш итоговый результат " + result);
                    System.out.println("Что бы выключить программу напишите 'end'");

                    String end = scanner.next().toLowerCase();
                    if (end.equals("end")){
                        System.out.println("Досвидания");
                        break;
                    }

                }
            }




            private double inputNumber(String numberMane){
                while (true){
                    System.out.println("Введите число");
                }
            }


            private char inputChar() {
                while (true) {
                    System.out.println("Введите оператор + - * / ");
                    String command = scanner.next();
                    char operator = command.charAt(0);

                    if (operator == '+'){
                        return operator;
                    } else if (operator == '-') {
                        return operator;
                    } else if (operator == '*') {
                        return operator;
                    } else if (operator == '/') {
                        return operator;
                    }else {
                        System.out.println("Вы ввели некоректный оператор");
                    }
                }
            }




            private double plus(Number num1, Number num2) {
                double result = num1.doubleValue() + num2.doubleValue();
                return result;
            }

            private double minus(Number num1, Number num2) {
                double result = num1.doubleValue() - num2.doubleValue();
                return result;
            }

            private double ymnojenie(Number num1, Number num2) {
                double result = num1.doubleValue() * num2.doubleValue();
                return result;
            }

            private double delenie(Number num1, Number num2) {
                double result = num1.doubleValue() / num2.doubleValue();
                return result;
            }

        }

    }
}
