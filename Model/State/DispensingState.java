package Model.State;

import Model.PaymentRequest;
import Model.Transactions;
import Model.VendingMachine;

import java.util.UUID;

public class DispensingState implements VendingMachineState{

    @Override
    public Transactions processPayment(VendingMachine vendingMachine, PaymentRequest request) {
        System.out.println("Cannot process payment at dispensing state");
        return null;
    }

    public void cancelPayment(VendingMachine machine , UUID transactionId) {
        System.out.println("Cannot cancel payment at dispensing state");
    }

    @Override
    public String getStateName() {
        return "Dispensing";
    }
}
