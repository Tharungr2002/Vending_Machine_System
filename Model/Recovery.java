package Model;

import java.util.UUID;

public class Recovery {
    private UUID id;
    private UUID vendingMachineId;
    private UUID TransactionId;
    private vendingMachineStatus status;
    private RecoveryStatus recoveryStatus;

    enum vendingMachineStatus {
        PROCESSING_PAYMENT, DISPENCING;
    }
    enum RecoveryStatus {
        PENDING, COMPLETED;
    }


}
