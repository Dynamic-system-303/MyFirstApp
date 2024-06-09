package Lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int[] arr = new Random().ints(size,
                1, 10).toArray();

        System.out.println("Mассив arr : ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumbers(arr);

        System.out.println("Массив arrResult :");
        System.out.println(Arrays.toString(arrResult));

    }
    public static int[] filterEvenNumbers (int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}

