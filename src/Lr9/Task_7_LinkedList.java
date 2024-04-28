package Lr9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_7_LinkedList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long start = System.nanoTime();
        LinkedList<Integer> circle = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        System.out.println(circle);

        int twoOrOne = 1;

        while (circle.size() > 1) {
            Iterator<Integer> circleIte = circle.iterator();
            System.out.println(circle);
            while (circleIte.hasNext()) {

                circleIte.next();
                if (twoOrOne == 0) {
                    circleIte.remove();
                    System.out.println(circle);
                }
                twoOrOne = 1 - twoOrOne;
            }
        }

        long duration = System.nanoTime() - start;
        System.out.println(duration);
    }
}
