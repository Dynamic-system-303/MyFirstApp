package timus.task_1197;

import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int test = in.nextInt(), x, y;
        char x1, y1;

        for (int i = 0; i < test; i++) {
            String possition = in.next();

            x1 = possition.charAt(0);
            y1 = possition.charAt(1);

            x = (int) x1 - 96;
            y = (int) y1 - 48;

            out.println(getInts()[x-1][y-1]);
        }
        out.flush();
    }

    public static int[][] getInts() {
        return new int[][]{
                {2, 3, 4, 4, 4, 4, 3, 2},
                {3, 4, 6, 6, 6, 6, 4, 3},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {3, 4, 6, 6, 6, 6, 4, 3},
                {2, 3, 4, 4, 4, 4, 3, 2}
        };
    }
}

