package solid.openClosed.shapes;

public class Square implements Shape{
    private int length;
    Square(int length){
        this.length=length;
    }
    @Override
    public int area() {
        return length*length;
    }
}
