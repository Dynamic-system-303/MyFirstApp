package Lr13.Task_2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите размер массива:");
            int size = Integer.parseInt(scanner.nextLine());

            byte[] arr = new byte[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                try {
                    arr[i] = Byte.parseByte(scanner.nextLine());
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Ошибка ввода числа. Пожалуйста, введите число типа byte.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new ArrayIndexOutOfBoundsException("Превышено количество элементов в массиве.");
                }
            }

            // Вычисление суммы элементов массива
            int sum = 0;
            for (byte num : arr) {
                sum += num;
            }

            System.out.println("Сумма элементов массива: " + sum);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

