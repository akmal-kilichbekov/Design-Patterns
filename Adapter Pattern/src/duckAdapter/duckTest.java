package duckAdapter;

public class duckTest {

    public static void main(String[] args) {
        // before adapter pattern usage
        Ducks ducks = new Ducks("Donald Duck");
        test(ducks);

        Turkeys turkeys = new Turkeys("Turkey tuba");
        // test(turkeys); -- here throws error as it accepts only duck type

        // with adapter pattern
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkeys);
        test(turkeyAdapter);

    }

    public static void test(Duck ducks) {
        ducks.quack();
        ducks.fly();
    }

}
