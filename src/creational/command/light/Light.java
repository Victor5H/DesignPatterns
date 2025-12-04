package creational.command.light;

public class Light {
    private boolean isOn;
    private final String name;
    public Light(String name){
        this.name = name;
        this.isOn=false;
    }
    public void turnOn(){
        System.out.println(name+" is turned on");
        isOn = true;
    }
    public void turnOff(){
        System.out.println(name+" is turned off");
        isOn = false;
    }
}

