package Model;

import java.util.Map;
import java.util.UUID;

public class PaymentRequest {
    private UUID productId;
    private int quantity;
    private Map<Denomination, Integer> denominations;


    public UUID getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Map<Denomination, Integer> getDenominations() {
        return denominations;
    }
}
