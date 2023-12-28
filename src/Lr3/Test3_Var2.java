package Lr3;
import java.util.Arrays;
import java.util.Scanner;

public class Test3_Var2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] intFibArray = new int[number];

        intFibArray[0] = 1;
        intFibArray[1] = 1;

        int count = 2;
        while (count < number) {
            int prev = intFibArray[count - 2];
            int next = intFibArray[count - 1];
            intFibArray[count] = prev + next;
            count++;
        }

        System.out.println(Arrays.toString(intFibArray));
    }
}
