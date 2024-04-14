package Lr9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task_6 {
    public static void main(String[] args) {
        HashMap<Integer, String> numAndStudent = new HashMap<>();
        numAndStudent.put(0, "Ан Г");
        numAndStudent.put(1, "Бикмурзина Жанна");
        numAndStudent.put(2, "Бирюков Егор");
        numAndStudent.put(3, "Бутаков Даниил");
        numAndStudent.put(4, "Еленский Мирослав");
        numAndStudent.put(5, "Калинин Константин");
        numAndStudent.put(6, "Клянчин Андрей");
        numAndStudent.put(7, "Лунин Максим");
        numAndStudent.put(8, "Маслова Юлия");
        numAndStudent.put(9, "Маевский Андрей");
        numAndStudent.put(10, "Массальский Денис");

        for (Map.Entry<Integer, String> entry : numAndStudent.entrySet()) {
            Integer key = entry.getKey();
            if (key == 0) {
                ArrayList<String> values = new ArrayList<>(numAndStudent.values());
                System.out.println("Значения: " + values);
            }
        }
        System.out.println(" ");
        for (Map.Entry<Integer, String> entry : numAndStudent.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key > 5) {
                System.out.println("Значения ключей больше 5: " + value);
            }
        }
        System.out.println(" ");
        int m = 1;
        for (Map.Entry<Integer, String> entry : numAndStudent.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (value.length() > 5) {
                m = key * m;
                System.out.println("Перемноженные ключи больше 5: " + m);
            }

        }

    }

}


