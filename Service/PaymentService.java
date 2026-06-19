package Service;

import Model.PaymentRequest;
import Model.State.VendingMachineState;
import Model.Transactions;
import Model.VendingMachine;
import Repository.PaymentRepository;
import Repository.VendingMachineRepository;

import java.util.UUID;

public class PaymentService {

    private PaymentRepository paymentRepository;
    private VendingMachineRepository vendingMachineRepository;

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
}
