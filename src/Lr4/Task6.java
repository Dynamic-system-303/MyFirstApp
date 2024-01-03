package Lr4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int h = 5, w = 5;
        int[][] square = new int[h][w];
        Random random = new Random();
        int str = random.nextInt(h);
        int kln = random.nextInt(w);

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

        System.out.println("После удаления строки номер " + (str + 1) + " и колонки номер " + (kln + 1) + ": ");

        for (int i = 0; i < h; i++) {
            if (i != str) {
                line = "";
                for (int j = 0; j < w; j++) {
                    if (j != kln) {
                        line += square[i][j];
                    }
                }
                System.out.println(line);
            }
        }
    }
    }

