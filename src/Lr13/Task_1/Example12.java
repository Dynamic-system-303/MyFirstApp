package Lr13.Task_1;

public class Example12 {
    public static void m(String str, double chislo) {
        StringBuilder sb = new StringBuilder();
        boolean hasError = false;

        if (str == null || str.isEmpty()) {
            sb.append("Строка введена неверно");
            hasError = true;
        }
        if (chislo <= 0.001) {
            if (hasError) {
                sb.append(", ");
            }
            sb.append("Неверное число");
            hasError = true;
        }
        if (hasError) {
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


