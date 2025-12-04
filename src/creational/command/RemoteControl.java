package creational.command;

public class RemoteControl{
    private Command turnOnCommand;
    private Command turnOffCommand;
    public void setTurnOnCommand(Command c){
        turnOnCommand = c;
    }
    public void setTurnOffCommand(Command c){
        turnOffCommand=c;
    }
    public void pressOnButton(){
        if (turnOnCommand!=null) turnOnCommand.execute();
        else {
            System.out.println("Command not set");
        }
    }
    public void pressOffButton(){
        if (turnOffCommand!=null) turnOffCommand.execute();
        else {
            System.out.println("Command not set");
        }
    }
}

