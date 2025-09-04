public class Dz34 {
    public static void main(String[] args) {
        m2();
    }

        public static void m2 () {
            System.out.println("2");
            m3();
        }

        public static void m3(){
            System.out.println("3");
            m4();
        }

        public static void m4(){
            System.out.println("4");
            m5();
        }

        public static void m5(){
            System.out.println("5");
            ExampleDefaultValues values = new ExampleDefaultValues();
            values.m7();
        }
    }

