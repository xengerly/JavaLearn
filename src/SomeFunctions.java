public class SomeFunctions {
    public static void main(String[] args) {
        ClassWithFunctions cwf = new ClassWithFunctions();
        System.out.println(cwf == cwf.blabla());
        System.out.println(cwf == new ClassWithFunctions());
        cwf.functionHiName("Nikita");
        cwf.streetName("Пушкина", 12);
        String result1 = cwf.line("Moscow", "Butovo");
        String result2 = cwf.line2("Moscow", "Butovo");
        System.out.println(result1);
        System.out.println(result2);
        int result3 = cwf.slojenie(10, 5);
        System.out.println(result3);
        double result4 = cwf.delenie(3, 0.4);
        System.out.println(result4);
        double result5 = cwf.ymnojenie(5, 2);
        System.out.println(result5);
        double result6 = cwf.plus(100, 0.9);
        System.out.println(result6);
        Number result7 = cwf.minus(12, 6.79);
        System.out.println(result7);

    }
}

class ClassWithFunctions {
    public ClassWithFunctions blabla() {
        return this;
    }

    public void streetName(String street, int streetNumber) {
        System.out.println("Вы здесь " + street + " " + streetNumber);
    }

    public String line(String city, String places) {
        return city + places;
    }

    public String line2(String city, String places) {
        String result = city + places;
        return result;
    }

    public int slojenie(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public double delenie(Number num1, Number num2) {
        double i = num1.doubleValue() / num2.doubleValue();
        return i;
    }

    public double ymnojenie(Number num1, Number num2) {
        double res = num1.doubleValue() * num2.doubleValue();
        return res;
    }

    public double plus(Number num1, Number num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }

    public double minus(Number num1, Number num2) {
        double result = num1.doubleValue() - num2.doubleValue();
        return result;
    }

    //1 (Модификаторы доступа)
    //public (Модификаторы доступа)
    //private
    //protected
    //default

    //2 (Возвращаемый тип)
    //public void  (Возвращаемый тип)
    //public String (Возвращаемый тип)
    //public int (Возвращаемый тип)
    //public ArrayList<int> (Возвращаемый тип)
    //public Double (Возвращаемый тип)
    //public ClassWithFunctions (Возвращаемый тип)
    //public Character (Возвращаемый тип)
    //public Long (Возвращаемый тип)
    //public Float (Возвращаемый тип)

    //3 (Название функции с маленькой буквы, камал кейсом)
    //public void functionName (Название функции с маленькой буквы, камал кейсом)
    //public void functionNameNikitaBlaBlaMontic

    //4 (любой тип принимаемый функцией)
    //public void functionHiName(void (любой тип принимаемый функцией))
    //public void functionHiName(String (любой тип принимаемый функцией))
    //public void functionHiName(int (любой тип принимаемый функцией))
    //public void functionHiName(ArrayList (любой тип принимаемый функцией))
    //public void functionHiName(Double (любой тип принимаемый функцией))
    //public void functionHiName(ClassWithFunctions (любой тип принимаемый функцией))

    //5 (имя по которому будет осуществляться обращение к этому параметру)
    //public void functionHiName(String parameterName (имя по которому будет осуществляться обращение к этому параметру))
    //public void functionHiName(int parameterName (имя по которому будет осуществляться обращение к этому параметру))
    //public void functionHiName(ArrayList parameterName (имя по которому будет осуществляться обращение к этому параметру))
    //public void functionHiName(Double parameterName (имя по которому будет осуществляться обращение к этому параметру))
    //public void functionHiName(ClassWithFunctions parameterName (имя по которому будет осуществляться обращение к этому параметру))

    //6 (любая функция после её написания должна открывать фигурные скобки)
    //public void functionHiName(String parameterName) {
    //
    //} (любая функция после её написания должна открывать фигурные скобки)

    public void functionHiName(String parameterName) {
        System.out.println("Hi " + parameterName);
    }
}
