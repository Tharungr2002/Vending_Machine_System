package Service;

import Model.Product;
import Repository.VendingMachineRepository;

import java.util.List;

public class VendingMachineService {
    private VendingMachineRepository vendingMachineRepository;

    public VendingMachineService(VendingMachineRepository vendingMachineRepository) {
        this.vendingMachineRepository = vendingMachineRepository;
    }

    public List<Product> getAllProducts() {
        return vendingMachineRepository.getAllProducts();
    }
}
