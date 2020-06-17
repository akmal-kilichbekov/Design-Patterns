
public class chocoloteBoiler {
    private static chocoloteBoiler boiler = null;
    private boolean empty;
    private boolean boiled;

    private chocoloteBoiler() {
        empty = true;
        boiled = false;
    }

    public static chocoloteBoiler getInstance() {
        if (boiler == null) {
            boiler = new chocoloteBoiler();
        }
        return boiler;
    }
    
    public void fill() {
        empty = false;
        boiled = true;
        System.out.println("We are going to fill the boiler");
    }
    
    public boolean isBoiled() {
        return boiled;
    }
    
    public boolean isEmpty() {
        return empty;
    }
    
    public void status() {
        if (boiled && !empty) {
            System.out.println("Boiler is not empty, chocolate is getting boiled");
        }else {
            System.out.println("Boiler is empty, let's boil some choco");
        }
    }
    
}
