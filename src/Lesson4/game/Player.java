package Lesson4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempt = 0;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

   /* public void incAttempt()  {
        attempt++;
    }*/

    public void setEnteredNumber(int number) {
       this.enteredNumbers[attempt] = number;
       attempt++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getAll() {
        return enteredNumbers;
    }

    public void clear() {
        Arrays.fill(enteredNumbers,0,attempt,0);
    }

}

