package Lr7.Example5;

public class main {
    public static void main(String[] args) {
        SuperClass SuperClassTest1 = new SuperClass("Тест");
        SuperClassTest1.PrintToString();

        FirstSubClass SubClassTest1 = new FirstSubClass("Первый Субкласс", 12);
        SubClassTest1.PrintToString();

        SecondSubClass SubClassTest2 = new SecondSubClass("Второй субкласс", 'M');
        SubClassTest2.PrintToString();

        SuperClass SuperClassTest2 = new SuperClass(SubClassTest1.getStr());
        SuperClassTest2.PrintToString();

        SuperClass SuperClassTest3 = new SuperClass(SubClassTest2.str);
        SuperClassTest3.PrintToString();
    }
}
