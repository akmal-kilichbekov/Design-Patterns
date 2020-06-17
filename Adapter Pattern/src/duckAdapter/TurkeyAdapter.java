package duckAdapter;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gooble();
    }

    @Override
    public void fly() {
        turkey.shortFly();
    }

}
