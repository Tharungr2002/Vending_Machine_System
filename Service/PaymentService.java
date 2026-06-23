package Service;

import Model.*;
import Repository.*;

import java.util.Map;
import java.util.UUID;

public class PaymentService {

    private PaymentRepository paymentRepository;
    private VendingMachineRepository vendingMachineRepository;
    private InventoryRepository inventoryRepository;
    private ProductRepository productRepository;
    private CashBoxRepository cashBoxRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Transactions processPayment(PaymentRequest request, UUID machineId) {
        VendingMachine machine = vendingMachineRepository.getMachine(machineId);

        if(machine == null) {
            System.out.println("No vending machine exists");
        }

        Transactions transactions = machine.processPayment(request);

        if(transactions != null) {
            paymentRepository.saveTransaction(transactions);
        }
        else {
            System.out.println("payment failed");
        }
        return transactions;
    }

    public void cancelPayment(UUID transactionId, UUID machineId) {
        VendingMachine machine = vendingMachineRepository.getMachine(machineId);

        if(machine == null) {
            System.out.println("No vending machine exists");
        }
        Transactions transactions = paymentRepository.getTransaction(transactionId);
        if(transactions == null) {
            System.out.println("No transaction exist");
            return;
        }
        machine.cancelPayment(transactionId);
        transactions.setStatus(transactionStatus.CANCELLED);
    }

    public double calculatePrice(int quantity, UUID productId) {
        Product product = productRepository.getProduct(productId);
        if(product == null) {
            System.out.println("No product avialable");
        }
        double price = product.getPrice();
        return (double)price*quantity;
    }

    public Double calculateAmountInserted(Map<Denomination, Integer> denominations) {
        Double total = 0.0;

        for(Map.Entry<Denomination, Integer> entry : denominations.entrySet()) {
            Denomination denom = entry.getKey();
            Integer count = entry.getValue();
            total += denom.getValueInCents()*count;
        }
        return total;
    }

    public boolean checkAvailable(Double amountToReturn, UUID id) {
        CashBox cashBox = cashBoxRepository.getCashBox(id);
        Map<Denomination, Integer> cashBoxDenominations = cashBox.getDenominations();

        Double temp = amountToReturn;
        Denomination []values = Denomination.values();

        for(int i=values.length-1; i>=0; i--) {
            Denomination denomination = values[i];
            int availCount = cashBoxDenominations.getOrDefault(denomination,0);

            int deno = denomination.getValueInCents();

            while(availCount > 0 && temp >= deno) {
                temp -= deno;
                availCount--;
            }

        }

        return temp==0;
    }

    public int checkProductAvailablity(UUID productId,int quantity) {
        int count = inventoryRepository.getProductCount(productId);
        return count;
    }

    public void DecereaseProductCount(UUID productId, int quantity) {
        inventoryRepository.setInventoryCount(productId,quantity);
    }
}
