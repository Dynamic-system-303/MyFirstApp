package Lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example_6 {
    public static List<Integer> filterNumbers(List<Integer> numbers, int divisor) {
        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num % divisor == 0)
                .collect(Collectors.toList());
        return filteredNumbers;
    }

    public static void main(String[] args) {
        // Генерируем случайные числа в списке
        List<Integer> inputList = generateRandomList(10, 100);

        int divisor = 5;
        List<Integer> filteredList = filterNumbers(inputList, divisor);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }

    private static List<Integer> generateRandomList(int size, int maxValue) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(maxValue) + 1;
            randomList.add(randomNumber);
        }

        return randomList;
    }
}
