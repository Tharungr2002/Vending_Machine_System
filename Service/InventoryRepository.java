package Service;

import Model.Inventory;
import Model.Product;

import java.util.Map;
import java.util.UUID;

public class InventoryRepository {
    Map<UUID, Inventory> InventoryMap;


    public int getProduct(UUID productId) {
        for(Inventory inventory : InventoryMap.values()) {
            if(inventory.getProductId() == productId) return inventory.getQuantity();
        }
        return 0;
    }
}
