package Repository;

import Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class VendingMachineRepository {
    Map<UUID,Product> productMap;

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>(productMap.values());
        return products;
    }
}
