package creational.command.garage;


import creational.command.Command;

public class GarageDoorCloseCommand implements Command {
    private final Garage garage;
    public GarageDoorCloseCommand(Garage garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.close();
    }
}