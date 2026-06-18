package Model.State;

import Model.Transactions;

public class IdleState implements VendingMachineState {

    @Override
    public Transactions processPayment(Transactions transactions) {

    }

    @Override
    public void cancelPayment() {

    }

    @Override
    public String getStateName() {
        return "Idle State";
    }
}
