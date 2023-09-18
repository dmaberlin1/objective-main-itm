package task0527;

import task0527.animal.AbilityMouse;
import task0527.animal.Animal;

//без модификатора - package private
class Mouse extends Animal implements AbilityMouse {
    private String name;
    private String catchPhrase;


    public Mouse(int height, int tail, boolean predatory, String colour, String name, String catchPhrase) {
        super(height, tail, predatory, colour);
        this.name = name;
        this.catchPhrase = catchPhrase;
    }

    public Mouse(int height, int tail, boolean predatory, String colour, String name) {
        super(height, tail, predatory, colour);
        this.name=name;
        catchPhrase="I am small Mouse, give me your cheeeese";
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