package Lesson2.game;

import java.util.ArrayList;
import java.util.List;

//package com.JavaStart.Lesson_2.player;
public class Player {

    private String name;
    private int number;
    public int[] array = new int[10];


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

    int getArray(int index) {
        return array[index];
    }

    public void setArray(int number, int index){
        array[index] = number;
    }

    public  int[] getAll() {
        return array;
    }
}

