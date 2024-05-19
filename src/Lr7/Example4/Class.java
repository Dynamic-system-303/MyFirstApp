package Lr7.Example4;

public class Class {
    //В первом классе есть открытое символьное поле
    public char charPole;

    public void setCharPole(char charPole) {
        this.charPole = charPole;
    }

    //конструктор с одним параметром
    Class(char charPole) {
        this.setCharPole(charPole);
    }

    //конструктор копии
    Class(Class copy) {
        this.setCharPole(copy.charPole);
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " char = " + this.getCharPole();
        return ClassNameAndFieldValue;
    }

    public char getCharPole() {
        return charPole;
    }
}
