package Lr9;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        System.out.println("Время выполнения операции добавления arrayList = " +
                getTimeList(arrayList));
        System.out.println("Время выполнения операции добавления arrayDeque = " +
                getTimeDeque(arrayDeque));
        System.out.println("Время выполнения операции добавления treeMap = " +
                getTimeMap(treeMap));
    }

    private static long getTimeList(List<Integer> list) {
// точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
// блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
//        for (int i = 0; i < 100; i++) {
            list.add(0, i);
        }
// точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getTimeDeque(Deque<Integer> arrayDeque) {
// точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
// блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
//        for (int i = 0; i < 100; i++) {
            arrayDeque.add(i);
        }
// точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getTimeMap(Map<Integer, Integer> treeMap) {
// точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
// блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
//        for (int i = 0; i < 100; i++) {
            treeMap.put(i, i);
        }
// точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}

