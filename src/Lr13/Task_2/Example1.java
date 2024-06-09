package Lr13.Task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите длину массива:");
            int length = scanner.nextInt();
            int[] array = new int[length];


            System.out.println("Введите элементы массива:");
            for (int i = 0; i < length; i++) {
                int num = scanner.nextInt();
                if (num < 0) {
                    throw new IllegalArgumentException("Введено отрицательное число: " + num);
                }
                array[i] = num;
            }

            int sum = 0;
            int count = 0;

            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Положительные элементы отсутствуют");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода числа. Пожалуйста, введите целое число.");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
        }
    }
}

