package Lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] Array = new int[num];
        int i = 0;
        if (num > 0) {

            for (int el = 0; i < num; el++) {
                if (el % 5 == 2) {
                    Array[i] = el;
                    i++;
                }
            }
            System.out.println(Arrays.toString(Array));
        } else {
            System.out.println("Введено неккоретное значение");
        }
    }
}
