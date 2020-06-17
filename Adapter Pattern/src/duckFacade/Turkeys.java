package duckFacade;

public class Turkeys implements Turkey{
    String name;
    
    public Turkeys(String name) {
       this.name = name;
    }

    @Override
    public void gooble() {
       System.out.println("I am " + name + " and I am goobling");        
    }

    @Override
    public void shortFly() {
        System.out.println(name + " can fly only short distances ");        
    }
   
}
