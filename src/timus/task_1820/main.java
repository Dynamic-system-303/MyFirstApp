package timus.task_1820;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int result;

        if (k >= n) {
            result = 2;
        } else if ((n * 2) % k == 0) {
            result = n * 2 / k;
        } else {
            result = n * 2 / k + 1;
            }
        System.out.println(result);
    }
}
