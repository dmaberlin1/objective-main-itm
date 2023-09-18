package task0603;

/* 
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).


Requirements:
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
5. Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.*/

public class Solution {
    public static void main(String[] args) {
        final int  arrLength=500_000;
        for (int i = 0; i < arrLength; i++) {
            String name="pet"+i;
            Dog dog = new Dog(name);
            Cat cat = new Cat(name);
            System.out.println(dog.getName());
            System.out.println(cat.getName());
        }

    }
}



