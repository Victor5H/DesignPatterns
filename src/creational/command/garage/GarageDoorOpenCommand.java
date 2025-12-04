package creational.command.garage;

import creational.command.Command;

public class GarageDoorOpenCommand implements Command {
    private final Garage garage;
    public GarageDoorOpenCommand(Garage garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.open();
    }
}
