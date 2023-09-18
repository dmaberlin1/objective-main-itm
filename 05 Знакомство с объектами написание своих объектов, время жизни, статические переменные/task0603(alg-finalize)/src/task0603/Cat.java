package task0603;

class Cat {
    private String name;


    public String getName() {
        return name;
    }

    public Cat(String name) {
    this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}