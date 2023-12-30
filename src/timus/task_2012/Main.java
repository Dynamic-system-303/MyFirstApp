package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numberOfTasks = in.nextInt();

        int difference = 12 - numberOfTasks;

        int time = difference * 45;

        if (time <= 240) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        out.flush();
    }
}
