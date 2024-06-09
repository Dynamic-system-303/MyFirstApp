package timus.sem_2.task_1068;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (Math.abs(N) <= 10000) {
            int sumNum = Math.abs(N) * (Math.abs(N) + 1) / 2;
            if (N < 0) {
                sumNum = 1 - sumNum;
            } else if (N == 0) {
                sumNum = 1;
            }
            System.out.println(sumNum);
        }
    }
}