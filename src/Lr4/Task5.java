package Lr4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int h = 5, w = 5;
        int[][] square = new int[h][w];
        Random random = new Random();

        String line;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                square[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < h; i++) {
            line = "";
            for (int j = 0; j < w; j++) {
                line += square[i][j];
            }
            System.out.println(line);
        }
        System.out.println();

        for (int i = 0; i < h; i++) {
            line = "";
            for (int j = 0; j < w; j++) {
                line += square[j][i];
            }
            System.out.println(line);
        }
    }
}
