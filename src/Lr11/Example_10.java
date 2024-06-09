package Lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example_10 {
    public static List<Integer> generateRandomNumbers(int size) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        // Генерируем случайные числа и добавляем их в список
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100));
        }

        return randomList;
    }

    public static List<Integer> filterLessThan(List<Integer> numbers, int threshold) {
        List<Integer> filterLessThan = numbers.stream()
                .filter(num -> num < threshold)
                .collect(Collectors.toList());
        return filterLessThan;
    }

    public static void main(String[] args) {
        int listSize = 10;
        List<Integer> inputList = generateRandomNumbers(listSize);

        int threshold = 31;

        List<Integer> filteredList = filterLessThan(inputList, threshold);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список, содержащий числа меньше чем "
                + threshold + ": " + filteredList);
    }
}
