package Model;

import java.util.UUID;

public class Inventory {
    private UUID productId;
    private int quantity;
    private UUID vendingMachineId;

    public Inventory(UUID productId, int quantity, UUID vendingMachineId) {
        this.productId = productId;
        this.quantity = quantity;
        this.vendingMachineId = vendingMachineId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UUID getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(UUID vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }
}
