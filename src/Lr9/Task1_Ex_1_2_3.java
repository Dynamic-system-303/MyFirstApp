package Lr9;

public class Task1_Ex_1_2_3 {
    public static void m1(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            m1(2 * x + 1);
        }
    }

    public static void m2(int x) {
        if ((2 * x + 1) < 20) {
            m2(2 * x + 1);
        }
        System.out.println("x=" + x);
    }

    private static int step = 0;
    public static void m3(int x) {
        space();
        System.out.println("" + x + "-> ");
        step++;
        if ((2 * x +1) < 20) {
            m3(2 * x + 1);
        }
        step --;
        space();
        System.out.println("" + x + " <-");
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("1 пример:");
        m1(1);
        System.out.println("2 пример:");
        m2(1);
        System.out.println("3 пример:");
        m3(1);
    }
}

