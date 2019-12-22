package Lesson2.game;
import java.lang.module.FindException;
import java.net.BindException;
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
            playerOne.setAttempt(numGamerOne, i);
            compare(playerOne, numComp);
            System.out.print("Введите ваше число игрок " + playerTwo.getName() + ": ");
            int numGamerTwo = scan.nextInt();
            playerTwo.setAttempt(numGamerTwo, i);
            compare(playerTwo, numComp);
            lastChance(playerOne);
            lastChance(playerTwo);
            checkAttempts(playerOne);
            checkAttempts(playerTwo);
        }
    }

    public void checkAttempts(Player player) {
        if (player.getAttempt() == 9) {
            System.out.println("У игрока " + player.getName() + " кончились попытки. Ваши варианты ответов " + Arrays.toString(player.getAll()));
        }
    }

    public void lastChance(Player player) {
        if (player.getAttempt() == 8) {
            System.out.println("Игроки! У вас осталась последня попытка!!");
        }
    }

    public boolean compare(Player player, int numComp) {
        if (numComp > player.getNumber()) {
            System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
        } else if (numComp < player.getNumber()) {
            System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
        } else if (numComp == player.getNumber()) {
            System.out.println("Вы победили игрок " + player.getName() + " c " + (player.getAttempt() + 1) + " попытки !");
            return true;
        }
        return false;
    }
}