package task0526.Human;

public class Man extends Human {
    private static final String gender="man";

    public Man(String name, int age, String address) {
        super(name, age, address);
    }

    public String getGender() {
        return gender;
    }
}
