package Lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example_5 {
    public static List<String> filterStrings(List<String> strings, String substring) {
        List<String> filteredList = strings.stream()
                .filter(str -> str.contains(substring)).toList();
        return filteredList;
    }


    public static void main(String[] args) {
        // Пример использования
        List<String> inputList = new ArrayList<>();
        inputList.add("Привет, мир!");
        inputList.add("Это тестовая строка");
        inputList.add("Здесь есть слово 'тест'");
        inputList.add("Еще одна строка без подстроки");

        String substring = "тест";
        List<String> filteredList = filterStrings(inputList,substring);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}