package Lr5;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double age = scanner.nextDouble();

        Task4 fabric = new Task4(age);

        fabric.showInfo();

    }
}
// Напишите программу с классом, у которого есть символьное и
// целочисленное поле.
// В классе должны быть описаны версии конструктора с
// двумя аргументами (целое число и символ – определяют значения полей), а
// также с одним аргументом типа double.
// В последнем случае действительная
// часть аргумента определяет код символа (значение символьного поля), а
// дробная часть (с учетом десятых и сотых) определяет значение
// целочисленного поля.
// Например, если аргументом передается число 65.1267,
// то значением символьного поля будет символ ‘A’ с кодом 65, а целочисленное
// поле получит значение 12 (в дробной части учитываются только десятые и
// сотые).