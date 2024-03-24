package by.academy.project.test;

import java.util.Iterator;

public class RefrigeratorWarehouseIterator implements Iterator<Product> {

    private final Product[] refrigerators;
    private int position = 0;

    public RefrigeratorWarehouseIterator(Product[] refrigerators) {
        this.refrigerators = refrigerators;
    }

    @Override
    public boolean hasNext() {
        return position < refrigerators.length && refrigerators[position] != null;
    }

    @Override
    public Product next() {
        Product product = refrigerators[position];
        position++;
        return product;
    }
}
