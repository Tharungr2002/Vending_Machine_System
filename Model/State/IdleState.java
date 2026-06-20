package Model.State;

import Model.PaymentRequest;
import Model.Transactions;
import Model.VendingMachine;

import java.util.UUID;

public class IdleState implements VendingMachineState {

    @Override
    public Transactions processPayment(VendingMachine vendingMachine, PaymentRequest request) {

    }

    @Override
    public void cancelPayment() {

    }

    @Override
    public String getStateName() {
        return "Idle State";
    }

    public void cancelPayment(VendingMachine machine , UUID transactionId) {

    }
}
