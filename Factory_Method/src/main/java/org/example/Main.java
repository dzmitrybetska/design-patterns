package org.example;

import org.example.dialog.Dialog;
import org.example.dialog.HtmlDialog;
import org.example.dialog.WindowsDialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        dialog.renderWindow();
    }

    public static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}