package Lesson2.game;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
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
            System.out.print("Введите ваше число игрок " + playerTwo.getName() + ": ");
            int numGamerTwo = scan.nextInt();
            playerOne.setAttempts(numGamerOne,i);
            playerTwo.setAttempts(numGamerTwo, i);
            if (numComp > numGamerOne && numComp > numGamerTwo)  {
                System.out.println("Введенные вами числа  меньше того, что загадал компьютер, ход следующего игрока");
            } else if (numComp < numGamerOne && numComp < numGamerTwo) {
                System.out.println("Введенные вами числа  больше того, что загадал компьютер, ход следующего игрока ");
            } else if (numComp == numGamerOne) {
                System.out.println("Вы победили игрок " + playerOne.getName() + " c " + (i + 1) + " попытки !");
            }  else if (numComp == numGamerTwo) {
                System.out.println("Вы победили игрок " + playerTwo.getName() + " с " + (i+1) + " попытки !");
                break;
            }
            if (i == 8) {
                System.out.println("Игроки! У вас осталась последня попытка!!");
            }
            if (i == 9 ) {
                System.out.println("У игрока " + playerOne.getName() + " кончились попытки. Ваши варианты ответов " + Arrays.toString(playerOne.getAll()));
                System.out.println("У игрока " + playerTwo.getName() + " кончились попытки. Ваши варианты ответов " + Arrays.toString(playerTwo.getAll()));
            }
        }
    }
}


