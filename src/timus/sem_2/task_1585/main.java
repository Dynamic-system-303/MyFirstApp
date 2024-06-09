package timus.sem_2.task_1585;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Map<String, Integer> penguinCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String penguin = scanner.nextLine();
            penguinCount.put(penguin, penguinCount.getOrDefault(penguin, 0) + 1);
        }

        String mostPopularPenguin = "";
        int maxCount = 0;

        for (String penguin : penguinCount.keySet()) {
            int count = penguinCount.get(penguin);
            if (count > maxCount) {
                maxCount = count;
                mostPopularPenguin = penguin;
            }
        }

        System.out.println(mostPopularPenguin);

        scanner.close();
    }
}

