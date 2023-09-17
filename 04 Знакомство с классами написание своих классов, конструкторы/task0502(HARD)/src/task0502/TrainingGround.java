package task0502;

public class TrainingGround {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.setAge(8);
        cat1.setStrength(900);
        cat1.setWeight(4);
        cat1.getInfo();
        cat1.printCurrentStrength();

//        cat2.setAge(8);
//        cat2.setStrength(600);
//        cat2.setWeight(2);
//        cat2.getInfo();
//        cat2.printCurrentStrength();

        cat3.setAge(8);
        cat3.setStrength(900);
        cat3.setWeight(4);
        cat3.getInfo();
        cat3.printCurrentStrength();

//        cat1.fight(cat2);
        cat3.fight(cat1);
    }
}
