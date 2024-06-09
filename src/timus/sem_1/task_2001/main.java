package timus.sem_1.task_2001;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int barries2 = b1 - b2;
        int barries1 = b3 - barries2 - b2;

        System.out.println(barries1 + " " + barries2);
    }
}
