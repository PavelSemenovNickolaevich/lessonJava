package Lesson2.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempt = 0;

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

    public void incAttempt()  {
        attempt++;
    }

    public void setEnteredNumber(int number) {
       this.enteredNumbers[attempt] = number;
    }

    public int[] getAll() {
        return enteredNumbers;
    }

    public void clear() {
        Arrays.fill(enteredNumbers,0,attempt,0);
    }

}

