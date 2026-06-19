package Model.State;

import Model.PaymentRequest;
import Model.Transactions;
import Model.VendingMachine;

public interface VendingMachineState {
    Transactions processPayment(VendingMachine vendingMachine, PaymentRequest request);
    void cancelPayment();
    String getStateName();
}
