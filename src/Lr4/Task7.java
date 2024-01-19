package Lr4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int rows = 10, cols = 9, start_from = 10;

        int[][] snake = new int[rows][cols];
        int c, counter = start_from;
        for (int r = 0; r < rows; r++) {
            for (c = 0; c < cols - r; c++) {
                snake[r][c] = counter;
                counter++;
            }
            if (c > 0) {
                for (int k = rows - 1; k > r; k--) {
                    snake[k][c - 1] = counter;
                    counter++;
                }
            }
            System.out.println(Arrays.toString(snake[r]));
        }
    }
}
