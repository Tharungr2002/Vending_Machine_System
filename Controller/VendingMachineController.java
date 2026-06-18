package Controller;

import Model.Product;
import Model.State.VendingMachineState;
import Service.VendingMachineService;

import java.util.List;

public class VendingMachineController {
    private VendingMachineService vendingMachineService;

    public VendingMachineController(VendingMachineService vendingMachineService) {
        this.vendingMachineService = vendingMachineService;
    }

    //get/products
    public List<Product> getAvailableProducts() {
        List<Product> products = vendingMachineService.getAllProducts();
        return products;
    }


}
