package Lr7.Example3;

public class main {
    public static void main(String[] args) {
        Class ClassTest = new Class(11);
        String className1 = ClassTest.toString();
        System.out.println(className1);

        FirstSubClass FirstSubClassTest = new FirstSubClass(212, 'O');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        SecondSubClass SecondSubClassTest = new SecondSubClass(10, 'I', "Пупок");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}

