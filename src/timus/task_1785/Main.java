package timus.task_1785;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String crowdName;

        int a = in.nextInt();
        if (a >= 1 && a <= 4) {
            crowdName = "few";
        } else if (a >= 5 && a <= 9) {
            crowdName = "several";
        } else if (a >= 10 && a <= 19) {
            crowdName = "pack";
        } else if (a >= 20 && a <= 49) {
            crowdName = "lots";
        } else if (a >= 50 && a <= 99) {
            crowdName = "horde";
        } else if (a >= 100 && a <= 249) {
            crowdName = "throng";
        } else if (a >= 250 && a <= 499) {
            crowdName = "swarm";
        } else if (a >= 500 && a <= 999) {
            crowdName = "zounds";
        } else {
            crowdName = "legion";
        }
        out.println(crowdName);
        out.flush();
    }
}