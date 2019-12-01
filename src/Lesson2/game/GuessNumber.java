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
            playerOne.setTryArrayOne();
            playerOne.setNumberOne(numGamerOne);
            //int[] arrOne = new int[10];
          //  for (int i = 0 ; i < playerOne.getTryArrayOne(10).length ; i++)
          //  playerOne.getTryArrayOne(10) =  playerOne.getNumberOne();
            if (numComp > playerOne.getNumberOne()) {
                System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
            } else if (numComp < playerOne.getNumberOne()) {
                System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
            } else if (numComp == playerOne.getNumberOne()) {
                System.out.println("Вы победили игрок " + playerOne.getName() + " !");
               //. System.out.println(arrOne[playerOne.getNumberOne()]);
                break;
            }
            System.out.print("Введите ваше число игрок " + playerTwo.getName() + ": ");
            int numGamerTwo = scan.nextInt();
            playerTwo.setNumberTwo(numGamerTwo);
            if (numComp > playerTwo.getNumberTwo()) {
                System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
            } else if (numComp < playerTwo.getNumberTwo()) {
                System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
            } else if (numComp == playerTwo.getNumberTwo()) {
                System.out.println("Вы победили игрок " + playerTwo.getName() + " !");
                break;
            }
        } while (true);
    }
}