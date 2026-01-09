public class Dz17_OOP {
    public static void main(String[] args) {
        University university1 = new University();
        university1.name = "MFUA";
        System.out.println(university1.name);

        System.out.println();

        University university2 = new University();
        university2.name = "MGU";
        System.out.println(university2.name);

        System.out.println();

        OperatingSystem_Dz17 MacOS = new OperatingSystem_Dz17();
       MacOS.infoOpSys = "Впервые операционная система Mac OS была представлена в 1984 году ";
        System.out.println(MacOS.infoOpSys);

        System.out.println();

        OperatingSystem_Dz17 Windows = new OperatingSystem_Dz17();
        Windows.infoOpSys = "Самая первая Windows 1.0 вышла 20 ноября 1985 года. Однако Windows 1.0, в отличие от Mac OS, не была самостоятельной операционной системой и являлась лишь графической надстройкой над DOS.";
        System.out.println(Windows.infoOpSys);

        System.out.println();

        OperatingSystem_Dz17 Linux = new OperatingSystem_Dz17();
        Linux.infoOpSys = "Первая официальная версия Linux 1.0 вышла в 1994 году, вторая – в 1996 году. Товарный знак Linux был зарегистрирован на год раньше – в 1995. С самого начала и по сей день Linux распространяется как свободное программное обеспечение с лицензией GPL.";
        System.out.println(Linux.infoOpSys);

        System.out.println();

        ProgrammingLanguages Java = new ProgrammingLanguages();
        Java.Typification = "Java использует статическую типизацию, где тип переменной определяется во время компиляции. Это снижает количество ошибок и повышает надежность кода.";
        Java.Version =  "Java 1.0 (1996)" +
                "- Java 1.1 (1997)" +
                "- Java 2 (JDK 1.2, 1998)" +
                "- Java 5 (JDK 1.5, 2004): введение обобщений." +
                "- Java 8 (2014): ламбда-выражения, Stream API." +
                "- Java 11 (2018): LTS, новые библиотеки." +
                "- Java 17 (2021): LTS, новые функции.";
        Java.ArrayOfKeywords = "int,boolean , double, while , if и  т.д";
        System.out.println(Java.Typification);
        System.out.println(Java.Version);
        System.out.println(Java.ArrayOfKeywords);

        System.out.println();

        ProgrammingLanguages Cplus = new ProgrammingLanguages();
        Cplus.Typification = "C++ использует статическую типизацию, где тип переменной определяется на этапе компиляции. Это позволяет обнаруживать ошибки до выполнения программы и оптимизировать код.";
        Cplus.Version = "- C++98 (1998): первая стандартизированная версия." +
                "- C++03 (2003): небольшие исправления к C++98." +
                "- C++11 (2011): расширения, включая автоматическое выведение типов, лямбда-выражения.\n" +
                "- C++14 (2014): улучшения, небольшие дополнения." +
                "- C++17 (2017): новые функции, такие как std::optional, std::variant." +
                "- C++20 (2020): концепции, корутины, множества других улучшений.";
        Cplus.ArrayOfKeywords = "- asm" +
                "- auto" +
                "- bitand" +
                "- bitor" +
                "- bool" +
                "- break" +
                "- case" +
                "- catch";
        System.out.println(Cplus.Typification);
        System.out.println(Cplus.Version);
        System.out.println(Cplus.ArrayOfKeywords);



    }
}
