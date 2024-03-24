package org.example;

import org.example.button.Button;
import org.example.checkbox.Checkbox;
import org.example.factory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
