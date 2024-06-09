package Lr13.Task_1;

public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
            return 1; // Возвращаемое значение
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}

