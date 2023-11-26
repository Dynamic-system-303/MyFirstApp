package Lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.println("Input second number: ");
        int secondNumber = in.nextInt();

        System.out.println("Summa: " + (firstNumber + secondNumber));
        System.out.println("Difference: " + (firstNumber - secondNumber));
    }
}
