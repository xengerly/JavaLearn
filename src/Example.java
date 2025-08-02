public class Example {
    String someString = ""; //1
    static Integer someInt = 1; //2
    static Long emptyLong; //3

    public static void main(String[] args) {
        ExampleClass bebebe = new ExampleClass(); //4
        bebebe.otherFunction(); //5


        String result = exa(bebebe);
        System.out.println(result);

        int resQwe = qwe(13);
        double dasxd = qwe2(13.2, 12.3);
        System.out.println(resQwe);
        System.out.println(dasxd);
        someInt = 20; //8

    }

    public static String exampleFunction(String name) {
        return "Hello " + name; //10
    }

    public static String exa(ExampleClass dsaw) {
        return "123 " + dsaw.publicField;
    }

    public static int qwe(double qaz) {
        return (int) (105 + qaz);
    }

    public static double qwe2(double swe, double dfg) {
        return (swe + dfg) / 5;

    }

}
