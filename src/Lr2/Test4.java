package Lr2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if (5 <= x & x <= 10){
            System.out.println("Число попадает в диапазон от 5 до 10 включительно");
        } else {
            System.out.println("Число не попадает в диапазон от 5 до 10 включительно");
        }
    }
}
