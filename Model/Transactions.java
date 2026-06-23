package Model;

import java.sql.Timestamp;
import java.util.UUID;

public class Transactions {
    private UUID id;
    private UUID productId;
    private UUID vendingMachineId;
    private Double amountRequired;
    private Double amountInserted;
    private Double changeReturned;
    private transactionStatus status;
    private Timestamp timestamp;

    public Transactions(UUID productId, UUID vendingMachineId, Double amountRequired, Double amountInserted, Double changeReturned, Timestamp timestamp) {
        this.id = UUID.randomUUID();
        this.productId = productId;
        this.vendingMachineId = vendingMachineId;
        this.amountRequired = amountRequired;
        this.amountInserted = amountInserted;
        this.changeReturned = changeReturned;
        this.status = transactionStatus.PENDING;
        this.timestamp = timestamp;
    }

    public Transactions(UUID productId, UUID id) {
        this.id = UUID.randomUUID();
        this.productId = productId;
        this.vendingMachineId = vendingMachineId;
        this.status = transactionStatus.PENDING;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public UUID getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(UUID vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public Double getAmountRequired() {
        return amountRequired;
    }

    public void setAmountRequired(Double amountRequired) {
        this.amountRequired = amountRequired;
    }

    public Double getAmountInserted() {
        return amountInserted;
    }

    public void setAmountInserted(Double amountInserted) {
        this.amountInserted = amountInserted;
    }

    public Double getChangeReturned() {
        return changeReturned;
    }

    public void setChangeReturned(Double changeReturned) {
        this.changeReturned = changeReturned;
    }

    public transactionStatus getStatus() {
        return status;
    }

    public void setStatus(transactionStatus status) {
        this.status = status;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
