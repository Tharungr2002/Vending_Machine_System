package Model.State;

import Model.PaymentRequest;
import Model.Transactions;
import Model.VendingMachine;

import java.util.UUID;

public interface VendingMachineState {
    Transactions processPayment(VendingMachine vendingMachine, PaymentRequest request);
    void cancelPayment(VendingMachine machine , UUID transactionId);
    String getStateName();
}
