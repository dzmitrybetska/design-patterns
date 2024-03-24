package by.academy.project.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClothingWarehouse implements Warehouse {

    private final List<Product> clothes;

    public ClothingWarehouse() {
        clothes = new ArrayList<>();
    }

    public List<Product> getClothes() {
        return clothes;
    }

    public void addItems(Product product) {
        clothes.add(product);
    }

    @Override
    public Iterator<Product> createIterator() {
        return clothes.iterator();
    }
}
