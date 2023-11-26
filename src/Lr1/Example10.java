package Lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input day of the month: ");
        int dayOfTheMonth = in.nextInt();

        System.out.println(month + " has " + dayOfTheMonth + " days");
        in.close();

    }
}
