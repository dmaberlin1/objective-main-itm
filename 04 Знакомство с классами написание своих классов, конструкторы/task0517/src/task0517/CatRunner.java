package task0517;

public class CatRunner {
    public static void main(String[] args) {
        Cat blackCat = new Cat(25, 30, "black");
        Cat tom = new Cat("Tom");
        Cat cat2 = new Cat("Tomas",4,9);
        Cat whiteCat = new Cat(5, "New York,Beyker Str. 5", "white");

        System.out.println(tom.getAge());
        System.out.println(tom.getWeight());
        System.out.println( tom.getAddress());

    }
}
