package creational.command.garage;

import creational.command.Command;

public class GarageLightsOnCommand implements Command {
    private final Garage garage;
    public GarageLightsOnCommand(Garage garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.lightsOn();
    }
}
