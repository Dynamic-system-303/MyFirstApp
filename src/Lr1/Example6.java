package Lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number:");
        double num = in.nextDouble();

        System.out.println("Your number " + num);
        in.close();
    }
}