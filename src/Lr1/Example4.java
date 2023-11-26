package Lr1;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week: ");
        String dayOfTheWeek = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input date: ");
        int date = in.nextInt();

        System.out.println("Today: " + dayOfTheWeek + ", " + date + " " + month);
        in.close();

    }
}
