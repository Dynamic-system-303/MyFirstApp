package Lr11;

import java.util.ArrayList;
import java.util.List;

public class Example_7 {
    public static List<String> filterByLength(List<String> strings, int specLength) {
        List<String> filteredList = strings.stream()
                .filter(str -> str.length() > specLength).toList();
        return filteredList;
    }

    public static void main(String[] args) {
        // Пример использования
        List<String> inputList = new ArrayList<>();
        inputList.add("Огонь");
        inputList.add("Сало");
        inputList.add("Свечение");
        inputList.add("Песня");
        inputList.add("Бутерброд");

        int specLength = 6;
        List<String> filteredList = filterByLength(inputList, specLength);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
