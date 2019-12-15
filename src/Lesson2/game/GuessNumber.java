
package Lesson2.game;

import java.lang.module.FindException;
import java.net.BindException;
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
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите ваше число игрок " + playerOne.getName() + ": ");
            int numGamerOne = scan.nextInt();
            playerOne.setNumber(numGamerOne);
            playerOne.getArray(i);
            playerOne.setArray(numGamerOne, playerOne.getArray(i));
            if (numComp > playerOne.getNumber()) {
                System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
            } else if (numComp < playerOne.getNumber()) {
                System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
            } else if (numComp == playerOne.getNumber()) {
                System.out.println("Вы победили игрок " + playerOne.getName() + " c " + i + " попытки !");
                System.out.println((playerOne.getAll()));
            }
            System.out.print("Введите ваше число игрок " + playerTwo.getName() + ": ");
            int numGamerTwo = scan.nextInt();
            playerTwo.setNumber(numGamerTwo);
            if (numComp > playerTwo.getNumber()) {
                System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
            } else if (numComp < playerTwo.getNumber()) {
                System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
            } else if (numComp == playerTwo.getNumber()) {
                System.out.println("Вы победили игрок " + playerTwo.getName() + " с " + i + " попытки !");
                break;
            }
            if (i == 8) {
                System.out.println("Игроки! У вас осталась последня попытка!!");
            }
            if (i == 9) {
                System.out.println("Ваши варианты ответов " + playerOne.array[i]);
                System.out.println("Ваши варианты ответов " + playerTwo.array[i]);
            }
        }
    }
}


