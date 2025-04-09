package creational.abstractFactory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.screen.Screen;
import creational.abstractFactory.ui.MacUIFactory;
import creational.abstractFactory.ui.UIFactory;
import creational.abstractFactory.ui.WindowsUIFactory;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new MacUIFactory());
        application.paint();
        application = new Application(new WindowsUIFactory());
        application.paint();
        application = new Application(new UIFactory() {
            @Override
            public Button createButton() {
                return null;
            }

            @Override
            public Screen createWindow() {
                return null;
            }
        });
    }
}
