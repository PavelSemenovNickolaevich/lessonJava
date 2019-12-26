package Lesson2.game;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Scanner scan = new Scanner(System.in);
    private int numComp;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guessNum() {
        numComp = (int) (Math.random() * 101);
        for (int i = 0; i < 10; i++) {
            enterNumber(playerOne);
            if (compare(playerOne, numComp)) {
                break;
            }
            enterNumber(playerTwo);
            if (compare(playerTwo, numComp)) {
                break;
            }

            checkLastAttempt(playerOne);
            checkAttempts(playerOne);
            checkLastAttempt(playerTwo);
            checkAttempts(playerTwo);
            showAttempts(playerOne);
        }
    }

    private void checkAttempts(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " кончились попытки ");
        }
    }

    private void checkLastAttempt(Player player) {
        if (player.getAttempt() == 9) {
            System.out.println("Игроки! У вас осталась последня попытка!!");
        }
    }

    private boolean compare(Player player, int numComp) {
        if (numComp > player.getNumber()) {
            System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
        } else if (numComp < player.getNumber()) {
            System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
        } else if (numComp == player.getNumber()) {
            System.out.println("Вы победили игрок " + player.getName() + " c " + player.getAttempt()  + " попытки !");
            return true;
        }
        return false;
    }
    private void enterNumber(Player player) {
        System.out.println("Введите ваше число игрок " + player.getName() + ": ");
        player.setNumber(scan.nextInt());
        player.getEnteredNumbers(player.getNumber());
        player.incAttempt();
    }
    private void  showAttempts(Player player) {
        player.setEnteredNumbers(player.getNumber(), player.getAttempt());
        System.out.println(Arrays.toString(player.getAll()));
    }
}