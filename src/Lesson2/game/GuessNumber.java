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
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guessNum() {
        int numComp = (int) (Math.random() * 101);
        for (int i = 0; i < 10; i++) {
            enterNumber(playerOne);
            if (compare(playerOne, numComp)) {
                break;
            }
            enterNumber(playerTwo);
            if (compare(playerTwo, numComp)) {
                break;
            }

            lastTried(playerOne);
            lastTried(playerTwo);
            checkAttempts(playerOne);
            checkAttempts(playerTwo);
        }
    }

    private void checkAttempts(Player player) {
        if (player.getAttempt(9) == 9) {
            System.out.println("У игрока " + player.getName() + " кончились попытки. Ваши варианты ответов " + Arrays.toString(player.getAll()));
        }
    }

    private void lastTried(Player player) {
        if (player.getAttempt(8) == 8) {
            System.out.println("Игроки! У вас осталась последня попытка!!");
        }
    }

    private boolean compare(Player player, int numComp) {
        if (numComp > player.getNumber()) {
            System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
        } else if (numComp < player.getNumber()) {
            System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
        } else if (numComp == player.getNumber()) {
            System.out.println("Вы победили игрок " + player.getName() + " c " + (player.getAttempt(0) + 1) + " попытки !");
            return true;
        }
        return false;
    }
    private void enterNumber(Player player) {
        System.out.println("Введите ваше число игрок " + player.getName() + ": ");
        player.setNumber(scan.nextInt());
        player.setAttempt(player.getNumber(), player.getAttempt(0));
    }
}