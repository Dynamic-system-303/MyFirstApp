package Lr9;

public class Task1_Ex_5 {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int step) {
        if (step == 0) return 0;
        if (step == 1) return 1;
        return fib(step - 2) + fib(step - 1);
    }
}
