package task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

/* 
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17


Requirements:
1. Программа должна считывать 5 чисел с клавиатуры.
2. Программа должна выводить 5 чисел, каждое с новой строки.
3. Выведенные числа должны быть отсортированы по возрастанию.
4. Вывод должен содержать те же числа, что и были введены (порядок не важен).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Integer>treeSet=new TreeSet<>();
        System.out.println("введите пять чисел подряд,  число + Enter");
        for(int i=1;i<=5;i++){
            System.out.println("введите число "+i);
            treeSet.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer integer : treeSet) {
            System.out.print(integer+" ");
        }


    }
}
