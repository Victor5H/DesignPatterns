package creational.command;

import creational.command.garage.*;
import creational.command.light.Light;
import creational.command.light.LightOffCommand;
import creational.command.light.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
//        init lights
        Light light = new Light("Drawing room lights");
        Command turnLightsOn = new LightOnCommand(light);
        Command turnLightsOff = new LightOffCommand(light);
//        init garage
        Garage garage = new Garage();
        GarageLightsOffCommand garageLightsOffCommand = new GarageLightsOffCommand(garage);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garage);
        GarageLightsOnCommand garageLightsOnCommand = new GarageLightsOnCommand(garage);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garage);
//        remote init
        RemoteControl remoteControl = new RemoteControl();
//        setting lights
        remoteControl.setTurnOnCommand(turnLightsOn);
        remoteControl.setTurnOffCommand(turnLightsOff);
        remoteControl.pressOffButton();
        remoteControl.pressOnButton();
//        setting garage on same remote
        remoteControl.setTurnOnCommand(garageDoorOpenCommand);
        remoteControl.setTurnOffCommand(garageDoorCloseCommand);
        remoteControl.pressOffButton();
        remoteControl.pressOnButton();
        remoteControl.setTurnOnCommand(garageLightsOnCommand);
        remoteControl.setTurnOffCommand(garageLightsOffCommand);
        remoteControl.pressOnButton();
        remoteControl.pressOffButton();

    }
}
