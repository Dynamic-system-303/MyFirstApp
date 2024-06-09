package Lr13.Task_2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите количество строк в матрице:");
            int rows = Integer.parseInt(scanner.nextLine());

            System.out.println("Введите количество столбцов в матрице:");
            int cols = Integer.parseInt(scanner.nextLine());

            int[][] matrix = new int[rows][cols];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                String[] rowValues = scanner.nextLine().split(" ");
                if (rowValues.length != cols) {
                    throw new IllegalArgumentException("Неверное количество элементов в строке матрицы");
                }
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = Integer.parseInt(rowValues[j]);
                }
            }

            System.out.println("Введите номер столбца для вывода:");
            int columnNumber = Integer.parseInt(scanner.nextLine());

            if (columnNumber < 0 || columnNumber >= cols) {
                throw new IllegalArgumentException("Нет столбца с таким номером");
            }

            System.out.println("Столбец с номером " + columnNumber + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnNumber]);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода числа. Пожалуйста, введите целое число.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
