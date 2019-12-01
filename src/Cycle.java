//package com.JavaStart.Lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        int a = 6;
        while (a >= -6) {
            System.out.println(a + " ");
            a -= 2;
        }

        int c = 10;
        int sumOdd = 0;
        do {
            if (c % 2 != 0) {
                sumOdd += c;
            }
            c++;
        } while (c <= 20);
        System.out.println(sumOdd);
    }
}
