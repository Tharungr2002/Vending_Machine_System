package Model.State;

import Model.PaymentRequest;
import Model.Transactions;
import Model.VendingMachine;

import java.util.UUID;

public class ProcessPaymentState implements VendingMachineState{

    @Override
    public Transactions processPayment(VendingMachine vendingMachine, PaymentRequest request) {
        return null;
    }

    @Override
    public String getStateName() {
        return "ProcessPayment";
    }

    public void cancelPayment(VendingMachine machine , UUID transactionId) {

    }
}
