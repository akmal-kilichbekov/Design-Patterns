
public class main {

    public static void main(String[] args) {
        chocoloteBoiler boiler = chocoloteBoiler.getInstance();

        boiler.status();
        boiler.fill();

        chocoloteBoiler boiler2 = chocoloteBoiler.getInstance();
        boiler2.status();

    }

}
