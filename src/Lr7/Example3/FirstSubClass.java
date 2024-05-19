package Lr7.Example3;

public class FirstSubClass extends Class {
    FirstSubClass(int intPole) {
        super(intPole);
    }

    //Во втором классе появляется открытое символьное поле
    public char charPole;

    //метод с двумя параметрами для присваивания значения полям
    // (перегрузка метода из основного класса)
    public void setIntStr(int intPole, char charPole) {
        super.intPole = intPole;
        this.charPole = charPole;
    }

    //конструктор с двумя параметрами
    FirstSubClass(int intPole, char charPole) {
        super(intPole);
        this.setIntStr(intPole, charPole);
    }

    public String toString() {
        String FirstFieldValue =
                "\n str = " + this.getCharPole();
        return super.toString() + FirstFieldValue;
    }

    public char getCharPole() {
        return charPole;
    }
}
