package Repository;

import Model.Product;

import java.util.Map;
import java.util.UUID;

public class ProductRepository {
    Map<UUID, Product> productMap;


    public Product getProduct(UUID productId) {
        return productMap.get(productId);
    }
}
