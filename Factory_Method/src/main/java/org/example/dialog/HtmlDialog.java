package org.example.dialog;

import org.example.button.Button;
import org.example.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
