package diner;

public class GarageCommand implements Command {
    private Garage garage;
    
    public GarageCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.lightOn();
    }
}
