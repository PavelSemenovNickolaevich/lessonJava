package Lesson2.game;

import java.util.ArrayList;
import java.util.List;

//package com.JavaStart.Lesson_2.player;
public class Player {

    private String name;
    private int number;
    private int[] attempt = new int[10];


    public Player(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number= number;

    }

    public int getNumber() {
        return number;
    }

    int getAttempt(int index) {
        return attempt[index];
    }

    public void setAttempt(int number, int index) {
        attempt[index] = number;
    }

    public int[] getAll() {
        return attempt;
    }
}

