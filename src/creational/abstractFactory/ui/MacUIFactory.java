package creational.abstractFactory.ui;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.button.MacButton;
import creational.abstractFactory.screen.MacScreen;
import creational.abstractFactory.screen.Screen;

public class MacUIFactory implements UIFactory {
    @Override
    public Screen createWindow() {
        return new MacScreen();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
