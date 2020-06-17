package diner;

public class mainTest {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        
        Light light = new Light();
        LightCommand lightCommand = new LightCommand(light);
        control.setCommand(lightCommand);
        control.buttonPressed();
        
            
        Garage garage = new Garage();
        GarageCommand garageCommand = new GarageCommand(garage);
        control.setCommand(garageCommand);
        control.buttonPressed();

    }

}
