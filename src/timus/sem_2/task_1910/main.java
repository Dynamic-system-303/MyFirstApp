package timus.sem_2.task_1910;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wall = scanner.nextLine();
        String power = scanner.nextLine();

        String[] powers = power.split(" ");

        int maxSum = 0;
        int center = 1;
        int L = 0;
        int R = 2;

        while (R < powers.length) {
            int sum = 0;
            for (int i = L; i <= R; i++) {
                sum = sum + Integer.parseInt(powers[i]);
            }
            if (sum > maxSum) {
                maxSum = sum;
                center = L + (R - L) / 2;
            }
            L++;
            R++;
        }

        System.out.println(maxSum + " " + ++center);
    }
}
