package org.example;

import java.io.*;

public class FileDataSource implements DataSource {

    private final String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(data.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader fileReader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            fileReader.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new String(buffer);
    }
}
