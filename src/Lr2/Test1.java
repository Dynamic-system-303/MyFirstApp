package Lr2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int result = x % 3;
        System.out.println("result = " + result);
        if (result == 0) {
            System.out.println("Введеное число делится на три без остатка");
        } else {
            System.out.println("Введеное число не делится на три без остатка");
        }
    }
}
