package by.academy.project.test;

import java.util.Iterator;

public class RefrigeratorWarehouse implements Warehouse{

    private final Product[] refrigerators;
    private static final Integer MAX_ITEMS = 45;
    private int count = 0;

    public RefrigeratorWarehouse() {
        refrigerators = new Product[MAX_ITEMS];
    }

    public Product[] getRefrigerators() {
        return refrigerators;
    }

    public boolean addItem(Product product) {
        if (count >= MAX_ITEMS) {
            return false;
        } else {
            refrigerators[count] = product;
            count++;
            return true;
        }
    }

    @Override
    public Iterator<Product> createIterator() {
        return new RefrigeratorWarehouseIterator(refrigerators);
    }
}
