package headFirst.decorator.beverages;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI}
    private Size size = Size.TALL;
    private String  description;
    public String getDescription(){
        return description;
    }
    public Beverage (String description){
        this.description=description;
    }
    public Beverage(){

    }
    public void setSize(Size size){
        this.size = size;
        //description = String.valueOf(getSize());
    }
    public Size getSize(){
        return this.size;
    }
    public abstract double cost();
}
