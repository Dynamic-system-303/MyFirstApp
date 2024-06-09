package Lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example_9 {
    public static List<String> lettersOnlyFilter(List<String> strings) {
        List<String> lettersOnlyFilter = strings.stream()
                .filter(str -> str.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
        return lettersOnlyFilter;
    }

    public static void main(String[] args) {
        // Пример использования
        List<String> inputList = new ArrayList<>();
        inputList.add("Hello");
        inputList.add("World!");
        inputList.add("Eminem");
        inputList.add("Bom1bastic");
        inputList.add("Java ^_^");

        List<String> filteredList = lettersOnlyFilter(inputList);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
