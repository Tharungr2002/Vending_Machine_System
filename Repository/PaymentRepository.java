package Repository;

import Model.Transactions;

import java.util.Map;
import java.util.UUID;

public class PaymentRepository {
    Map<UUID, Transactions> transactionsMap;
    public void saveTransaction(Transactions transactions) {
        transactionsMap.put(transactions.getId(), transactions);
    }

    public Transactions getTransaction(UUID transactionId) {
        return transactionsMap.get(transactionId);
    }
}
