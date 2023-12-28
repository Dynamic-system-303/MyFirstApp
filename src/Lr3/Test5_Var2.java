package Lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Test5_Var2 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел в сумме: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] Array = new int[num];
        int i = 0;

        for (int el = 0; i < num; el++) {
            if (el % 5 == 2 || el % 3 == 1) {
                System.out.println(el);
                Array[i] = el;
                i++;
            }
        }
        System.out.println("Сумма равна: " + Arrays.stream(Array).sum());
    }
}