class Flyable {
    public void fly() {}
}

class FlyB extends Flyable {
    public void fly() {
        System.out.println("B");
    }
}

class FlyC extends Flyable {
    @Override
    public void fly() {
        System.out.println("C");
    }
}

