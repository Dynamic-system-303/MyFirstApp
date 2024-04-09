package timus.task_1787;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();

        int rest = 0;

        for (int i = 0; i < n; i++) {

            int a = in.nextInt();
            rest = rest - k + a;
            if (rest < 0) {
                rest = 0;
            }
        }
        System.out.println(rest);
    }
}
