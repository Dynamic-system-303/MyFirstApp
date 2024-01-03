package Lr4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int height = 10;

        char[][] square = new char[height][height];

        String line;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                square[i][j] = '2';
            }
        }

        for (int i = 0; i < height; i++) {
            line = "";
            for (int j = 0; j < i; j++) {
                line += square[i][j];
            }
            System.out.println(line);
        }
    }
}
