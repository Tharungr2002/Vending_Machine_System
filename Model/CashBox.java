package Model;

import java.util.Map;
import java.util.UUID;

public class CashBox {
    private UUID id;
    private UUID vendingMachineId;
    Map<Denomination, Integer> denominations;
    private Double totalMoney;


}
