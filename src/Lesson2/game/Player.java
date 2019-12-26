package Lesson2.game;
public class Player {

    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getEnteredNumbers(int index) {
        return enteredNumbers[index];
    }

    public void setEnteredNumbers(int number, int index) {
        enteredNumbers[index] = number;
    }

    public int[] getAll() {
        return enteredNumbers;
    }

    public int getAttempt() {
        return attempt;
    }

    public void incAttempt()  {
        attempt++;
    }

}

