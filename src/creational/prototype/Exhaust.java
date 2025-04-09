package creational.prototype;

public class Exhaust {
    private String type;

    public Exhaust(Exhaust original) {
        this.type = original.type;
    }
    public Exhaust(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Exhaust{" +
                "id: "+hashCode()+
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }
}
