package duckFacade;

public class FacadeClass implements Duck, Turkey {
    private Duck duck;
    private Turkey turkey;

    public FacadeClass(Duck duck, Turkey turkey) {
        this.duck = duck;
        this.turkey = turkey;
    }

    @Override
    public void gooble() {
        this.turkey.gooble();
    }

    @Override
    public void shortFly() {
        this.turkey.gooble();
    }

    @Override
    public void quack() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        this.duck.fly();
    }

}

