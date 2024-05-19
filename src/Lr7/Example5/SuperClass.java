package Lr7.Example5;

public class SuperClass {
    //суперкласс с защищенным текстовым полем
    protected String str;

    public void setStr(String str) {
        this.str = str;
    }

    //конструктор с текстовым параметром
    SuperClass(String str) {
        this.setStr(str);
    }

    //метод, при вызове которого в консольном окне
    // отображается название класса и значение поля
    public void PrintToString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                        " String str = \"" + this.getStr() + "\"";
        System.out.println(ClassNameAndFieldValue);
    }

    public String getStr() {
        return str;
    }
}
