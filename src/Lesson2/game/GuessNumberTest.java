package Lesson2.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Компьютер загадал число. Задача двух игроков угадать это число. У вас 10 попыток!!!!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String nameOne = scan.next();
        Player playerOne = new Player(nameOne);
        System.out.print("Введите имя второго игрока: ");
        String nameTwo = scan.next();
        Player playerTwo = new Player(nameTwo);
        String answer = " ";
        do {
            GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
            guessNumber.guessNum();
            do {
                System.out.println("Продолжить?[да/нет]");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}
