package Lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        int[] arr1 = new Random().ints(size, 1, 100).toArray();
        int[] arr2 = new Random().ints(size, 1, 100).toArray();

        System.out.println("Mассив arr1 : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Mассив arr2 : ");
        System.out.println(Arrays.toString(arr2));

        int[] arrResult = findCommonElements(arr1, arr2);

        System.out.println("Mассив arrResult :");
        System.out.println(Arrays.toString(arrResult));

    }
    public static int[] findCommonElements ( int[] arr1, int[] arr2){
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                        .anyMatch(y -> y == x))
                .toArray();
    }
}
