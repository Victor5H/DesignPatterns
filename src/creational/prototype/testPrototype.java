package creational.prototype;

public class testPrototype {
    public static void main(String[] args) {
        Engine e = new Engine("petrol","V8");
        Exhaust ex= new Exhaust("straight pipe");
        Chassis ch = new Chassis("body on ladder frame");
        Car car1 = new Car(e,ch,ex,4);
        System.out.println(car1);
        System.out.println(new Car(car1));
        System.out.println(car1.copy());
    }
}
