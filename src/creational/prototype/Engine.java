package creational.prototype;

public class Engine {
    private String type;
    private String name;

    public Engine(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public Engine(Engine original){
        this.type = original.type;
        this.name = original.name;
    }
    public Engine copy(){
        return new Engine(this);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Id: "+hashCode()+
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
