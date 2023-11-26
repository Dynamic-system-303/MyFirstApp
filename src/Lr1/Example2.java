package Lr1;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input firstname: ");
        String firstname = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Hello, " + firstname + " " + name + " " + surname);
        in.close();

    }
}
