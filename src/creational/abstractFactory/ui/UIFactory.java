package creational.abstractFactory.ui;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.screen.Screen;

public interface UIFactory {
    Button createButton();
    Screen createWindow();
}
