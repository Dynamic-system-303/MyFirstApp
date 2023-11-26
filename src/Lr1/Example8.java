package Lr1;
import java.time.LocalDate;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        LocalDate current_date = LocalDate.now();
        int year = current_date.getYear();

        Scanner in = new Scanner(System.in);

        System.out.println("Input age: ");
        int age = in.nextInt();

        int yearOfbirth = year - age;
        System.out.println(" Your year of birth " + yearOfbirth);
        in.close();
    }
}
