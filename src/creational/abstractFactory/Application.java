package creational.abstractFactory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.screen.Screen;
import creational.abstractFactory.ui.UIFactory;

public class Application {
    private Button button;
    private Screen screen;

    Application (UIFactory uiFactory){
        this.button = uiFactory.createButton();
        this.screen = uiFactory.createWindow();
    }
    public void paint(){
        screen.render();
        button.build();
    }

}
