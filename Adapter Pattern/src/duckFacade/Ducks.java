package duckFacade;

public class Ducks implements Duck {
    String name;
    
    public Ducks(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
      System.out.println("I am " + name);
        
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly");        
    }

}
