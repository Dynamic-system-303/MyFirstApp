package Lr7.Example5;

public class SecondSubClass extends SuperClass {

    //защищенное символьное поле
    protected char charPole;

    public void setCharPole(char charPole) {
        this.charPole = charPole;
    }
    //конструктор с двумя параметрами
    SecondSubClass(String str, char charPole) {
        super(str);
        this.setCharPole(charPole);
    }

    //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " char = \"" + this.getCharPole()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public char getCharPole() {
        return charPole;
    }
}
