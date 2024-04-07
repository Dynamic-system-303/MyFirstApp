package Lr9;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int result = in.nextInt();
        toBinary(result);
    }

    public static void toBinary(int num) {
        int result = num / 2;
        int remainder = num % 2;
        if (result > 0) {
            toBinary(result); // В рекурсию нужно брать то число, с которым будешь делать те же самые операции.
        }
        System.out.println(remainder);
    }
}
