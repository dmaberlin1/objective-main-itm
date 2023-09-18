package task0527.animal;

public interface Duration {

    static void makeDuration1s(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Обработка исключения, если поток был прерван во время сна
            e.printStackTrace();
        }
    }

    default void makeDuration(int duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
