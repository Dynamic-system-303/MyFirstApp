package Lr10.Example3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Task1_2 {
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

            String employeeName = "Сафронова А.П.";
            jsonArray.stream()
                    .filter(employee -> ((JSONObject) employee).get("name").equals(employeeName))
                    .forEach(employee -> {
                        System.out.println("\nНайденый сотрудник:");
                        System.out.println("Имя: " + ((JSONObject) employee).get("name"));
                        System.out.println("Департамент: " + ((JSONObject) employee).get("office"));
                        System.out.println("Стаж: " + ((JSONObject) employee).get("experience"));
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
