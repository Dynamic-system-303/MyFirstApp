package Lr1;
import java.time.LocalDate;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        LocalDate current_date = LocalDate.now();
        int year = current_date.getYear();

        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int yearOfbirth = in.nextInt();

        int age = year - yearOfbirth;
        System.out.println(name + ", " + age + " years old");
        in.close();
    }
}
