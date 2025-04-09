package creational.abstractFactory.ui;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.screen.Screen;
import creational.abstractFactory.button.WindowsButton;
import creational.abstractFactory.screen.WindowsScreen;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Screen createWindow() {
        return new WindowsScreen();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
