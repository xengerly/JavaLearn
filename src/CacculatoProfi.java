import java.util.Locale;
import java.util.Scanner;

public class CacculatoProfi {
    public static void main(String[] args) {//Входная точка в калькулятор
        Calculator calculator = new Calculator();//Создаем экземпляр класса
        calculator.run();//Запуск калькулятора
        class calculator {//Создаем класс калькулятор
            private Scanner scanner = new Scanner(System.in);//Обьявляем сканер

            public void run() {//Обьявляем метод ран
                while (true) {//Запускаем бесконечный цикл
                    double a = inputNumber("a");//Обьявляем метод ввода
                    char operator = inputChar();//Обьявляем метод ввода
                    double b = inputNumber("b");//Обьявляем метод ввода

                    double result = 0; // Инцилизировал переменную result
                    if (operator == '+') {//Проверяем  введеный оператор
                        result = plus(a, b);// Присваиваем переменную
                    } else if (operator == '-') {//Проверяем  введеный оператор
                        result = minus(a,b);// Присваиваем переменную
                    } else if (operator == '*') {//Проверяем  введеный оператор
                        result = umnojenie(a,b);// Присваиваем переменную
                    } else if (operator == '/') {//Проверяем  введеный оператор
                        result = delenie(a,b);// Присваиваем переменную
                    }
                    System.out.println("Итоговое значание " + result);//Выводим
                    try {//Обработка ошибок
                        Thread.sleep(3000);//Усыпляем программу на 3 секунды
                    }catch (InterruptedException e){//Отлавливаем ошибки
                        throw new RuntimeException(e);
                    }
                    System.out.println("Для выхода, введите \"end\", в инном случае, программа будет запущенна вновь");//Выводим
                    String inputCommand = scanner.next().toLowerCase(Locale.ROOT);//Обьявляем строковую переменную которая из большик букв делает маленькие
                    if (inputCommand.equals("end")){//ПРоверка условия на ввод для окончания программы
                        System.out.println("Досвидания");//Выводим
                        break;//Останавливаем цикл
                    }
                }
            }

            private double inputNumber(String numberName) {//Создаем класс
                while (true) {//Запускаем бесконечный цикл
                    try {//Обработка ошибок
                        System.out.println("Введите число " + numberName);//Выводим
                        return Double.parseDouble(scanner.next());
                    } catch (Exception e) {//Отлавливаем ошибки
                        System.err.println(e.getMessage());//Выводим красным ошибку
                    }
                }
            }

            private char inputChar() {//Создаем класс
                while (true) {//Запускаем бесконечный цикл
                    System.out.println("Введите оператор + - * / ");//Выводим
                    String command = scanner.next();//Обьявляем строковую переменную
                    char operator = command.charAt(0);//Считываем оператор из сканера с нулевого индекса
                    if (operator == '+') {//Проверяем  введеный оператор
                        return operator;
                    } else if (operator == '-') {//Проверяем  введеный оператор
                        return operator;
                    } else if (operator == '*') {//Проверяем  введеный оператор
                        return operator;
                    } else if (operator == '/') {//Проверяем  введеный оператор
                        return operator;
                    } else {
                        System.out.println("Введен неверный оператор \"" + command + "\"");//Выводим
                    }
                }
            }

            private double plus(Number num1, Number num2) {//Создаем метод
                double result = num1.doubleValue() + num2.doubleValue();
                return result;
            }

            private double minus(Number num1, Number num2) {//Создаем метод
                double result = num1.doubleValue() - num2.doubleValue();
                return result;
            }

            private double umnojenie(Number num1, Number num2) {//Создаем метод
                double result = num1.doubleValue() * num2.doubleValue();
                return result;
            }

            private double delenie(Number num1, Number num2) {//Создаем метод
                double result = num1.doubleValue() / num2.doubleValue();
                return result;
            }
        }
    }
}
