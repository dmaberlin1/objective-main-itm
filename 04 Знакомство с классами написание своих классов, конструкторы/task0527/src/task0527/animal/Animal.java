package task0527.animal;

public abstract class Animal implements Duration {
    int height;
    int tail;
    boolean predatory;
    String colour;

    public void preparingToSay(){
        System.out.println("preparing to say his catchphrase");
        makeDuration(1000);

    }

    public Animal(int height, int tail, boolean predatory, String colour) {
        this.height = height;
        this.tail = tail;
        this.predatory = predatory;
        this.colour = colour;
    }
}
