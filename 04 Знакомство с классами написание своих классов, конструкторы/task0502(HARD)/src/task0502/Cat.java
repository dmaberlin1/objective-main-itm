package task0502;

/* 
Реализовать метод fight
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.


Requirements:
1. Класс Cat должен содержать конструктор без параметров.
2. Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
3. В классе Cat должен быть метод fight.
4. В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
5. Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
6. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.*/

import java.util.Random;

public class Cat implements Duration {
    public int age;
    public int weight;
    public int strength;
//    private double currentStrength= this.age>7? this.strength *=  0.5 : this.strength;

    public double getCurrentStrength() {
        double currentStrength = this.age > 7 ? this.strength *= 0.5 : this.strength;
        currentStrength = (this.weight > 7 || this.weight < 3) ? currentStrength * 0.8 : currentStrength;
        return currentStrength;
    }

    public void printCurrentStrength() {
        System.out.println(getCurrentStrength());
    }

    public boolean fight(Cat anotherCat) {
        System.out.println("my real strength " + this.strength);
        if ((int) getCurrentStrength() < (int) anotherCat.getCurrentStrength()) {
            makeDuration(1000);
            System.out.println("My opponent is stronger!!! But I am fight!!!");
            makeDuration(1000);
            System.out.println("I am loose this fight!!! But I am not lose war!");
            makeDuration();
            return false;
        } else if (getCurrentStrength() == anotherCat.getCurrentStrength()) {
            System.out.println("my forces and the enemy's are equal. Let's draw lots!");

            System.out.println("rolling the dice.....");
            makeDuration(1500);
            boolean random = new Random().nextInt(10) > 5;
            System.out.println("\"true\" - I win, \"false\" - win my enemy ");
            makeDuration(1000);
            System.out.println(random);
            return random;
        } else {
            System.out.println("My opponent is weakness!!! I am fight!!!");
            makeDuration(1500);
            System.out.println("I am WINNER");
            return true;
        }

    }


    public void getInfo() {
        System.out.printf("Вес: %d , Сила: %d , Возраст: %d", weight, strength, age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Cat() {
    }


    @Override
    public void makeDuration(int duration) {
        Duration.super.makeDuration(duration);
    }

    @Override
    public void makeDuration() {

    }
}
