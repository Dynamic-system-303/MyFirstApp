package Lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Высота: ");
        int height = scanner.nextInt();
        System.out.print("Ширина: ");
        int width = scanner.nextInt();


        char[][] square = new char[height][width];

        String line;

         for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                square[i][j] = '2';
            }
        }

        for (int i = 0; i < height; i++) {
            line = "";
            for (int j = 0; j < width; j++) {
                line += square[i][j];
            }
            System.out.println(line);
        }
    }
}
