package org.example.factory;

import org.example.button.Button;
import org.example.button.MacOsButton;
import org.example.checkbox.Checkbox;
import org.example.checkbox.MacOsCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
