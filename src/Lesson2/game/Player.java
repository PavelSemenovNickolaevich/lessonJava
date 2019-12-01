package Lesson2.game;

//package com.JavaStart.Lesson_2.player;
public class Player {

    String name;
    int numberOne;
    int numberTwo;
    int[] arrOne = new int[10];
    int[] tryArrayTwo = new int[10];


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


}
