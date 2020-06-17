package duckAdapter;

public class Ducks implements Duck {
    private String name;
    
    public Ducks(String name) {
      this.name = name;   
    }

    @Override
    public void quack() {
        System.out.println("I am " + name + " and I am quacking !!!");
    }

    @Override
    public void fly() {
        System.out.println("I am " + name + " I am flying");
    }
}
