package Repository;

import Model.Inventory;
import Model.Product;

import java.util.Map;
import java.util.UUID;

public class InventoryRepository {
    Map<UUID, Inventory> InventoryMap;     //productid , inventory


    public int getProductCount(UUID productId) {
         return InventoryMap.get(productId).getQuantity();
    }

    public void setInventoryCount(UUID productId, int quantity) {
        Inventory inventory = InventoryMap.get(productId);
        int ans = inventory.getQuantity()-quantity;
        inventory.setQuantity(ans);
    }

}
