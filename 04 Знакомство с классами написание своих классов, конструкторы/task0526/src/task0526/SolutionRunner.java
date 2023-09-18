package task0526;

/* 
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address


Requirements:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.*/

import task0526.Human.Man;
import task0526.Human.Woman;

public class SolutionRunner {
    public static void main(String[] args) {
        Man scott = new Man("Scott", 30, "NY,Bann str.50");
        Man bill = new Man("Bill", 30, "NY,Wall str.90");
        Woman tereza = new Woman("Tereza", 31, "NY,Wall str. 60");
        Woman rebekka = new Woman("Rebekka", 31, "Florida,Carpa str. 3");

        System.out.println("rebekka.getAge() = " + rebekka.getAge());
        System.out.println("rebekka.toString() = " + rebekka);
        System.out.println(rebekka.getGender());

    }
}
