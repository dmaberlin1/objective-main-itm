package task0502;

public interface Duration {

    default void makeDuration(int duration){
        try{
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    void makeDuration();
}
