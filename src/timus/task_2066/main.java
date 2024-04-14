package timus.task_2066;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int result1 = a - b * c;
        int result2 = a - b - c;

        int minNumber = Math.min(result1, result2);
        System.out.println(minNumber);
    }
}
