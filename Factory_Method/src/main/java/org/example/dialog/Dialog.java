package org.example.dialog;

import org.example.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
