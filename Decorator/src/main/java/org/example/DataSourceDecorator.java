package org.example;

public class DataSourceDecorator implements DataSource {

    private final DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
