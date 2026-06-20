package Model.State;

import Model.PaymentRequest;
import Model.Transactions;
import Model.VendingMachine;

import java.util.UUID;

public class DispensingState implements VendingMachineState{

    @Override
    public Transactions processPayment(VendingMachine vendingMachine, PaymentRequest request) {
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
