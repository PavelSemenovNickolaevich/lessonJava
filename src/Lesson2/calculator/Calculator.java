package Lesson2.calculator;//package com.JavaStart.Lesson_2.calculator;
import  java.lang.Object;


public class Calculator {


    public void calсulate(int a, int b, String part2) {
        switch (part2) {
            case "+":
                System.out.println("Addiction" + "=" + Math.addExact(a, b));
                break;
            case "-":
                System.out.println("Subtraction" + "=" + Math.subtractExact(a, b));
                break;
            case "*":
                System.out.println("multiplication" + "=" + Math.multiplyExact(a, b));
                break;
            case "/":
                System.out.println("Segmentation" + "=" + Math.floorDiv(a,b));
                break;
            case "^":
                System.out.println("Extent" + "=" + Math.pow(a, b));
                break;
            case "%":
                System.out.println("Balance" + "=" + Math.floorMod(a, b));
                break;
        }
    }
}
