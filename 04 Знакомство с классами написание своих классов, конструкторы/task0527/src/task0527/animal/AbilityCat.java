package task0527.animal;

public interface AbilityCat  {
    String ABILITY="mouse trapping";
    String CLASS="Felis";

    default void printInfo(){}

    void say(String value);

    private String getInfo(String ABILITY,String CLASS){
        return CLASS+" with special Ability: "+ ABILITY;
    }
}
