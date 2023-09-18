package task0521;

public class CircleRunner {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
