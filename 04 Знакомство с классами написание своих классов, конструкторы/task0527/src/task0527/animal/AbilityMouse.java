package task0527.animal;

public interface AbilityMouse {
    String ABILITY="eat cheese";
    String CLASS="Muroids";


    void say(String value);

    private String getInfo(String ABILITY,String CLASS){
        return CLASS+" with special Ability: "+ ABILITY;
    }

}
