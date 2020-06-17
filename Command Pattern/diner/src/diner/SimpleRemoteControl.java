package diner;

public class SimpleRemoteControl {
    private Command command;

    public SimpleRemoteControl() {
       
    }
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void buttonPressed() {
        command.execute();
    }
}
