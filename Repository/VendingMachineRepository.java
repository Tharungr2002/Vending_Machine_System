package Repository;

import Model.Product;
import Model.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class VendingMachineRepository {
    Map<UUID,Product> productMap;
    Map<UUID, VendingMachine> vendingMachines;

    public VendingMachine getMachine(UUID machineId) {
        return vendingMachines.get(machineId);
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>(productMap.values());
        return products;
    }
}
