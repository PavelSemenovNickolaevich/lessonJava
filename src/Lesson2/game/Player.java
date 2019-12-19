package Lesson2.game;

import java.util.ArrayList;
import java.util.List;

//package com.JavaStart.Lesson_2.player;
public class Player {

    private String name;
   // private int number;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }*/

    int getAttempts(int index) {
        return attempts[index];
    }

    public void setAttempts(int number, int index) {
        attempts[index] = number;
    }

    public int[] getAll() {
        return attempts;
    }
}

