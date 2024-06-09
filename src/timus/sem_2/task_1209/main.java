package timus.sem_2.task_1209;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        for (long i = 0; i < n; i++) {
            long x = in.nextLong() - 1;

            long y = (long) Math.sqrt(8 * x + 1);
            if (y * y == 8 * x + 1) {
                System.out.println("1 ");
            }else {
                System.out.println("0");
            }
        }
    }
}
