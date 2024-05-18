package Lr10.Example3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class Task1_1 {
    public static void main(String[] args) {
        var path = "src/Lr10/Example3/employees.json";

        JSONObject list = new JSONObject();
        JSONArray employees = new JSONArray();

        JSONObject employee1 = new JSONObject();
        employee1.put("office", "Сопровождения ИТ продукта");
        employee1.put("name", "Сафронова А.П.");
        employee1.put("experience", 3.5);

        JSONObject employee2 = new JSONObject();
        employee2.put("office", "Data Science");
        employee2.put("name", "Поляков С.В.");
        employee2.put("experience", 5);

        employees.add(employee1);
        employees.add(employee2);

        list.put("employees", employees);

        try (FileWriter file = new FileWriter(path)) {
            file.write(list.toJSONString());
            System.out.println("JSON файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
