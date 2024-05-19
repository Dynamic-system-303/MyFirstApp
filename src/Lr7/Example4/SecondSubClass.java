package Lr7.Example4;

public class SecondSubClass extends SubClass {
    SecondSubClass(char charPole) {
        super(charPole);
    }

    //Во третьем классе появляется открытое целочисленное поле
    public int intPole;

    public void setChar1Str1Int1(char charPole, String str1, int intPole) {
        super.charPole = charPole;
        super.str1 = str1;
        this.intPole = intPole;
    }

    //original конструктор
    SecondSubClass(char charPole, String str1, int intPole) {
        super(charPole, str1);
        setChar1Str1Int1(super.charPole, super.str1, intPole);
    }

    //конструктор копии
    SecondSubClass(SecondSubClass copy) {
        super(copy.charPole, copy.str1);
        this.setChar1Str1Int1(copy.charPole, copy.str1, copy.intPole);
    }

    @Override
    public String toString() {
        String ThirdFieldValue =
                "\n str = " + this.getInt1();
        return super.toString() + ThirdFieldValue;
    }

    public int getInt1() {
        return intPole;
    }
}
