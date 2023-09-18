package task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

/* 
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Requirements:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить число на экран.
3. В классе должен быть метод public static void main.
4. Нельзя добавлять новые методы в класс Solution.
5. Программа должна выводить на экран максимальное из введенных N чисел.
6. Программа не должна ничего выводить на экран, если N меньше либо равно 0.*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        System.out.println("считывает с консоли число N, которое должно быть больше 0");
        int maximum = scanner.nextInt();
        if (maximum <= 0) {
            return;
        }
        System.out.println("введите " + maximum + " nums через пробел и я выведу максимальное");
        String numsInString = scannerString.nextLine();
        String[] numsArr = numsInString.split(" ");
        OptionalInt numsMax = Arrays.stream(numsArr).mapToInt(Integer::parseInt).max();
        numsMax.stream().forEach(System.out::println);
    }
}
