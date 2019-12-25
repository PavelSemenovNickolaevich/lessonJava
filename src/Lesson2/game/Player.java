package Lesson2.game;

//package com.JavaStart.Lesson_2.player;
public class Player {

    private String name;
    private int number;
    private int[] attempts = new int[10];
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

    public int getAttempt(int attempt) {
        return attempts[attempt];
    }

    public void setAttempt(int number, int attempt) {
        attempts[attempt] = number;
    }

    public int[] getAll() {
        return attempts;
    }

    public void incAttempt()  {
        attempt++;
    }

}

