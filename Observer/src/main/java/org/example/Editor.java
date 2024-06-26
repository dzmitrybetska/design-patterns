package org.example;

import java.io.File;

public class Editor {
    private EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

    public EventManager getEvents() {
        return events;
    }

    public File getFile() {
        return file;
    }

    public void setEvents(EventManager events) {
        this.events = events;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
