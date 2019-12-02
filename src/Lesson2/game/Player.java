package Lesson2.game;

//package com.JavaStart.Lesson_2.player;
public class Player {

    private String name;
    private int numberOne;
    private int numberTwo;
    private int[] tryArrayOne = new int[10];
    private int[] tryArrayTwo = new int[10];


    public Player(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;

    }

    public int getNumberOne() {
        return numberOne;
    }
    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public int[] getTryArrayOne(int i) {
        return tryArrayOne;
    }

    public int[] getTryArrayTwo() {
        return tryArrayTwo;
    }

    public void setTryArrayOne(int[] tryArrayOne) {
        this.tryArrayOne = tryArrayOne;
    }

    public void setTryArrayTwo(int[] tryArrayTwo) {
        this.tryArrayTwo = tryArrayTwo;
    }

    public void setTryArrayOne(int i, int numberOne) {
    }
}
