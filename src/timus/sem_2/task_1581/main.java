package timus.sem_2.task_1581;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Количество кандидатов
        int m = scanner.nextInt(); // Количество избирателей

        int[] votes = new int[n + 1]; // Массив для хранения количества голосов за каждого кандидата

        for (int i = 0; i < m; i++) {
            int candidate = scanner.nextInt();
            votes[candidate]++;
        }

        for (int i = 1; i <= n; i++) {
            double percentage = (double) votes[i] / m * 100;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}
