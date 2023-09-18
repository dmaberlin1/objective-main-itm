package task0526.Human;

public class Woman extends Human {
    private static final String gender="woman";
    public Woman(String name, int age, String address) {
        super(name, age, address);
    }

    public String getGender() {
        return gender;
    }
}

