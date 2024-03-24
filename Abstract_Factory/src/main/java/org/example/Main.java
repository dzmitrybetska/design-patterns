package org.example;

import org.example.factory.GUIFactory;
import org.example.factory.MacOSFactory;
import org.example.factory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
}