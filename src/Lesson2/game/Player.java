package Lesson2.game;

//package com.JavaStart.Lesson_2.player;
public class Player {

    private String name;
    private int number;
    private int[] attempts = new int[10];

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

    public int getAttempt(int index) {
        return attempts[index];
    }

    public void setAttempt(int number, int index) {
        attempts[index] = number;
    }

    public int[] getAll() {
        return attempts;
    }

}

