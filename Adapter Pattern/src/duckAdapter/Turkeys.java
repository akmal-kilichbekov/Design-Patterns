package duckAdapter;

public class Turkeys implements Turkey{
    private String name;
    
    public Turkeys(String name) {
      this.name = name;
    }

    @Override
    public void gooble() {
      System.out.println("I am " + name + " I am goobling");        
    }

    @Override
    public void shortFly() {
       System.out.println("I am " + name + " I can fly only short distance");        
    }

}
