package Lr7.Example3;

//на основе класса создается подкласс
public class SecondSubClass extends FirstSubClass {
    SecondSubClass(int intPole) {
        super(intPole);
    }

    //В третьем классе появляется открытое текстовое ноле
    public String str2;

    //метод с тремя аргументами для присваивания значений полям
    // (перегрузка метода из суперкласса)
    public void setIntCharStr(int intPole, char charPole, String str2) {
        super.intPole = intPole;
        super.charPole = charPole;
        this.str2 = str2;
    }

    //конструктор с тремя параметрами
    SecondSubClass(int intPole, char charPole, String str2) {
        super(intPole, charPole);
        setIntCharStr(intPole, charPole, str2);
    }

    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getStr2();
        return super.toString() + ThirdFieldValue;
    }

    public String getStr2() {
        return str2;
    }
}
