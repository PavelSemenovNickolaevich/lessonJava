package Lesson2.calculator;


import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = " ";
        do {
        System.out.println("Enter the mathematical expression: ");
        String expression = scan.next();
        String[] parts = expression.split("|");
        int part1 = Integer.parseInt(parts[0]);
        int part3 = Integer.parseInt(parts[2]);
        String part2 = parts[1];
        int a = part1;
        int b = part3;
        System.out.println();
            Calculator calculatorOne = new Calculator();
            calculatorOne.calсulate(a, b , part2);
            do {
                System.out.println("Continue?[yes/no]");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
