package Lr7.Example4;

public class main {
    public static void main(String[] args) {
        //Class test
        Class ClassTest = new Class('A');
        String className1 = ClassTest.toString();
        System.out.println(className1);
        //Class copy test
        Class ClassTestCopy = new Class(ClassTest);
        String className1copy = ClassTestCopy.toString();
        System.out.println(className1copy);
        //1 subClass test
        SubClass SubClassTest = new SubClass('G',"Пупок");
        String className2 = SubClassTest.toString();
        System.out.println(className2);
        //1 subClass copy test
        SubClass SubClassTestCopy = new SubClass(SubClassTest);
        String className2Copy = SubClassTestCopy.toString();
        System.out.println(className2Copy);
        //2 subClass test
        SecondSubClass SecondSubClassTest = new SecondSubClass('P',"Пупок",13);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        //2 subClass copy test
        SecondSubClass SecondSubClassTestCopy = new SecondSubClass(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}
