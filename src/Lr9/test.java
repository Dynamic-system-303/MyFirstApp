package Lr9;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        System.out.println("Время выполнения операции поиска arrayList = " +
                getTimeList(arrayList));
        System.out.println("Время выполнения операции поиска arrayDeque = " +
                getTimeDeque(arrayDeque));
        System.out.println("Время выполнения операции поиска treeMap = " +
                getTimeMap(treeMap));
    }

    private static long getTimeList(List<Integer> list) {
// блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000001; i++) {
            list.add(i, i);
        }
        System.out.println(list.size());
//         точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        for (int a = 500000; a < 1000000; a++){
            list.get(a);
        }
// точка окончания отсчета времени выполнения программы
            long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
            return end - start;
        }

    private static long getTimeDeque(Deque<Integer> arrayDeque) {
// блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000001; i++) {
            arrayDeque.addFirst(i);
        }
        System.out.println(arrayDeque.size());
// точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        for (int a = 500000; a < 1000000; a++) {
            arrayDeque.peekFirst();
        }
// точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getTimeMap(Map<Integer, Integer> treeMap) {
// блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000001; i++) {
            treeMap.put(i, i);
        }
// точка начала отсчета времени выполнения программы
        System.out.println(treeMap.size());
        long start = System.currentTimeMillis();
        for (int a = 500000; a < 1000000; a++){
            treeMap.get(a);
        }
// точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}