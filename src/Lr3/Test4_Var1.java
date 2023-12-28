package Lr3;

import java.util.Scanner;

public class Test4_Var1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            System.out.println(i);
        }
    }
}
