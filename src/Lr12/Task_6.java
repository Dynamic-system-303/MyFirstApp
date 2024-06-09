package Lr12;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task_6 {
    public static long sumArray(int[] arr) {
        // Получаем количество ядер процессора
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество используемых потоков: " + numThreads);

        // Создаем пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        // Разбиваем массив на части
        int chunkSize = arr.length / numThreads;
        System.out.println("Размер каждой части массива: " + chunkSize);

        // Создаем задачи для каждого потока
        Future<Long>[] futures = new Future[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? arr.length : (i + 1) * chunkSize;
            System.out.println("Поток " + i + " обрабатывает диапазон от " + start + " до " + end);
            futures[i] = executorService.submit(() -> sumRange(arr, start, end));
        }

        // Ждем завершения всех задач и суммируем результаты
        long totalSum = 0;
        for (Future<Long> future : futures) {
            try {
                long partialSum = future.get();
                totalSum += partialSum;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Завершаем пул потоков
        executorService.shutdown();

        return totalSum;
    }

    private static long sumRange(int[] arr, int start, int end) {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Генерируем случайный массив
        int[] arr = generateRandomArray(10000000);

        long startTime = System.currentTimeMillis();
        long totalSum = sumArray(arr);
        long endTime = System.currentTimeMillis();

        System.out.println("Сумма элементов массива: " + totalSum);
        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
