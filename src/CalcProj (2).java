import java.util.Locale;
import java.util.Scanner;

 class CalcProj {//Здесь мы создаём класс

    public static void main(String[] args) {//тут у нас входная точка в приложениеы
        Calculator calculator = new Calculator();//здесь мы создаём экземпляр класса калькулятор
        calculator.run(); //здесь мы запускаем калькулятор
    }
}

class Calculator {//Здесь создаем класс калькулятор
    private Scanner scanner = new Scanner(System.in);//Здесь мы обьявляем сканер

    public void run() {//?!!!!!!!!!!!!!!!!!!!!!!!! Обявляем метод run()
        while (true) {//?!!!!!!!!!!!!!!!!!!!!!!!! Запускаем бесконечный цикл, так как в условии true, закончится он только по break или return
            double a = inputNumber("a");//?!!!!!!!!!!!!!!!!!!!!!!!! Используем метод ввода переменной
            char operator = inputChar();//?!!!!!!!!!!!!!!!!!!!!!!!! Используем метод ввода оператора
            double b = inputNumber("b");//?!!!!!!!!!!!!!!!!!!!!!!!! Используем метод ввода переменной

            double result = 0;//Инцилизировали переменную
            if (operator == '+') {//Проверяем введеный оператор
                result = plus(a, b);//Присваиваем переменную
            } else if (operator == '-') {//Проверяем введеный оператор
                result = minus(a, b);//Присваиваем переменную
            } else if (operator == '*') {//Проверяем введеный оператор
                result = ymnojenie(a, b);//Присваиваем переменную
            } else if (operator == '/') {//Проверяем введеный оператор
                result = delenie(a, b);//Присваиваем переменную
            }

            System.out.println("Ваш итоговое значение : " + result);//Выводим итоговое значание

            try {//?!!!!!!!!!!!!!!!!!!!!!!!! запускаем обработку ошибки
                Thread.sleep(3000);//Усыпляем программу на 3 секунды
            } catch (InterruptedException e) {//?!!!!!!!!!!!!!!!!!!!!!!!! говорим, что отлавливаем ошибки определенного типа, в данном случае InterruptedException
                throw new RuntimeException(e);//?!!!!!!!!!!!!!!!!!!!!!!!! так запускать новую ошибку, вообще тут должен быть просто вывод её, но что-то пошло не так.
            }

            System.out.println("Для выхода, введите \"end\", в инном случае, программа будет запущенна вновь");//Выводим условие
            String inputCommand = scanner.next().toLowerCase(Locale.ROOT);//?!!!!!!!!!!!!!!!!!!!!!!!! next() отдаёт строку, которую мы потом делаем маленькими буквами toLowerCase(Locale.ROOT)
            if (inputCommand.equals("end")) {//Если пользователь вводит end программа заканчивается
                System.out.println("Досвидания");//Выводим строчку
                break;//?!!!!!!!!!!!!!!!!!!!!!!!! Останавливаем цикл while
            }
        }
    }

    private double inputNumber(String numberName) {//?!!!!!!!!!!!!!!!!!!!!!!!! Объявляем метод inputNumber, который принимает строку и возвращает дабл.
        while (true) {//?!!!!!!!!!!!!!!!!!!!!!!!! Запускаем бесконечный цикл, так как в условии true, закончится он только по break или return
            try {//?!!!!!!!!!!!!!!!!!!!!!!!! запускаем обработку ошибки
                System.out.println("Введите число " + numberName);//Просим ввести число
                return Double.parseDouble(//?!!!!!!!!!!!!!!!!!!!!!!!! Запускаем метод перевода строки в дабл. Во время перевода она либо выбросит ошибку и заново запросит ввод либо будет возвращено с помощью метода return, на этом выполнение метода закончится.
                    scanner.next()//?!!!!!!!!!!!!!!!!!!!!!!!! Запускаем получение строки от пользователя.
                );
            } catch (Exception e) {//?!!!!!!!!!!!!!!!!!!!!!!!! говорим, что отлавливаем ошибки любого типа
                System.err.println(e.getMessage());//Выводим красным если пользователь ввел не оператор
            }
        }
    }

    private char inputChar() {//Создаем класс char
        while (true) {//?!!!!!!!!!!!!!!!!!!!!!!!! Запускаем бесконечный цикл, так как в условии true, закончится он только по break или return
            System.out.println("Введите  оператор  + - * /  ");//Выводим строку где просим ввести оператор
            String command = scanner.next();//Обьявляем строковую переменную сканер
            char operator = command.charAt(0);// Присваиваем command через переменную operator
            if (operator == '+') {//Проверяем введеный оператор
                return operator;//Возращаем оператор
            } else if (operator == '-') {//Проверяем введеный оператор
                return operator;
            } else if (operator == '*') {//Проверяем введеный оператор
                return operator;
            } else if (operator == '/') {//Проверяем введеный оператор
                return operator;
            } else {
                System.out.println("Введен неверный оператор \"" + command + "\"");//Выводим строку
            }
        }
    }

    private double delenie(Number num1, Number num2) {//Создаем приватный метод
        double i = num1.doubleValue() / num2.doubleValue();//Математическое выражение
        return i;//Возращаем переменную
    }

    private double ymnojenie(Number num1, Number num2) {//Создаем приватный метод
        double res = num1.doubleValue() * num2.doubleValue();//Математическое выражение
        return res;//Возращаем переменную
    }

    private double plus(Number num1, Number num2) {//Создаем приватный метод
        double result = num1.doubleValue() + num2.doubleValue();//Математическое выражение
        return result;//Возращаем переменную
    }

    private double minus(Number num1, Number num2) {//Создаем приватный метод
        double result = num1.doubleValue() - num2.doubleValue();
        return result;//Возращаем переменную
    }
}
