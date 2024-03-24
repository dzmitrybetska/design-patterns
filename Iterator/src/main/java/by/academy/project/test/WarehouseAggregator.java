package by.academy.project.test;

import java.util.Iterator;

public class WarehouseAggregator {

    private final Warehouse refrigeratorWarehouse;
    private final Warehouse clothingWarehouse;

    public WarehouseAggregator(Warehouse refrigeratorWarehouse, Warehouse clothingWarehouse) {
        this.refrigeratorWarehouse = refrigeratorWarehouse;
        this.clothingWarehouse = clothingWarehouse;
    }

    public void print() {
        Iterator<Product> refrigeratorsIterator = refrigeratorWarehouse.createIterator();
        print(refrigeratorsIterator);
        Iterator<Product> clothingsIterator = clothingWarehouse.createIterator();
        print(clothingsIterator);
    }

    public void print(Iterator<Product> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public Warehouse getRefrigeratorWarehouse() {
        return refrigeratorWarehouse;
    }

    public Warehouse getClothingWarehouse() {
        return clothingWarehouse;
    }
}
