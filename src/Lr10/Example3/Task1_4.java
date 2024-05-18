package Lr10.Example3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class Task1_4 {
    public static void main(String[] args) {
        var path = "src/Lr10/Example3/employees.json";

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(path));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("employees");

            for (Object o : jsonArray) {
                JSONObject employee = (JSONObject) o;
                System.out.println("\nТекущий сотрудник:");
                System.out.println("Имя: " + employee.get("name"));
                System.out.println("Департамент: " + employee.get("office"));
                System.out.println("Стаж: " + employee.get("experience"));
            }

            JSONObject newEmployee = new JSONObject();
            newEmployee.put("name", "Сафронова А.П.");
            newEmployee.put("office", "Сопровождения ИТ продукта");
            newEmployee.put("experience", 3.5);
            jsonArray.add(newEmployee);

            for (Object o : jsonArray) {
                JSONObject employee = (JSONObject) o;
                System.out.println("\nСотрудник:");
                System.out.println("Имя: " + employee.get("name"));
                System.out.println("Департамент: " + employee.get("office"));
                System.out.println("Стаж: " + employee.get("experience"));
            }

            try (FileWriter file = new FileWriter(path)) {
                file.write(jsonObject.toJSONString());
                System.out.println("JSON файл после добавления успешно сохранен!");
            } catch (Exception e) {
                e.printStackTrace();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
