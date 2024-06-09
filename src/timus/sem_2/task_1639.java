package timus.sem_2;

import java.util.Scanner;

public class task_1639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        // Проверяем является ли m или n четным
        if ((m * n) % 2 == 0) {
            System.out.println("[:=[first]");
        } else {
            System.out.println("[second]=:]");
        }
    }
}
