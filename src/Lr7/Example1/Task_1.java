package Lr7.Example1;

public class Task_1 {
    private String str1;

    //конструктор с текстовым аргументом
    Task_1 (String strEx) {
        this.str1 = strEx;
    }

    Task_1() {
        this.str1 = "нет параметров";
    }

    //@Override - аннотация указываемая для того, чтобы показать
    // что далее мы собираемся переопределять метод класса

    public String toString() {
        String Task_1NameAndFieldValue;
        Task_1NameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return Task_1NameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}

