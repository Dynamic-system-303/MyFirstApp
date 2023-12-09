package Lr2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: \n");

        int numb = in.nextInt();
        String str = Integer.toString(numb);

        char thousands = str.charAt(str.length() - 4);
        System.out.print("Тысяч: " + thousands);
    }
}