package Lr13.Task_1;

public class Example1 {
    private static boolean someCondition;

    public static void main(String[] args) {
        try {
            System.out.println("0");
            if (someCondition) {
                throw new RuntimeException("Непроверяемая ошибка");
            }
        } catch (RuntimeException e) {
            System.out.println("1 " + e);
        } finally {
            System.out.println("2");
        }
    }
}

