package creational.abstractFactory.screen;

public class WindowsScreen implements Screen{
    @Override
    public void render() {
        System.out.println("Windows screen built");
    }
}
