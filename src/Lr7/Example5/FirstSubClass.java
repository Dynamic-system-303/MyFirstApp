package Lr7.Example5;

public class FirstSubClass extends SuperClass {

    //защищенное целочисленное поле
    protected int intPole;

    public void setIntPole(int intPole) {
        this.intPole = intPole;
    }
    //конструктор с двумя параметрами
    FirstSubClass(String str, int intPole) {
        super(str);
        this.setIntPole(intPole);
    }

    //переопределен метод для отображения значений
    // полей объекта и названия класса
    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " int = \"" + this.getIntPole()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public int getIntPole() {
        return intPole;
    }
}
