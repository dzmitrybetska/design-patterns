package org.example.factory;

import org.example.button.Button;
import org.example.checkbox.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
