package Lr5;

public class Task4 {

    private char tip;
    private int price;

    public Task4(char tip, int price) {
        this.tip = tip;
        this.price = price;
    }

    public Task4(double age){
        this.tip = (char) age;
        this.price = (int) ((age - this.tip) * 100);
    }

    public void showInfo(){
        System.out.println(this.tip);
        System.out.println(this.price);
    }

}
