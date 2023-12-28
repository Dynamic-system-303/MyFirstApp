package Lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Test4_Var2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int i = Math.min(num1, num2);
        while (i <= Math.max(num1, num2)) {
            System.out.println(i);
            i++;
        }
    }
}
