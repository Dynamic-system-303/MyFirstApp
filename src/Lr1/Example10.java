package Lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = in.nextInt();

        int a1 = number - 1;
        int a3 = number + 1;
        int a4 = (a1+number+a3);
        int a5 = a4*a4;

        System.out.println(a1 + ", " + number + ", " + a3 + ", " + a5);
        in.close();
    }
}
