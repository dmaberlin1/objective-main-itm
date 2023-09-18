package task0527;

/* 
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.


Requirements:
1. Создай класс Dog.
2. Создай класс Cat.
3. В классе Dog должно быть три переменные.
4. В классе Cat должно быть три переменные.
5. Должен быть создан хотя бы один объект типа Mouse.
6. Должен быть создан хотя бы один объект типа Dog.
7. Должен быть создан хотя бы один объект типа Cat.*/

public class Solution {
    public static void main(String[] args) {
        Dog aslor = new Dog(100, 20, true, "Red", "Aslor");
        Dog bully = new Dog(140, 25, false, "white", "bully", "Hii,  i am small bully =)");
        Cat timmy = new Cat(150, 20, true, "black", "Timmy", "I am small cat myr myr");
        Mouse tom = new Mouse(70,12,false,"grey","tom");
        timmy.say("mur mur");
        bully.say("gaw gaw");


    }



    //напишите тут ваш код
}
