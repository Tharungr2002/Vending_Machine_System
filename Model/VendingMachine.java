package Model;

import Model.State.VendingMachineState;

import java.util.UUID;

public class VendingMachine {
    private String location;
    private VendingMachineState currentStatus;
    private CashBox cashBox;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public VendingMachineState getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(VendingMachineState currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Transactions processPayment(PaymentRequest request) {
        return currentStatus.processPayment(this, request);
    }

    public void cancelPayment(UUID tranactionId) {
        return currentStatus.cancelPayment(this, tranactionId);
    }
}
