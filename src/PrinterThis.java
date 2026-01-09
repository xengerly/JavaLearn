public class PrinterThis {
    int x1;
    int x2;
    int x3;
    int[] numbers = {4, 60, 2};

    String str1;
    String str2;
    String str3;

    public int maximumNumberThreeNumbers() { // Создайте класс, который находит наибольшее из трех чисел. Ко всем переменным обращаться можно ТОЛЬКО используя this.
        int max = 0;
        if (this.x1 > this.x2 || this.x1 > this.x3) { //судя из этого условия, если х2 будет больше х1 но х3 будет меньше х1, то х1 будет признан самым большим числом.
            max = this.x1;
        }
        else if (this.x2 > this.x1 || this.x2 > this.x3) { //перепиши все условия и проверь на бумажке как они работают.
            max = this.x2;
        }
        else  if (this.x3 > this.x2 || this.x3 > this.x1) {
            max = this.x3;
        }
        return max;
    }

    void maximumNumberThreeNumbers2() {
        int maxNumber = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] > maxNumber){
                maxNumber = this.numbers[i];
            }
        }
        System.out.println(maxNumber);
    }
    String oneBigLine(){
        return this.str1 + this.str2 + this.str3;
    }
}

