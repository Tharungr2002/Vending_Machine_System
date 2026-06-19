package Model.State;

import Model.PaymentRequest;
import Model.Transactions;
import Model.VendingMachine;

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
}
