package task0527;

import task0527.animal.AbilityDog;
import task0527.animal.Animal;

public class Dog extends Animal implements AbilityDog {
    private String name;
    private String catchPhrase;



    public Dog(int height, int tail, boolean predatory, String colour, String name) {
        super(height, tail, predatory, colour);
        this.name = name;
        this.catchPhrase="I AM ANGRY DOG!!!";
    }
    public Dog(int height, int tail, boolean predatory, String colour, String name,String catchPhrase) {
        super(height, tail, predatory, colour);
        this.name = name;
        this.catchPhrase=catchPhrase;
    }

    @Override
    public void say(String value) {
        System.out.print(this.name+" ");
        preparingToSay();
        System.out.println("* *  * * *"+value+"* * * * *");
        makeDuration(1000);
        System.out.println(catchPhrase+"!!!");
        makeDuration(500);
        System.out.println();
    }
}
