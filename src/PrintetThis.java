public class PrintetThis {
    int x1;
    int x2;
    int x3;
    int[] numbers = {4, 60, 2};

    String str1;
    String str2;
    String str3;

    void maximumNumberThreeNumbers() { // Создайте класс, который находит наибольшее из трех чисел. Ко всем переменным обращаться можно ТОЛЬКО используя this.

        if (this.x1 > this.x2 || this.x1 > this.x3) { //судя из этого условия, если х2 будет больше х1 но х3 будет меньше х1, то х1 будет признан самым большим числом.
            System.out.println(this.x1);
        }
        else if (this.x2 > this.x1 || this.x2 > this.x3) { //перепиши все условия и проверь на бумажке как они работают.
            System.out.println(this.x2);
        }
        else  if (this.x3 > this.x2 || this.x3 > this.x1) {
            System.out.println(x3);
        }
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

}

