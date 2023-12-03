package Lr2;

import java.util.Scanner;

public class Test3{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int x = in.nextInt();

            if (x % 4 == 0 & x < 10){
                System.out.println("Число меньше 10 и делится на 4 без остатка");
            } else {
                System.out.println("Число больше 10 либо не делится на 4 без остатка");
            }
        }
}
