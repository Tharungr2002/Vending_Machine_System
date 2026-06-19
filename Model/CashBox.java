package Model;

import java.util.Map;
import java.util.UUID;

public class CashBox {
    private UUID id;
    private UUID vendingMachineId;
    Map<Denomination, Integer> denominations;
    private Double totalMoney;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(UUID vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public Map<Denomination, Integer> getDenominations() {
        return denominations;
    }

    public void setDenominations(Map<Denomination, Integer> denominations) {
        this.denominations = denominations;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
