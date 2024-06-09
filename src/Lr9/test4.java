package Lr9;

import java.util.*;

public class test4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(1000000);
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        System.out.println("Время выполнения операции удаления arrayList = " +
                getTimeList(arrayList));
        System.out.println("Время выполнения операции добавления arrayDeque = " +
                getTimeDeque(arrayDeque));
        System.out.println("Время выполнения операции добавления treeMap = " +
                getTimeMap(treeMap));
    }

    private static long getTimeList(List<Integer> arrayList) {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(0, i);
        }
// точка начала отсчета времени выполнения программы
        System.out.println(arrayList.size());
        long start = System.currentTimeMillis();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
// точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        System.out.println(arrayList.size());
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getTimeDeque(Deque<Integer> arrayDeque) {
// блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
            arrayDeque.add(i);
        }
        System.out.println(arrayDeque.size());
// точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        for (int i = 500000; i > 0; i--) {
                arrayDeque.pop();
            }
// точка окончания отсчета времени выполнения программы
            long end = System.currentTimeMillis();
            System.out.println(arrayDeque.size());
// вывод в консоль времени выполнения блока кода содержащего операцию
            return end - start;
        }

        private static long getTimeMap (Map < Integer, Integer > treeMap){
// блок кода в котором выполняется операция добавления
            for (int i = 0; i < 1000000; i++) {
                treeMap.put(i, i);
            }
            System.out.println(treeMap.size());
// точка начала отсчета времени выполнения программы
            long start = System.currentTimeMillis();
            for (int i = 500000; i > 0; i--) {
                treeMap.remove(i);
            }
// точка окончания отсчета времени выполнения программы
            long end = System.currentTimeMillis();
            System.out.println(treeMap.size());
// вывод в консоль времени выполнения блока кода содержащего операцию
            return end - start;
        }
    }
