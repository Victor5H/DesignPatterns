package creational.command.garage;

import creational.command.Command;

public class GarageLightsOffCommand implements Command {
    private final Garage garage;
    public GarageLightsOffCommand(Garage garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.lightsOff();
    }
}

