package creational.prototype;

public class Chassis {
    private String type;

    public Chassis(String type) {
        this.type = type;
    }
    public Chassis (Chassis original){
        this.type = original.type;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "id: "+hashCode()+
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }
}
