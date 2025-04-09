package solid.openClosed.shapes;

public class CalculateArea {
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        Shape square = new Square(5);
        System.out.println("Area of circle "+circle.area());
        System.out.println("Area of Square "+square.area());
    }
}
