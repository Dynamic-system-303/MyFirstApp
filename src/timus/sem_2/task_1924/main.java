package timus.sem_2.task_1924;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sum = (n * (n + 1)) / 2;

        if ((sum % 2) == 0) {
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }
    }
}
