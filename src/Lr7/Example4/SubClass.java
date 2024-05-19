package Lr7.Example4;

public class SubClass extends Class {
    SubClass(char charPole) {
        super(charPole);
    }
    //Во втором классе появляется открытое текстовое поле
    public String str1;

    public void setCharStr(char charPole, String str1) {
        super.charPole = charPole;
        this.str1 = str1;
    }
    //original конструктор
    SubClass(char charPole, String str1) {
        super(charPole);
        this.setCharStr(charPole, str1);
    }
    //конструктор копии
    SubClass(SubClass copy) {
        super(copy.charPole);
        this.setCharStr(copy.charPole, copy.str1);
    }

    @Override
    public String toString() {
        String SecondFieldValue =
                "\n str = " + this.getStr1();
        return super.toString()+SecondFieldValue;
    }
    public String getStr1() {
        return str1;
    }
}
