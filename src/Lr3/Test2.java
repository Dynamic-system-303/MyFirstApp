package Lr3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String day = in.nextLine();

        switch (day) {
            case "Понедельник":
                day = "1";
                break;
            case "Вторник":
                day = "2";
                break;
            case "Среда":
                day = "3";
                break;
            case "Четверг":
                day = "4";
                break;
            case "Пятница":
                day = "5";
                break;
            case "Суббота":
                day = "6";
                break;
            case "Воскресенье":
                day = "7";
                break;
            default:
                System.out.println("Что-то не то");
        }

            System.out.println(day);
    }
}
