package Model.State;

import Model.Transactions;
import Model.VendingMachine;

public interface VendingMachineState {
    Transactions processPayment(Transactions transactions);
    void cancelPayment();
    String getStateName();
}
