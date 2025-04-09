package solid.openClosed.shapes;

public class Circle implements Shape{

    private int radius;
    Circle(int r){
        this.radius = r;
    }
    @Override
    public int area() {
        return (int) (Math.PI*radius*radius);
    }
}
