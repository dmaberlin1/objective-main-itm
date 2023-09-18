package task0527;

import task0527.animal.AbilityCat;
import task0527.animal.Animal;

public class Cat extends Animal implements AbilityCat {
    private String name;
    private String catchPhrase;


    public Cat(int height, int tail, boolean predatory, String colour,String name) {
        super(height, tail, predatory, colour);
        this.name = name;
        catchPhrase="I am sly cat";
    }

    public Cat(int height, int tail, boolean predatory, String colour,String name, String catchPhrase) {
        super(height, tail, predatory, colour);
        this.name = name;
        this.catchPhrase = catchPhrase;
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
