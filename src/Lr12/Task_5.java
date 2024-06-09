package Lr12;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task_5 {
    public static int findMax(int[] arr) {
        // Получаем количество ядер процессора
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество используемых потоков: " + numThreads);

        // Создаем пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        // Разбиваем массив на части
        int chunkSize = arr.length / numThreads;
        System.out.println("Размер каждой части массива: " + chunkSize);

        // Создаем задачи для каждого потока
        Future<Integer>[] futures = new Future[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? arr.length : (i + 1) * chunkSize;
            System.out.println("Поток " + i + " обрабатывает диапазон от " + start + " до " + end);
            futures[i] = executorService.submit(new MaxFinderTask(arr, start, end));
        }

        // Ждем завершения всех задач и находим максимальный элемент
        int maxElement = Integer.MIN_VALUE;
        for (Future<Integer> future : futures) {
            try {
                int partialMax = future.get();
                if (partialMax > maxElement) {
                    maxElement = partialMax;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Завершаем пул потоков
        executorService.shutdown();

        return maxElement;
    }

    private static class MaxFinderTask implements Callable<Integer> {
        private final int[] arr;
        private final int start;
        private final int end;

        public MaxFinderTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        public Integer call() {
            int max = Integer.MIN_VALUE;
            for (int i = start; i < end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        // Генерируем случайный массив
        int[] arr = generateRandomArray(10000000);

        long startTime = System.currentTimeMillis();
        int maxElement = findMax(arr);
        long endTime = System.currentTimeMillis();

        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
}
