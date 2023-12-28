package Lr3;

import java.util.Scanner;

public class Test3_Var1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int prev = 1, next = 1;

        for (int i = 0; i < number; i++) {
            System.out.println(prev);
            next = next + prev;
            prev = next - prev;

        }

    }
}
