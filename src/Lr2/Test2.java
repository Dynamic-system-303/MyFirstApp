package Lr2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if (x % 5 == 2 & x % 7 == 1){
            System.out.println("Число удовлетворяет условиям: деления на 5 с остатком 2 и деления на 7 с остатком 1");
        } else {
            System.out.println("Число не удовлетворяет условиям: деления на 5 с остатком 2 и деления на 7 с остатком 1");
        }
    }
}
