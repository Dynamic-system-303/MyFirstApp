package Lr3;

import java.util.Scanner;

public class Test2_Var2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.nextLine();
        int intDay;

        if (day.equals("Понедельник")) {
            intDay = 1;
        } else if (day.equals("Вторник")) {
            intDay = 2;
        } else if (day.equals("Среда")) {
            intDay = 3;
        } else if (day.equals("Четверг")) {
            intDay = 4;
        } else if (day.equals("Пятница")) {
            intDay = 5;
        } else if (day.equals("Суббота")) {
            intDay = 6;
        } else if (day.equals("Воскресенье")) {
            intDay = 7;
        } else {
            intDay = 0;
        }
        System.out.println(intDay);
    }
}
