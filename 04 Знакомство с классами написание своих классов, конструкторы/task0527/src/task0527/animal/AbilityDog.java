package task0527.animal;

public interface AbilityDog {
    String ABILITY="mouse trapping";
    String CLASS="Wolf";

    void say(String value);

    private String getInfo(String ABILITY,String CLASS){
        return CLASS+" with special Ability: "+ ABILITY;
    }
}
