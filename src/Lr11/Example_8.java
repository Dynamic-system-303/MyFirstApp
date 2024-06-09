package Lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example_8 {
    public static List<Integer> generateRandomList(int size, int maxValue) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        // Генерируем случайные числа и добавляем их в список
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(maxValue);
            randomList.add(randomNumber);
        }

        return randomList;
    }

    public static List<Integer> filterGreaterThan(List<Integer> numbers, int threshold) {
        List<Integer> filterGreaterThan = numbers.stream()
                .filter(num -> num > threshold)
                .collect(Collectors.toList());
        return filterGreaterThan;
    }

    public static void main(String[] args) {
        // Пример использования
        int listSize = 10;
        int maxValue = 20;
        int threshold = 8;

        List<Integer> inputList = generateRandomList(listSize, maxValue);
        List<Integer> filteredList = filterGreaterThan(inputList, threshold);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список, cодеращий числа больше чем " + threshold + ": " + filteredList);
    }
}
