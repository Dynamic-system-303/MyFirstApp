package Lr9;

import java.util.Random;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        int[] new_array = fillArray(array, size);
        System.out.println("Размер массива равен " + Arrays.toString(new_array));

    }

    public static int[] fillArray(int[] array, int size) {
        Random random = new Random();
        array[--size] = random.nextInt(100);
        if (size == 0){
        return array;}
        return fillArray(array, size);
        }
    }

