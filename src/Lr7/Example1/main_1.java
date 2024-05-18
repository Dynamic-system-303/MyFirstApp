package Lr7.Example1;

public class main_1 {
    public static void main(String[] args) {
        Task_1 superClassObject = new Task_1("передал в конструктор класса");
        String className = superClassObject.toString();
        System.out.println(className);

        Task_1_1 subClassObject1 = new Task_1_1("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        Task_1_1 subClassObject2 = new Task_1_1("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

