package org.example.factory;

import org.example.button.Button;
import org.example.button.WindowsButton;
import org.example.checkbox.Checkbox;
import org.example.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
