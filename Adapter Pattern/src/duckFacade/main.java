package duckFacade;

public class main {

    public static void main(String[] args) {
        // before the facade pattern
        Duck duck = new Ducks("Donald");
        duck.quack();
        duck.fly();

        Turkey turkey = new Turkeys("Turkey");
        turkey.gooble();
        turkey.shortFly();
        
        // after the facade pattern
        FacadeClass facadeClass = new FacadeClass(duck, turkey);
        facadeClass.quack();
        facadeClass.fly();
        facadeClass.gooble();
        facadeClass.shortFly();        
    }

}
