package Lr9;

public class Task1_Ex_4 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n) {
        if (n == 1) return 1;
        return fact(n - 1) * n;
    }
}

