package Service;

import Model.*;
import Model.State.VendingMachineState;
import Repository.PaymentRepository;
import Repository.VendingMachineRepository;

import java.util.Map;
import java.util.UUID;

public class PaymentService {

    private PaymentRepository paymentRepository;
    private VendingMachineRepository vendingMachineRepository;
    private InventoryRepository inventoryRepository;

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
    
    public Double calculatePrice(int quantity) {
        
        
        
        return ans;
    }

    public Double calculateAmountInserted(Map<Denomination, Integer> denominations) {
    }

    public boolean checkAvailable(Double amoountToReturn) {
    }

    public int checkProductAvailablity(UUID productId,int quantity) {
        int count = inventoryRepository.getProduct(productId);
        return count;
    }

    public void DecereaseProductCount(UUID productId, int quantity) {
    }
}
