package MyClass26xO;

import java.util.Scanner;

public class XOGame {
    FieldXO gameField;
    Scanner scanner = new Scanner(System.in);
    char whoMakeNextTurn;
    boolean gameOver = false;

    void setupNewGame() {
        System.out.println("Will play new XO game");
        this.gameField = new FieldXO();
        this.gameField.initField();
    }

    void play() {
        this.setupNewGame();
        System.out.print("Who will make first turn : ");
        char first = this.scanner.next().charAt(0);

        if (first == 'X' || first == 'O'){
            this.whoMakeNextTurn = first;
        }else {
            System.out.println("I recognizing only X and O (zero). So first will be X");
            this.whoMakeNextTurn = 'X';
        }

        while (!gameOver){
            turn();
            this.gameOver = this.gameField.isGameOver(this.whoMakeNextTurn);
            if (this.gameOver){
                System.out.println(this.whoMakeNextTurn + "win!");
            }
            if (this.whoMakeNextTurn == 'X'){
                this.whoMakeNextTurn = 'O';
            }else {
                this.whoMakeNextTurn = 'X';
            }
        }
        System.out.println("Game Over.");
    }

    void turn(){
        System.out.println(this.whoMakeNextTurn + ", your turn.  ");
        System.out.println("Chose row: ");
        int rowNumber = this.scanner.nextInt();
        System.out.println("Chose column: ");
        int colNUmber = this.scanner.nextInt();
        int rowIndex = rowNumber - 1;
        int colIndex = colNUmber - 1;

        if (this.gameField.isPlaceFree(rowIndex,colIndex)){
            this.gameField.setValue(rowIndex,colIndex,whoMakeNextTurn);
            this.gameField.printerField();
        }else {
            System.out.println("Wrond number(maybe this plase is not free?). Make turn again");
            turn();
        }
    }
}
