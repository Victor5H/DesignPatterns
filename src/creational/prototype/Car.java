package creational.prototype;

public class Car {
    private Engine engine;
    private Chassis chassis;
    private Exhaust exhaust;
    private int capacity;
    Car (Engine engine, Chassis chassis, Exhaust exhaust, int capacity){
        this.engine = engine;
        this.chassis = chassis;
        this.exhaust = exhaust;
        this.capacity = capacity;
    }
    Car (Car original){
        this.exhaust = new Exhaust(original.exhaust);
        this.engine = new Engine(original.engine);
        this.chassis = new Chassis(original.chassis);
        this.capacity = original.capacity;
    }
    public Car copy(){
        return new Car(this);
    }

    public Engine getEngine() {
        return engine;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Exhaust getExhaust() {
        return exhaust;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id: "+hashCode()+
                "engine=" + engine +
                ", chassis=" + chassis +
                ", exhaust=" + exhaust +
                ", capacity=" + capacity +
                '}';
    }
}
