package Lr7.Example3;

public class Class {
    //в первом классе есть открытое целочисленное поле
    public int intPole;

    //метод с одним параметром для присваивания значения полю
    public void setPole(int intPole) {
        this.intPole = intPole;
    }

    //конструктор с одним параметром
    Class(int intPole) {
        this.setPole(intPole);
    }
    //Для каждого класса определите метод toString () так,
    // чтобы он возвращал строку с названием класса и значениями
    // всех полей объекта.

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " int 1 = " + this.setPole();
        return ClassNameAndFieldValue;
    }

    public int setPole() {
        return intPole;
    }
}
