package Lr7.Example2;

public class main_2 {
    public static void main(String[] args) {
        Class myTest0 = new Class();
        String Class0 = myTest0.toString();
        System.out.println(Class0);

        Class myTest1 = new Class("test this");
        String Class1 = myTest1.toString();
        System.out.println(Class1);

        Class myTest2 = new subClass();
        String subClass0 = myTest2.toString();
        System.out.println(subClass0);

        Class myTest3 = new subClass("test this too");
        String subClass1 = myTest3.toString();
        System.out.println(subClass1);

        Class myTest4 = new subClass(256);
        String subClass2 = myTest4.toString();
        System.out.println(subClass2);

        Class myTest5 = new subClass("test this and this", 256);
        String subClass3 = myTest5.toString();
        System.out.println(subClass3);
    }
}

