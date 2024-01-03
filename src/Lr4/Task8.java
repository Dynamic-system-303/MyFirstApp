package Lr4;

import java.util.Scanner;

public class Task8 {
    public static String getEncrypString(String text, int shift) {
        char[] arrayChar = text.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        text = new String(arrayCharNew);

        return text;
    }
    public static void main(String[] args) {
        System.out.println("Введите текст для шифрования:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Введите ключ:");
        int shift = scanner.nextInt();
        String readyText = getEncrypString(text, shift);
        System.out.println("Текст после преобразования:\n" + readyText);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n):");
            char answer = scanner.next().charAt(0);
            if (answer == 'y') {System.out.println(getEncrypString(readyText, -shift)); break;
            } else if (answer == 'n') {System.out.println("До свидания!"); break;
            } else {System.out.println("Введите корректный ответ");}
        }
    }
}

