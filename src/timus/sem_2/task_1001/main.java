package timus.sem_2.task_1001;

import java.util.ArrayDeque;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Long> numbers = new ArrayDeque<>();
        while (scanner.hasNextLong()) {
            numbers.push(scanner.nextLong());
        }

        while (!numbers.isEmpty()) {
            long number = numbers.pop();
            double squareRoot = Math.sqrt(number);
            System.out.printf("%.4f%n", squareRoot);
        }
    }
}
