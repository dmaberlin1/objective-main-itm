package task0606;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ScanEvenOrOdd {
    private static List<Integer> even;
    private static List<Integer> odd;


    public  void getEvenOrOdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String numsInString = scanner.nextLine();
        List<Integer> nums= Arrays.stream(numsInString.split("")).map(Integer::parseInt).map(Math::abs).toList();
        List<Integer> even = nums.stream().filter(num -> num % 2 == 0).toList();
        List<Integer> odd = nums.stream().filter(num -> num % 2 != 0).toList();
        System.out.print(even.size() +" even size ");
        System.out.println(odd.size() +" odd size");
        setEven(even);
        setOdd(odd);
    }

    public void getInfo(){
        System.out.println(getEven() +" Even List");
        System.out.println(getOdd() +" Odd List");
    }

    private static List<Integer> getEven() {
        return even;
    }


    private static List<Integer> getOdd() {
        return odd;
    }

    public static void setEven(List<Integer> even) {
        ScanEvenOrOdd.even=even;
    }

    public static void setOdd(List<Integer> odd) {
        ScanEvenOrOdd.odd =odd;
    }
}
