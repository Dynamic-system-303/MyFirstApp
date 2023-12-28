package Lr3;

import java.util.Scanner;

public class Test5_Var1 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел в сумме: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i = 0;
        int el = 0;
        int sum = 0;
        while (i < num) {
            if (el % 5 == 2 || el % 3 == 1) {
                System.out.println(el);
                i++;
                sum += el;
            }
            el++;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
