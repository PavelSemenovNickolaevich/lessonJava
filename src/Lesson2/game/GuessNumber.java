
package Lesson2.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player playerOne;
    Player playerTwo;
    private Random input;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guessNum() {
        Scanner scan = new Scanner(System.in);
        int numComp = (int) (Math.random() * 11);
        do {
                System.out.print("Введите ваше число игрок " + playerOne.getName() + ": ");
                int numGamerOne = scan.nextInt();
                playerOne.setNumber(numGamerOne);
                playerOne.setArray(numGamerOne, 0);
                playerOne.setArray(numGamerOne, 1);
                playerOne.setArray(numGamerOne, 2);
                playerOne.setArray(numGamerOne, 3);
                playerOne.setArray(numGamerOne, 4);
                if (numComp > playerOne.getNumber()) {
                    System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
                } else if (numComp < playerOne.getNumber()) {
                    System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
                } else if (numComp == playerOne.getNumber()) {
                    System.out.println("Вы победили игрок " + playerOne.getName() + " !");
                    break;
                }
                System.out.print("Введите ваше число игрок " + playerTwo.getName() + ": ");
                int numGamerTwo = scan.nextInt();
                playerTwo.setNumber(numGamerTwo);
                playerTwo.setArray(numGamerOne, 0);
                playerTwo.setArray(numGamerOne, 1);
                playerTwo.setArray(numGamerOne, 2);
                playerTwo.setArray(numGamerOne, 3);
                playerTwo.setArray(numGamerOne, 4);
                if (numComp > playerTwo.getNumber()) {
                    System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
                } else if (numComp < playerTwo.getNumber()) {
                    System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
                } else if (numComp == playerTwo.getNumber()) {
                    System.out.println("Вы победили игрок " + playerTwo.getName() + " !");
                    break;
                }
            }
            while (true) ;
    }
}

