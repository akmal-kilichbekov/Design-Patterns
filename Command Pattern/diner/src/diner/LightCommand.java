package diner;

public class LightCommand implements Command{
    private Light light;
 
    public LightCommand(Light light) {
      this.light = light; 
    }

    public void execute() {
        light.on();        
    }   
    
}
