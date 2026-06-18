package Model.State;

import Model.Transactions;

public class DispensingState implements VendingMachineState{

    @Override
    public Transactions processPayment(Transactions transactions) {
        return null;
    }

    @Override
    public void cancelPayment() {

    }

    @Override
    public String getStateName() {
        return "Dispensing";
    }
}
